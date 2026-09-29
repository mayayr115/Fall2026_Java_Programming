package Lab.Lab04;

public class Driver {
  public static void main(String[] args) {
    // Test 1: Default constructor
    GradeBook gb1 = new GradeBook();
    System.out.println("gb1 data = " + gb1.toString());
    System.out.println("Min = " + gb1.minGrade());
    System.out.println("Max = " + gb1.maxGrade());
    System.out.println("Average = " + gb1.averageGrade());
    System.out.println("Mode = " + gb1.modeGrade());
    System.out.println("Is Empty? " + gb1.isEmpty());
    System.out.println();

    // Test 2: Constructor with double[]
    double[] gradesDouble = { 90.0, 80.0, 95.0, 90.0 };
    GradeBook gb2 = new GradeBook(gradesDouble);
    System.out.println("gb2 data = " + gb2.toString());
    System.out.println("Min = " + gb2.minGrade());
    System.out.println("Max = " + gb2.maxGrade());
    System.out.println("Average = " + gb2.averageGrade());
    System.out.println("Mode = " + gb2.modeGrade());
    System.out.println("Is Empty? " + gb2.isEmpty());
    System.out.println();

    // Test 3: Constructor with int[]
    int[] gradesInt = { 70, 85, 90, 75 };
    GradeBook gb3 = new GradeBook(gradesInt);
    System.out.println("gb3 data = " + gb3.toString());
    System.out.println("Average = " + gb3.averageGrade());
    System.out.println("Mode = " + gb3.modeGrade());
    System.out.println();

    // Test 4: Constructor with float[] and long[]
    float[] gradesFloat = { 100.0F, 95.0F, 100.0F };
    long[] gradesLong = { 80L, 85L };
    GradeBook gb4 = new GradeBook(gradesFloat);
    GradeBook gb5 = new GradeBook(gradesLong);
    System.out.println("gb4 data = " + gb4.toString());
    System.out.println("Mode = " + gb4.modeGrade());
    System.out.println("gb5 data = " + gb5.toString());
    System.out.println("Average = " + gb5.averageGrade());
    System.out.println();

    // Decided not to use the object names gb1 or gb2 from this point on so I can run all methods at once.
    // Test 5: Using setters
    // gb6 in my program = gb1 in Example Program
    GradeBook gb6 = new GradeBook();
    // gradesDouble2 in my program = gradesDouble in Example Program
    double[] gradesDouble2 = { 90.0, 80.0, 95.0, 90.0 };
    gb6.setGrades(gradesDouble2);
    System.out.println("After setting gb6 grades:");
    System.out.println("gb6 data = " + gb6.toString());
    System.out.println("Mode = " + gb6.modeGrade());
    System.out.println();

    // Test 6: Defensive copy test
    // gb7 in my program = gb1 in Example Program
    GradeBook gb7 = new GradeBook();
    // gradesDouble3 in my program = gradesDouble in Example Program
    double[] gradesDouble3 = { 90.0, 80.0, 95.0, 90.0 };
    gb7.setGrades(gradesDouble3);
    gradesDouble3[0] = 0; // Modify original array
    System.out.println("After modifying original array:");
    System.out.printf("gb7 data = %s%n%n", gb7.toString()); // Should remain unchanged

    // Test 7: Copy constructor -- testing deep copy
    // gb8 in my program = gb1 in Example Program
    GradeBook gb8 = new GradeBook();
    double[] gradesDouble4 = { 90.0, 80.0, 95.0, 90.0 };
    // gradesDouble4 in my program = gradesDouble in Example Program
    gb8.setGrades(gradesDouble4);
    // gb9 in my program = gb2 in Example Program
    GradeBook gb9 = new GradeBook(gb8);
    double[] otherGradesDouble = { 80.0, 80.0, 12.0 };
    gb9.setGrades(otherGradesDouble);
    System.out.println("After modifying gb9 grades array array:");
    System.out.printf("gb8 data = %s%n%n", gb8.toString()); // Should remain unchanged
  }
}
