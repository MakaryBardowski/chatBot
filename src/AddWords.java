public class AddWords {
    static public void AddGreetingWords(){

        botMain.GreetingWords.add("hej"); //1
        botMain.GreetingWords.add("czesc");
        botMain.GreetingWords.add("hejka"); //2
        botMain.GreetingWords.add("siema");  //3
        botMain.GreetingWords.add("siemka");
        botMain.GreetingWords.add("dzien dobry");
        botMain.GreetingWords.add("co tam");  // do tego zrobic special case ze zaczyna rozmowe


    }

    static public void AddSubjectWords(){

        botMain.SubjectWords.add("chemia"); //1
        botMain.SubjectWords.add("chemii"); //1
        botMain.SubjectWords.add("chemie"); //1

        botMain.SubjectWords.add("fizyka");
        botMain.SubjectWords.add("fizyki");
        botMain.SubjectWords.add("fizyke");

        botMain.SubjectWords.add("pies");
        botMain.SubjectWords.add("psy");
        botMain.SubjectWords.add("psow");

        botMain.SubjectWords.add("muzyka");
        botMain.SubjectWords.add("muzyki");
        botMain.SubjectWords.add("muzyke");




    }

    static public void AddPredicateWords(){  // wszystkie wyrazy konczace sie na "isz"

        botMain.PredicateWords.add("lubi"); //1
        botMain.PredicateWords.add("kocha"); //1
        botMain.PredicateWords.add("uwielbia"); //1
        botMain.PredicateWords.add("robi");
        botMain.PredicateWords.add("jebie");
        botMain.PredicateWords.add("nienawidze");
        botMain.PredicateWords.add("pierdole");





}





    static public void AddQuestions(){
        botMain.QuestionWords.add("A dlaczego");
        botMain.QuestionWords.add("Czemu");
        botMain.QuestionWords.add("A w sumie to czemu");





        botMain.QuestionWords.add("A czemu");

    }
}
