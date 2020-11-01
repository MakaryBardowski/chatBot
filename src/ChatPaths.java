import java.util.Random;

public class ChatPaths {



    public static void ReferToLastTopic() {
        if (botMain.PreviousTopics.size() != 0) {
            if (SentenceCheckAndMake.ContainsNegation) {
                System.out.println("bot: A co sie odpierdala na " + botMain.PreviousTopics.get(botMain.PreviousTopics.size() - 1));
            } else {
                System.out.println("bot: a co tam fajnego na " + botMain.PreviousTopics.get(botMain.PreviousTopics.size() - 1));
            }
        }
    }

    public static void ReferToRandomTopic() {
        String test = "kupa";
        System.out.println(test.charAt(test.length()-1));
        if(test.charAt(test.length()-1)== 'b');
// tu moze byc "co tam" jak rozmowca odpisze "hej"

    }

}
