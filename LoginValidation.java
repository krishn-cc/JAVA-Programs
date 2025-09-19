public class LoginValidation {
    static void validateLogin(String username, String password) {
        if (!username.equals("admin")  || !password.equals("password123")) {
            throw new SecurityException("Invalid username or password");
        }
        else{
            System.out.println("Login successful");

        }
    }
    public static void main(String[] args) {
        try {
            validateLogin("admin", "1111");
        }catch (SecurityException e) {
            System.out.println("error: " + e.getMessage());
        }
        try{
            validateLogin("admin", "password123");
        }catch (SecurityException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}