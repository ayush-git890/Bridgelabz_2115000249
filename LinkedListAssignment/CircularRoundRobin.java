import java.util.*;
class RobinNode {
    int processID;
    int burstTime;
    int priority;
    RobinNode next;
    public RobinNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = this;
    }
}
class RoundRobinScheduler {
    private RobinNode head = null;
    private RobinNode tail = null;
    private int tq;
    public RoundRobinScheduler(int tq) {
        this.tq = tq;
    }
    public void addProcess(int processID, int burstTime, int priority) {
        RobinNode np = new RobinNode(processID, burstTime, priority);
        if (head == null) {
            head = np;
            tail = np;
        } else {
            tail.next = np;
            np.next = head;
            tail = np;
        }
    }
    public void executingProcess() {
        if (head == null) {
            System.out.println("no process is executed here................");
            return;
        }
        int totalWT = 0, totalTT = 0, flag = 0;
        RobinNode curr = head;
        while (head != null) {
            if (curr.burstTime > 0) {
                int executionTime = Math.min(curr.burstTime, tq);
                System.out.println("Executing Process " + curr.processID + " for " + executionTime + " units");
                curr.burstTime -= executionTime;
                if (curr.burstTime == 0) {
                    System.out.println("hence process is now completed............");
                    totalTT += executionTime;
                    totalWT += totalTT - executionTime;
                    flag++;
                    deleteProcess(curr.processID);
                }
            }
            curr = curr.next;
            if (head == null) break;
        }
        
        System.out.println("avg waiting time--> " + (double) totalWT / flag);
        System.out.println("avg turnaround time--> " + (double) totalTT / flag);
    }
    public void deleteProcess(int processID) {
		if (head == null) return;		
		RobinNode curr = head, prev = tail;
		if (curr.processID == processID) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				tail.next = head;
			}
			return;
		}
		while (curr.next != head) {
			prev = curr;
			curr = curr.next;
			if (curr.processID == processID) {
				prev.next = curr.next;
				if (curr == tail) {
					tail = prev;
				}
				return;
			}
		}
    }
}
public class CircularRoundRobin{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("here please enter quantum time--> ");
        int tq = scanner.nextInt();
        RoundRobinScheduler ll = new RoundRobinScheduler(tq);      
        ll.addProcess(1, 10, 2);
        ll.addProcess(2, 5, 1);       
        System.out.println("round robin starting here---> ");
        ll.executingProcess();
    }
}