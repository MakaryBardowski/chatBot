
//todo: jesli napisze " nie lubie" to bot odpisze " a dlaczego nie lubisz", bez podmiotu (naprawic)
//todo: rozne typy rozmow (nie tylko dlaczego lubisz/nie lubisz)
//todo: poczucie humoru


public class SentenceCheckAndMake {
    public static boolean ContainsPodmiot = false;

    public static boolean ContainsNegation = false;
    private static String[] ciag;


    public static boolean PrintPodmiot(String userInput) {
        ContainsPodmiot = false;
        for (String i : botMain.SubjectWords) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
            if (userInput.contains(i)) {                              //
                System.out.println(" " + i + "?");
                botMain.PreviousTopics.add(i);


                ContainsPodmiot = true;
                return ContainsPodmiot;
            }
        }


        return ContainsPodmiot;
    }


    public static boolean CheckIfContainSubject(String userInput) {
        ContainsPodmiot = false;
        for (String i : botMain.SubjectWords) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
            if (userInput.contains(i)) {                              //
                ContainsPodmiot = true;
                return ContainsPodmiot;
            }
        }


        return ContainsPodmiot;
    }


    public static void PrintOrzeczenie(String userInput) {
        String predicate;
        for (String i : botMain.PredicateWords) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
            if (userInput.contains(i)) {                              //

                System.out.print("bot:  " + botMain.QuestionWords.get((int) (Math.random() * botMain.QuestionWords.size())));
                if (ContainsNegation) {
                    System.out.print(" nie");
                }
                predicate = i;  // just for programmers convenience


                if(predicate.charAt(predicate.length()-1) == 'i' ^ predicate.charAt(predicate.length()-1) == 'a'^ (predicate.charAt(predicate.length()-1) == 'e' && predicate.charAt(predicate.length()-2) == 'i')){
                    predicate = predicate + "sz";
                } else if(predicate.charAt(predicate.length()-1) == 'e'){
                    predicate = predicate.substring(0,predicate.length()-1);
                    predicate = predicate + "isz";
                }

                System.out.print(" "+ predicate);

                break;
            }

        }

    }


    public static boolean CheckIfContainsNegation() {
        ContainsNegation = false;
        ciag = botMain.userInput.split(" ");
        for (int i = 0; i <= ciag.length - 1; i++) {
            if (ciag[i].equals("nie")) {
                ContainsNegation = true;
                System.out.println("Zawiera Negacje");
                return ContainsNegation;
            }
        }
        return ContainsNegation;
    }


//    public static String PredicateModification(String userInput){
//        for (String i : botMain.PredicateWords) {  // to samo co                                for (int i =0; i < Slowa.size(); i++){
//            if (userInput.contains(i)) {                              //
//                for (String j : botMain.PredicateRootWords){
//                    System.out.println(j);
//                }
//
//
//                break;
//            }
//
//        }
//        return userInput;
//    }


}
