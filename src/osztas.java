import java.util.Scanner;

public class osztas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérlek adj meg egy számot:");
        int numberToDiv = scanner.nextInt();

            int numberDivided2 = numberToDiv % 2;
            int numberDivided3 = numberToDiv % 3;

            if (numberDivided2 > 0 && numberDivided3 > 0) {
                System.out.println("Ez a szám nem osztható sem 2-vel, sem 3-mal!");
            } else if (numberDivided2 == 0 && numberDivided3 > 0) {
                System.out.println("Ez a szám osztható 2-vel, de nem osztható 3-mal!");
            } else if (numberDivided2 > 0 && numberDivided3 == 0) {
                System.out.println("Ez a szám osztható 3-mal, de nem osztható 2-vel!");
            } else if (numberDivided2 == 0 && numberDivided3 == 0) {
                System.out.println("Ez a szám osztható 2-vel és 3-mal is!");
            }

        }
    }