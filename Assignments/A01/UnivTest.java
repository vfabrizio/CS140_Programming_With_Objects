package assignment01;

public class UnivTest {
    public static void main(String[] args) {
        University univ1 = new University("Binghamton University", 
           "Binghamton");

        University univ2 = new University("Brown University", "Providence");

        System.out.println(univ1.getName() + ", " + univ1.getCity());
        System.out.println(univ2.getName() + ", " + univ2.getCity());
    }
}