public class HashageBruteForce {
    public static CodeCracker Hashcraquage(String  motDePasse){
        long startTime = System.currentTimeMillis();
        String attempt ="";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean cracked = false;
        for (char c1 : alphabet) {
            for (char c2 : alphabet) {
                for (char c3 : alphabet) {

                            attempt = "" + c1 + c2 + c3;
           é                 attempt1 ="" + c1 + c2 + c3;
                            PasswordHashing p3 = new PasswordHashing();
                            String hashPass = p3.doHashing(attempt1);
                            if (hashPass.equalsIgnoreCase(motDePasse)) {
                                cracked = true;
                                break;
                            }
                        }
                        if (cracked) break;
                    }
                    if (cracked) break;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        if (cracked) {
            System.out.println("Mot de passe trouvé! ");
            System.out.println("Il s'agit de " + attempt);
            System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
            return null;
        }else {
            System.out.println("Sorry Mot de passe non trouve!");
            System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
            return null;
        }
    }



}

