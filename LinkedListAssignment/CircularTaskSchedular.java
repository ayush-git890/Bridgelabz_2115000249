import java.util.*;
class SchedularNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    SchedularNode next;
    public SchedularNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = this;
    }
}
class TaskScheduler {
    private SchedularNode head = null;
    public void addTask(int taskId, String taskName, int priority, String dueDate, boolean atEnd) {
        SchedularNode nn = new SchedularNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = nn;
        } else if (atEnd) {
            SchedularNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
        } else {
            SchedularNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            nn.next = head;
            temp.next = nn;
            head = nn;
        }
    }
    public void deleteTask(int taskId) {
		if (head == null) return;
		SchedularNode temp = head, prev = null;
		if (head.taskId == taskId) {
			if (head.next == head) {
				head = null;
			} else {
				SchedularNode last = head;
				while (last.next != head) {
					last = last.next;
				}
				last.next = head.next;
				head = head.next;
			}
			return;
		}
		while (temp.next != head) {
			if (temp.taskId == taskId) {
				prev.next = temp.next;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		if (temp.taskId == taskId) {
			prev.next = temp.next;
		}
	}
    public void viewCurrentTask() {
        if (head != null) {
            System.out.println("Current Task: " + head.taskName);
            head = head.next;
        }
    }
    public void printTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        SchedularNode temp = head;
        while (true) {
			System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
			temp = temp.next;
			if (temp == head) break;
		}
    }
    public void searchTaskByPriority(int priority) {
		if (head == null) return;
		SchedularNode temp = head;
		boolean flag = false;
		while (temp != null) {
			if (temp.priority == priority) {
				System.out.println("Found Task: " + temp.taskName);
				flag = true;
			}
			temp = temp.next;
			if (temp == head) break;
		}
		
		if (!flag) System.out.println("No tasks with given priority.");
    }
}
public class CircularTaskSchedular{
	public static void main(String args[]){
		TaskScheduler ll = new TaskScheduler();
        ll.addTask(1, "Complete Assignment", 2, "2025-02-12", true);
        ll.addTask(2, "Attend Meeting", 1, "2025-02-11", true);
        ll.addTask(3, "Submit Report", 3, "2025-02-14", true);
        ll.addTask(4, "Prepare Presentation", 2, "2025-02-13", true);
        System.out.println("here is all task ---> ");
        ll.printTask();
        System.out.println("you are viewing current task----> ");
        ll.viewCurrentTask();
        System.out.println("searching for priority no. 2...........");
        ll.searchTaskByPriority(2);
        System.out.println("Removing task id 2------> ");
        ll.deleteTask(2);
        System.out.println("Viewing Current Tasks after Removal.................");
        ll.viewCurrentTask();
	}
}