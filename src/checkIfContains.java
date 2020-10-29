import java.util.Collections;


public class checkIfContains {


    public static boolean ContainsNegation = false;
    private static String[] ciag;

    public static void checkIfContainsGreetings(String wpisUzytkownika) {

        for (String i : botMain.SlowaPowitalne) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
            if (wpisUzytkownika.contains(i)) {                              //
                System.out.println("bot: co tam?");

                break;

            }
        }
    }

    public static void checkIfContainsPodmiot(String wpisUzytkownika) {
        boolean znaSlowo = false;
        for (String i : botMain.SlowaPodmiot) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
            if (wpisUzytkownika.contains(i)) {                              //
                System.out.println(" " + i + "?");
//                znaSlowo = true;
                break;
            } else {
//                znaSlowo = false;
//

            }

        }


//        if (znaSlowo == false) {
//            botMain.noweSlowa = wpisUzytkownika.split(" ");
//
//
//            Collections.addAll(botMain.SlowaPodmiot, botMain.noweSlowa);
//
//        }

    }


    public static void checkIfContainsOrzeczenie(String wpisUzytkownika) {
        boolean znaSlowo = false;
        for (String i : botMain.SlowaOrzeczenie) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
            if (wpisUzytkownika.contains(i)) {                              //

                System.out.print("bot:  " + botMain.PytaniaRozpoczynajace.get((int) (Math.random() * botMain.PytaniaRozpoczynajace.size())));
                if (ContainsNegation) {
                    System.out.print(" nie");
                }
                System.out.print(" " + i + "sz");
//                znaSlowo = true;
                break;
            } else {
//                znaSlowo = false;


            }

        }


//        if (znaSlowo == false) {

//            botMain.noweSlowa = wpisUzytkownika.split(" ");
//
//
//            Collections.addAll(botMain.SlowaOrzeczenie, botMain.noweSlowa);

//        }

    }




    public static boolean checkIfContainsNegation() {
        ContainsNegation = false;
        ciag = botMain.wpisUzytkownika.split(" ");
        for (int i = 0; i <= ciag.length - 1; i++) {
            if (ciag[i].equals("nie")) {
                ContainsNegation = true;
                System.out.println("Zawiera Negacje");
                return ContainsNegation;
            }
        }
        return ContainsNegation;
    }


}
