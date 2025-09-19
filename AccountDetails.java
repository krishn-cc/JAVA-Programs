import java.util.Scanner;
public class AccountDetails {
    String accounntName;
    long acccountnum;
    long balence;
  String  AccountType;
  long enterAmmount;
  long afterTransaction;

  
  void Details(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account holder name:");
    accounntName = sc.nextLine();
    System.out.println("Enter account number: ");
    acccountnum = sc.nextLong();
    System.out.println("Enter the balence: ");
    balence= sc.nextLong();
    System.out.println("Enter account type:");
    AccountType= sc.nextLine();
    System.out.println("Enter the amount to withdraw;");
    enterAmmount=sc.nextLong();

}
void Display(){
    System.out.println("Your account name is "+accounntName);
    System.out.println("Your account number is "+acccountnum);
    System.out.println(" Your Balence before tarnsaction is "+balence);
System.out.println("Your account type is: "+AccountType);
System.out.println("Enter the amount to withdraw"+enterAmmount);

    
}
public static void main(String[] args) {
  
       
}     
    
}

