        import java.util.Scanner;
        public class ReadAllInteger {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Byte value: ");
                byte b = sc.nextByte();
                System.out.println("Enter a short value: ");
                short s = sc.nextShort();
                System.out.println("Enter an integer: ");
                int i = sc.nextInt();
                System.out.println("Enter a long value: ");
                long l = sc.nextLong();
                System.out.println("Enter a character:");
        char c = sc.next().charAt(0);
        System.out.println("Enter a float value:");
        float f =sc.nextFloat();
                System.out.println("Enter a double value:");
                double d = sc.nextDouble();
                System.out.println("You entered byte: " + b);
                System.out.println("You entered short: " + s);
                System.out.println("You entered integer: " +  i);
                System.out.println("You entered long: " + l);
                System.out.println("You entered character: " + c);
                System.out.println("You entered float: " + f);
                System.out.println("You entered double: " + d);
                


            }
            
        }
