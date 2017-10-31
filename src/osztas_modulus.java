import java.util.Scanner;

public class osztas_modulus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérlek adj meg egy számot:");
        int numberToDiv = scanner.nextInt();

        System.out.print("Kérlek add meg milyen számmal legyen elosztva:");
        int dividerNumber = scanner.nextInt();

        double numberDivided = (double) numberToDiv / dividerNumber;
        int numberDividedModulus = numberToDiv % dividerNumber;

        System.out.println();
        System.out.println("A normál osztás során tizedestört jön létre: " + numberToDiv + " / " + dividerNumber + " = " + numberDivided);
        System.out.println();
        System.out.println("A maradékos osztás során kerek osztás történik, és a fennmaradó maradékot kapjuk meg: "  + numberToDiv + " % " + dividerNumber + " = " + numberDividedModulus);
    }
}
