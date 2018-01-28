package assignment01;

import java.time.LocalDate;
import java.time.LocalTime;

public class MakeBUCourse {
    public static void main(String[] args) {
        BUCourse crs1 = new BUCourse(
            201720,
            //Format Winter yyyy10, Spring yyyy20, Summer yyyy60, Fall yyyy90
            10385,
            "CS",
            "140",
            "A 0",
            4.00,
            "Programming with Objects",
            LocalTime.of(10, 50), // hour is from 0 to 23
            LocalTime.of(11, 50), // hour, min
            "Assumes a foundation in procedural programming as covered "
                + "in CS 100 or CS 110. Provides the foundations of "
                + "software development using Java. Problem solving using "
                + "object-oriented programming techniques is emphasized. "
                + "Topics include primitive and reference data types, "
                + "variables, expressions, assignment, functions/methods, "
                + "parameters, selection, iteration, recursion, exception "
                + "handling, generic linear data structures and maps, file "
                + "types, file I/O, simple GUIs, programming to an "
                + "interface and use of inheritance, javadoc documentation, "
                + "introduction to Java threads. Required laboratory "
                + "provides supervised problem solving, programming using "
                + "the command line as well as Eclipse or Netbeans "
                + "development environments, code backup in a version "
                + "control repository, debugging and JUnit testing techniques.",
            "CS 100 or CS 110",
            72,
            "Leslie C Lander",
            LocalDate.of(2017, 1, 17),
            LocalDate.of(2017, 5, 9)
            );

        System.out.println(crs1.getSubj() + " " + crs1.getCrs() + " " + 
            crs1.getTitle() + ", " + crs1.getStartTime() + "-" + 
            crs1.getEndTime());

        BUCourse crs2 = new BUCourse(201720, 29301, "MATH", "375", "02", 4.00,
            "Funct Of Complex Variables", LocalTime.of(9, 40),
            LocalTime.of(10, 40),
            "Complex numbers, analytic functions, power series, complex "
               + "integrals, the Cauchy integral theorem, residues, poles, "
               + "contour integrals and some facts about conformal mappings. "
               + "Acquaints student with elegant theory that at same time is "
               + "useful part of mathematics.",
            "Grade of C or better in Math 323 and Math 330, or consent of "
               + "instructor.",
            25, "David P Biddle", LocalDate.of(2017, 1, 17),
            LocalDate.of(2017, 5, 9)
            );

        System.out.println(crs2.getSubj() + " " + crs2.getCrs() + " " + 
            crs2.getTitle() + ", " + crs2.getStartTime() + "-" + 
            crs2.getEndTime());
    }
}