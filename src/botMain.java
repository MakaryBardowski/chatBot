import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class botMain {
    static Scanner skaner = new Scanner(System.in);
    static HashSet<String> SlowaPowitalne = new HashSet<>();
    static HashSet<String> SlowaPodmiot = new HashSet<>();
    static HashSet<String> SlowaOrzeczenie = new HashSet<>();
    static ArrayList<String> PytaniaRozpoczynajace = new ArrayList<>();


    //    static ArrayList<String>noweSlowa = new ArrayList<String>();
    static String[] noweSlowa;
    static String wpisUzytkownika;

    public static void main(String[] args) {
        slowaZdania.slowaPowitanieDodaj();
        slowaZdania.slowaPodmiotDodaj();
        slowaZdania.slowaOrzeczenieDodaj();
        slowaZdania.pytaniaRozpoczynajaceDodaj();


        System.out.println("bot: hej");

        while(true){
            mainLoop();
        }


    }


    public static String userInput() {
        wpisUzytkownika = skaner.nextLine();
        return wpisUzytkownika;

    }

    public static void mainLoop() {


        userInput();

        checkIfContains.checkIfContainsNegation();

        checkIfContains.checkIfContainsOrzeczenie(wpisUzytkownika);
        checkIfContains.checkIfContainsPodmiot(wpisUzytkownika);


    }


}





