import java.io.IOException;
import java.util.Scanner;

public class showmenuofparking {
    static int nm = -0;
    String nm1;


    public static void listaofmenuparkDumpa() throws IOException {
        rigisterOFlasbil ap = new rigisterOFlasbil();

        do {
            System.out.println(" 1= lista parkerade lastbilar");

            System.out.println(" 2= register lasbil");
            System.out.println(" 3= exit");

            Scanner sc = new Scanner(System.in);
            nm = sc.nextInt();
            switch (nm) {
                case 1:
                    ap.Showparkinglastbil();
                    break;
                case 2:
                    ap.registreraNyaLasbil();
                    break;
                case 3:
                    break;
            }



        } while (nm != 3) ;
    }
}
