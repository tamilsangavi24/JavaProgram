import java.util.Scanner;

public class CricketMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scores for India and Afghanistan
        System.out.print("India score is: ");
        int indiaScore = scanner.nextInt();

        System.out.print("Afghanistan score is: ");
        int afghanistanScore = scanner.nextInt();

        // Compare scores and print the result
        if (indiaScore > afghanistanScore) {
            System.out.println("India Won");
        } else if (afghanistanScore > indiaScore) {
            System.out.println("Afghanistan Won");
        } else {
            System.out.println("Match ended with Tie");
        }

        scanner.close();
    }
}