import java.util.*;
class SocialNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    SocialNode next;
    public SocialNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
class SocialMedia {
    private SocialNode head;
    public void addUser(int userId, String name, int age) {
        SocialNode nu = new SocialNode(userId, name, age);
        if (head == null) {
            head = nu;
        } else {
            SocialNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nu;
        }
        System.out.println("user added here successfully.......");
    }
    public SocialNode searchUser(int userId) {
        SocialNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void addFriend(int userId1, int userId2) {
        SocialNode u1 = searchUser(userId1);
        SocialNode u2 = searchUser(userId2);
        if (u1 != null && u2 != null) {
            u1.friendIds.add(userId2);
            u2.friendIds.add(userId1);
            System.out.println("friend connection added.................");
        } else {
            System.out.println("user not found...............");
        }
    }
    public void deleteFriend(int userId1, int userId2) {
        SocialNode u1 = searchUser(userId1);
        SocialNode u2 = searchUser(userId2);
        if (u1 != null && u2 != null) {
            u1.friendIds.remove(Integer.valueOf(userId2));
            u2.friendIds.remove(Integer.valueOf(userId1));
            System.out.println("friend connection removed.................");
        } else {
            System.out.println("user not found...............");
        }
    }
    public void findMutualFriends(int userId1, int userId2) {
        SocialNode u1 = searchUser(userId1);
        SocialNode u2 = searchUser(userId2);
        if (u1 != null && u2 != null) {
            Set<Integer> hs = new HashSet<>(u1.friendIds);
            hs.retainAll(u2.friendIds);
            System.out.println("Mutual friends: " + hs);
        } else {
            System.out.println("user not found...............");
        }
    }
    public void displayFriends(int userId) {
        SocialNode user = searchUser(userId);
        if (user != null) {
            System.out.println(user.name + "'s friends: " + user.friendIds);
        } else {
            System.out.println("user not found...............");
        }
    }
    public void searchUser(String name) {
        SocialNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User found: " + temp.name + " (ID: " + temp.userId + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("user not found...............");
    }
    public void countFriends(int userId) {
        SocialNode user = searchUser(userId);
        if (user != null) {
            System.out.println(user.name + " has " + user.friendIds.size() + " friends.");
        } else {
            System.out.println("user not found...............");
        }
    }
}
public class SinglySocialMedia{
	public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Aayush", 50);
        sm.addUser(2, "rohit", 47);
        sm.addUser(3, "mohit", 20);
        
        sm.addFriend(1, 2);
        sm.addFriend(2, 3);
		System.out.println("here we are displaying the data of rohit friends.......");
        sm.displayFriends(2);
		System.out.println("finding mutual frinds..........");
        sm.findMutualFriends(1, 3);
		System.out.println("counting..............");
        sm.countFriends(2);
		System.out.println("searching aayush........");
        sm.searchUser("Aayush");
    }
}