public class Exceptionhandling2 {
    
    public static void main(String[] args){
        try{
            int a[]=new int[5];
            System.out.println(a[10]);

        }
        catch(ArithmeticException e){
            System.out.println("error: Division by zero is not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error: Array out of bound Exception");
        }
       catch(Exception e){
            System.out.println("Parent exception"); 
        }
        finally{
            System.out.println("execution completed");
        }
    }
}
