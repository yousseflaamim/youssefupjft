import java.io.*;
import java.util.*;

public class rigisterOFlasbil {
    public String name;
    private double vage;


    public Object registreraNyaLasbil() throws IOException {

        MenuOflasbil veckele = new MenuOflasbil();
        veckele.typoflasbil();


            System.out.println("hello make Registration  lastbil with weight");


            //scanner input iformation weight and nmberof lasbil

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter sign board(rignumer) of your lastbil");
            name = scanner.nextLine();
            System.out.println("Enter weight of  your lastbil");
            vage = scanner.nextDouble();

            System.out.println("registration lasbil is  " + name + "and weight is " + vage+" "
                    +veckele.nam);



        ArrayList<String> las=new ArrayList<>();

           if(las.contains("skapbil")) {
               System.out.println("sorry is full you can chosse ather parking");
           }else
            las.add("rignummer "+name+" "+"vage  "+vage+" " +
                    " "+veckele.nam);


              File A = new File("a.txt");
              FileWriter re = new FileWriter(A, true);
              PrintWriter pr = new PrintWriter(re);
              pr.println(las);
              pr.close();

        System.out.println(name + "    " + vage);

        Parking_C c =new Parking_C();
        Paking_B b =new Paking_B();
        Parking_A a=new Parking_A();
        Parking_D d =new Parking_D();
        Parking_E e=new Parking_E();
//check if for weight and where can parkera
        if (vage <= 2400) {
              a.NamePaking();

        } else if (vage <= 3500) {
            b.NamePaking();


        } else if (vage <= 4500) {
            c.NamePaking();

        } else if (vage <= 8999) {
            d.NamePaking();


        } else if (vage >= 9000) {
            e.NamePaking();


        }



        return null;
    }

    public void Showparkinglastbil() throws FileNotFoundException {

        //registar data in fil

        File A = new File("a.txt");
        try {
            Scanner scanner = new Scanner(A);

            while (scanner.hasNext()) {
              String  text = scanner.nextLine();
                System.out.println(text);

                }

            }catch(Exception e){
            e.printStackTrace();
        }
    }
}