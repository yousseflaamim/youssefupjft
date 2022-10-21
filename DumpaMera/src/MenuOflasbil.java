import java.io.IOException;
import java.util.Scanner;

public  class MenuOflasbil {

   public String nam = " ";
   //chose type of lasbil
    public String typoflasbil() throws IOException {

        System.out.println("which lastbil do you have");
        System.out.println(" 1=skapbil ");
        System.out.println(" 2=latt lasbil ");
        System.out.println("3=tung lasbil");

        // scanner of input custumer choic

        Scanner scannerbil = new Scanner(System.in);
        nam = scannerbil.nextLine();



//registeration of the customer choice of truk and information
        Skåpbil skåpbil=new Skåpbil();
        Tung_Lasbil tung_lasbil=new Tung_Lasbil();
        Lätt_Lastbil lätt_lastbil=new Lätt_Lastbil();

            switch (nam) {
                case " skapbil":skåpbil.NameOflasbil();
                                skåpbil.SizOfLastbil();
                    break;
                case "latt lasbil":lätt_lastbil.NameOflasbil();
                                    lätt_lastbil.SizOfLastbil();

                    break;
                case "tung lasbil":tung_lasbil.NameOflasbil();
                                   tung_lasbil.SizOfLastbil();

                    break;


            }


            return nam;
        }

    }






