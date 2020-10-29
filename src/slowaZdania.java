public class slowaZdania {
    static public void slowaPowitanieDodaj(){

        botMain.SlowaPowitalne.add("hej"); //1
        botMain.SlowaPowitalne.add("czesc");
        botMain.SlowaPowitalne.add("hejka"); //2
        botMain.SlowaPowitalne.add("siema");  //3
        botMain.SlowaPowitalne.add("siemka");
        botMain.SlowaPowitalne.add("dzien dobry");
        botMain.SlowaPowitalne.add("co tam");  // do tego zrobic special case ze zaczyna rozmowe


    }

    static public void slowaPodmiotDodaj(){

        botMain.SlowaPodmiot.add("chemia"); //1
        botMain.SlowaPodmiot.add("chemii"); //1
        botMain.SlowaPodmiot.add("chemie"); //1

        botMain.SlowaPodmiot.add("fizyka");
        botMain.SlowaPodmiot.add("fizyki");
        botMain.SlowaPodmiot.add("fizyke");

        botMain.SlowaPodmiot.add("pies");
        botMain.SlowaPodmiot.add("psy");



    }

    static public void slowaOrzeczenieDodaj(){  // wszystkie wyrazy konczace sie na "isz"

        botMain.SlowaOrzeczenie.add("lubi"); //1
        botMain.SlowaOrzeczenie.add("nie lubi"); //1
        botMain.SlowaOrzeczenie.add("kocha"); //1
        botMain.SlowaOrzeczenie.add("uwielbia"); //1
        botMain.SlowaOrzeczenie.add("jebie"); //1




//        botMain.SlowaOrzeczenie.add("nienawidzi");
        botMain.SlowaOrzeczenie.add("robi");
        botMain.SlowaOrzeczenie.add("nie robi");



}

    static public void slowaOrzeczeniePrzeczaceDodaj(){  // wszystkie wyrazy konczace sie na "isz"

//        botMain.SlowaOrzeczeniePrzeczace.add("nie lubi"); //1
        botMain.SlowaOrzeczeniePrzeczace.add("nie kocha"); //1




//        botMain.SlowaOrzeczenie.add("nienawidzi");
        botMain.SlowaOrzeczeniePrzeczace.add("robi");
        botMain.SlowaOrzeczeniePrzeczace.add("nie robi");



    }


    static public void pytaniaRozpoczynajaceDodaj(){
        botMain.PytaniaRozpoczynajace.add("A dlaczego");
        botMain.PytaniaRozpoczynajace.add("Czemu");
        botMain.PytaniaRozpoczynajace.add("A w sumie to czemu");



//        botMain.PytaniaRozpoczynajace.add("Z jakiej racji");
//        botMain.PytaniaRozpoczynajace.add("Po jakie licho");

        botMain.PytaniaRozpoczynajace.add("A czemu");

    }
}
