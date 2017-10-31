public class timecalculator {
    public static void main(String[] args) {
        if (args.length == 4) {
            int hour1 = Integer.parseInt(args[0]);
            int minute1 = Integer.parseInt(args[1]);
            int hour2 = Integer.parseInt(args[2]);
            int minute2 = Integer.parseInt(args[3]);

            if (hour1 > 23 || hour1 < 0 || hour2 > 23 || hour2 < 0) {
                System.out.println("Az órák értéke 0 és 24 között kell hogy legyen.");
                System.exit(1);
            } else if (minute1 > 59 || minute1 < 0 || minute2 > 59 || minute2 < 0) {
                System.out.println("A percek értéke 0 és 59 között kell hogy legyen.");
                System.exit(1);
            } else {
                int totalMinuteDiff = (hour2*60 + minute2) - (hour1*60 + minute1);
                if (totalMinuteDiff < 0) {
                    System.out.println("A különbség: 1 nap " + (24-Math.abs(totalMinuteDiff)/60) + " óra " + Math.abs(totalMinuteDiff) % 60 + " perc");
                } else {
                    System.out.println("A különbség: " + totalMinuteDiff / 60 + " óra " + totalMinuteDiff % 60 + " perc");
                }
            }
        } else {
            System.out.println("Pontosan 4 paramétert adj meg kérlek: óra perc óra perc formátumban!");
            System.exit(1);
        }
    }
}
