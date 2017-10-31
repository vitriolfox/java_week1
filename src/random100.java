import java.util.Arrays;

public class random100 {
    public static void main(String[] args) {

        int[] random100 = new int[100];

        for (int i = 0; i < random100.length; i++) {
            random100[i] = (int) Math.floor(Math.random() * 1000 + 1);
            System.out.print(random100[i] + " ");
        }
        Arrays.sort(random100);
        System.out.println();
        System.out.println("Minimum = " + random100[0]);
        System.out.println("Maximum = " + random100[random100.length-1]);
    }
}
