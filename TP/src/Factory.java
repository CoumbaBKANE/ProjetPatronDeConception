public class Factory {

    public static CodeCracker getInstance(int choix,int number,String password)

    {
        CodeCracker Code = null;
        if(choix==1 && number==1){
            Code= SimpleBruteForce.craquage(password);
        }
        if(choix==1 && number==2){
            Code= SimpleDictionnaire.craquageDictionnaire(password);
        }
        if(choix==2 && number==1){
            Code= HashageBruteForce.Hashcraquage(password);
        }
        if(choix==2 && number==2) {
            Code = HackDictionnary.rechHashage(password);
        }




        return Code;
    }

}
