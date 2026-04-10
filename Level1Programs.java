import java.util.Scanner;

public class Level1Programs {

    // 1. Simple Interest
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 2. Handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // 3. Rounds in triangular park
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    // 4. Positive / Negative / Zero
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    // 5. Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month > 3 && month < 6) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    // 6. Sum of n natural numbers
    public static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // 7. Smallest and Largest
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    // 8. Quotient and Remainder
    public static int[] findRemainderAndQuotient(int num, int divisor) {
        return new int[]{num % divisor, num / divisor};
    }

    // 9. Chocolates distribution
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    // 10. Wind Chill
    public static double calculateWindChill(double temp, double speed) {
        return 35.74 + 0.6215 * temp +
               (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
    }

    // 11. Trigonometric Functions
    public static double[] calculateTrigonometry(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.println("Simple Interest: " +
            calculateSimpleInterest(1000, 5, 2));

        // 2
        System.out.println("Handshakes: " +
            calculateHandshakes(5));

        // 3
        System.out.println("Rounds: " +
            calculateRounds(100, 120, 130));

        // 4
        System.out.println("Check Number: " +
            checkNumber(-5));

        // 5
        System.out.println("Spring Season: " +
            isSpringSeason(4, 10));

        // 6
        System.out.println("Sum Natural: " +
            sumNatural(10));

        // 7
        int[] res1 = findSmallestAndLargest(10, 20, 5);
        System.out.println("Smallest: " + res1[0] + ", Largest: " + res1[1]);

        // 8
        int[] res2 = findRemainderAndQuotient(10, 3);
        System.out.println("Remainder: " + res2[0] + ", Quotient: " + res2[1]);

        // 9
        int[] res3 = distributeChocolates(25, 4);
        System.out.println("Each: " + res3[0] + ", Remaining: " + res3[1]);

        // 10
        System.out.println("Wind Chill: " +
            calculateWindChill(30, 10));

        // 11
        double[] trig = calculateTrigonometry(45);
        System.out.println("Sin: " + trig[0] +
            ", Cos: " + trig[1] +
            ", Tan: " + trig[2]);

        sc.close();
    }