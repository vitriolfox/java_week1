public class arrays {
    public static void main(String[] args) {
        int[][] tomb;
        tomb = new int[10][9];
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                tomb[i][j] = j + 1;
            }
        }
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
