//Parancssori paraméterek kiírása n számú paraméter az n-edik sorban
public class paramaterek_n_sor_n_parameter {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(args[j] + ' ');
            }
            System.out.println();
        }
    }
}