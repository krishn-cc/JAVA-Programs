class Student {
    String name;
    static String college = "KL University";

    Student(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", College:" + college);
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("DD");
        Student s2 = new Student("Spamxxzz");
        s1.displayInfo();
        s2.displayInfo();
        Student.changeCollege("IIT HYD");
        s1.displayInfo();
        s2.displayInfo();
    }
}