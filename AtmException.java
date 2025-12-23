public class AtmException {
    static void withdraw(int pin,int amount,int balance) {
        if(pin !=1234){
            throw new ArithmeticException("Invalid pin");
        }
        else if(amount>balance){
            throw new ArithmeticException("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Transaction successful");            
        }
    }

    public static void main(String[] args){
        try{
            withdraw(123,5000,3000);
        }catch(ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
        try{
            withdraw(1234,5000,3000);
        }catch(ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
        try{
            withdraw(1234,2000,3000);
        }catch(ArithmeticException e){
            System.out.println("error: " + e.getMessage());
        }
        
        finally{
            System.out.println("Transaction completed");
        }
    }
}