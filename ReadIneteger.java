import java.util.Scanner;
public class ReadIneteger {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("You entered: "+number);
    }
}
