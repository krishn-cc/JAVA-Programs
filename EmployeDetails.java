import java.util.Scanner;
public class EmployeDetails {
    String name;
    int employeeid;
    float salary;
    

void Details(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Name:");
    name = sc.nextLine();
    System.out.println("Enter Employee ID:");
    employeeid = sc.nextInt();
    System.out.println("Enter Employee Salary:");
    salary = sc.nextFloat();
}
void Display(){
    System.out.println("Employee Name: " + name);
    System.out.println("Employee ID: " + employeeid);
    System.out.println("Employee Salary: " + salary);

}
public static void main(String[]args){
    EmployeDetails emp = new EmployeDetails();

    emp.Details();
    emp.Display();
    EmployeDetails emp1 = new EmployeDetails();
    System.out.println("Enter Second Employee Details:");
    emp1.Details();
    emp1.Display();
    EmployeDetails emp2 = new EmployeDetails();
    System.out.println("Enter Third Employee Details:");
    emp2.Details();
    emp2.Display();
    
    

}
}
