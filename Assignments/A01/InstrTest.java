package assignment01;

public class InstrTest {
    public static void main(String[] args) {
        University univ1 = new University("Binghamton University", 
           "Binghamton");
        Instructor instr1 = new Instructor("David P Biddle", 
            univ1, InstructorCategory.PROFESSOR);

        Instructor instr2 = new Instructor("Christopher A Taylor",
            univ1, InstructorCategory.PROFESSOR);

        System.out.println(instr1.getName() + ", " + instr1.getUniv().getName()
            + ", " + instr1.getType());

        System.out.println(instr2.getName() + ", " + instr2.getUniv().getName()
            + ", " + instr2.getType());
    }
}