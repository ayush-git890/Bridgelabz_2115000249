import java.util.*;
import java.io.*;
public class P7_DataStreams {
    private static final String FILE = "students.dat";
    public static void main(String[] args) {
        studentData();
        readStudentData();
    }
    public static void studentData() {
        try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(FILE))) {
            dataOutput.writeInt(111);
            dataOutput.writeUTF("ayush");
            dataOutput.writeDouble(4);
            
            dataOutput.writeInt(222);
            dataOutput.writeUTF("rohit");
            dataOutput.writeDouble(3.9);
            
            System.out.println("hence the student data is writtend sucessfully....");
        } catch (IOException e) {
            System.out.println("there is an error here--> " + e.getMessage());
        }
    }
    public static void readStudentData() {
        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(FILE))) {
            while (dataInput.available() > 0) {
                int rollNo = dataInput.readInt();
                String name = dataInput.readUTF();
                double gpa = dataInput.readDouble();
                
                System.out.println("Student (Roll No--> " + rollNo + ", Name--> " + name + ", GPA--> " + gpa + ")");
            }
        } catch (IOException e) {
            System.out.println("there is an error here--> " + e.getMessage());
        }
    }
}