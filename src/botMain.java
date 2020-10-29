import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class botMain {
    static Scanner skaner = new Scanner(System.in);
    static HashSet<String> SlowaPowitalne = new HashSet<>();
    static HashSet<String> SlowaPodmiot = new HashSet<>();
    static HashSet<String> SlowaOrzeczenie = new HashSet<>();
    static HashSet<String> SlowaOrzeczeniePrzeczace = new HashSet<>();
    static ArrayList<String> PytaniaRozpoczynajace = new ArrayList<>();


    //    static ArrayList<String>noweSlowa = new ArrayList<String>();
    static String[] noweSlowa;
    static String wpisUzytkownika;

    public static void main(String[] args) {
        slowaZdania.slowaPowitanieDodaj();
        slowaZdania.slowaPodmiotDodaj();
        slowaZdania.slowaOrzeczenieDodaj();
        slowaZdania.pytaniaRozpoczynajaceDodaj();
        slowaZdania.slowaOrzeczeniePrzeczaceDodaj();

        System.out.println("bot: hej");
//        System.out.println("bot: Takie slowa powitalne znam:" + SlowaPowitalne);

        mainLoop();
        mainLoop();





    }



    public static String userInput() {
        wpisUzytkownika = skaner.nextLine();
        return wpisUzytkownika;

    }

    public static void mainLoop(){
        userInput();

        //test
checkIfContains.checkIfContainsNegation();
// test


            checkIfContains.checkIfContainsOrzeczeniePrzeczace(wpisUzytkownika);
            if(checkIfContains.ContainsOrzeczeniePrzeczace){
                checkIfContains.checkIfContainsPodmiot(wpisUzytkownika);
            } else {
                checkIfContains.checkIfContainsOrzeczenie(wpisUzytkownika);
                checkIfContains.checkIfContainsPodmiot(wpisUzytkownika);
            }


    }



}





