public class Series {
    public static void main(String[] args) {
        int terms = 5; // Number of terms to generate
        double term = 2; // Initial term
        int count = 1; // Term counter

        System.out.print("Series: ");
        while (count <= terms) {
            System.out.print(term + " ");
            term /= 2; // Divide the term by 2 to get the next term
            count++;
        }
        System.out.println();
        System.out.println("The next number in the series after " + terms + " terms is: " + term);
    }
}
