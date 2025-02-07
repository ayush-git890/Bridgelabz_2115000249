import java.util.*;
class Person {
    String name;
    int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("name is: " + name+" your id is: " + id);
        System.out.println();
    }
}
interface Worker {// Interface Worker
    void performDuties();
}
class Chef extends Person implements Worker {// Chef class inheriting Person and implementing Worker
    String special;
    public Chef(String name, int id, String special) {
        super(name, id);
        this.special = special;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing delicious " + special + "");
    }
}
class Waiter extends Person implements Worker {// Waiter class inheriting Person and implementing Worker
    int tableNum;
    public Waiter(String name, int id, int tableNum) {
        super(name, id);
        this.tableNum = tableNum;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tableNum + " tables");
    }
}
public class P10_HybridRestaurantManagement{
	public static void main(String args[]){
		Chef c = new Chef("Ayush Agarwal", 101, "vegie maggy");
        Waiter w = new Waiter("mohit", 202, 5);
        c.displayInfo();
        c.performDuties();
        System.out.println("===============================");
        w.displayInfo();
        w.performDuties();
	}
}