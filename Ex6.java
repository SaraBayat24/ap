import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("how many numbers do you want to enter: ? ");
        int tedad = in.nextInt();

        System.out.println("enter the numbers: ");
        int adad = in.nextInt();

        int min = adad;
        int max = adad;

        int zoj = 0;
        int fard = 0;

        if (adad % 2 == 0)
            zoj = 1;
        else
            fard = 1;

        int sum = adad;
        String sumString = "" + sum;

        int ghabli = adad;
        String tekrari = "";

        for (int i = 2; i <= tedad; i++) {
            adad = in.nextInt();

            if (adad < min)
                min = adad;

            if (adad > max)
                max = adad;

            if (adad % 2 == 0)
                zoj = zoj + 1;
            else
                fard = fard + 1;

            sum = sum + adad;
            sumString = sumString + " " + sum;

            if (adad == ghabli) {
                if (!tekrari.contains("" + adad)) {
                    if (tekrari.equals(""))
                        tekrari = "" + adad;
                    else
                        tekrari = tekrari + " " + adad;
                }
            }

            ghabli = adad;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("tedad zoj: " + zoj);
        System.out.println("tedad fard: " + fard);
        System.out.println("sum: " + sumString);

        if (tekrari.equals(""))
            System.out.println("adad tekrari vojood nadare");
        else
            System.out.println("adad haye tekrari: " + tekrari);

        in.close();
    }
}
