public class Students {
    String name ;
    int rollnumber;
    float marks;

void DisplayDetails(){
    System.out.println("Name: "+ name);
    System.out.println("Roll Numeber "+ rollnumber);
    System.out.println("Marks"+marks);
}
public static void main(String[] args) {
    Students s1= new Students();
    s1.name = "Dwarkesh Dubey";
    s1.rollnumber=21;
    s1.marks=76.f;
    s1.DisplayDetails();

}
}

