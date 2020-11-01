import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class botMain {
    static Scanner skaner = new Scanner(System.in);
    static HashSet<String> GreetingWords = new HashSet<>();
    static HashSet<String> SubjectWords = new HashSet<>();
    static HashSet<String> PredicateWords = new HashSet<>();

    static ArrayList<String> QuestionWords = new ArrayList<>();

    static ArrayList<String> PreviousTopics = new ArrayList<>(); // arraylist, so i can randomise topics using index, moreover the bot can refer to last topic discussed


    static String userInput;

    public static void main(String[] args) {
        AddWords.AddGreetingWords();
        AddWords.AddSubjectWords();
        AddWords.AddPredicateWords();
        AddWords.AddQuestions();


        System.out.println("bot: hej");

        while(true){
            mainLoop();

            //just to check if it works
            if(PreviousTopics.size() != 0)
            System.out.println("Ostatni temat: " + PreviousTopics.get(PreviousTopics.size()-1)); // gets last topic from PreviousTopics

            //


            System.out.println(PreviousTopics);

        }


    }


    public static String userInput() {
        userInput = skaner.nextLine();
        return userInput;

    }

    public static void mainLoop() {
        userInput();

        SentenceCheckAndMake.CheckIfContainsNegation();

        SentenceCheckAndMake.CheckIfContainSubject(userInput);
        if(SentenceCheckAndMake.ContainsPodmiot){   // when the person the bot is talking to moves onto some other subject
            SentenceCheckAndMake.PrintOrzeczenie(userInput);
            SentenceCheckAndMake.PrintPodmiot(userInput);
        } else if(!SentenceCheckAndMake.ContainsPodmiot && !SentenceCheckAndMake.ContainsNegation){  // when the person the bot is talking to says something about last topic they discussed

        } else if(!SentenceCheckAndMake.ContainsPodmiot && SentenceCheckAndMake.ContainsNegation) { //when the person the bot is talking to says something about last topic they discussed but with negation

        }


    }


}





