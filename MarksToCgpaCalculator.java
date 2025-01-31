import java.util.Scanner;
public class MarksToCgpaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double totalGradePoints = 0;
        double totalCredits = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            System.out.print("Enter credits for subject " + i + ": ");
            double credits = scanner.nextDouble();
            double gradePoint = marksToGradePoint(marks);
            totalGradePoints += gradePoint * credits;
            totalCredits += credits;
        }
        double cgpa = totalGradePoints / totalCredits;
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
        scanner.close();
    }
       private static double marksToGradePoint(int marks) {
        if (marks >= 91) return 10;
        else if (marks >= 81) return 9;
        else if (marks >= 71) return 8;
        else if (marks >= 61) return 7;
        else if (marks >= 51) return 6;
        else if (marks >= 41) return 5;
        else return 0; 
    }
}
