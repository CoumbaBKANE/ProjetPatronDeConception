public class SimpleBruteForce {

    public static CodeCracker craquage(String  motDePasse){
        long startTime = System.currentTimeMillis();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean cracked = false;
        for (char c1 : alphabet) {
            for (char c2 : alphabet) {
                for (char c3 : alphabet) {
                    for (char c4 : alphabet) {
                        for (char c5 : alphabet) {
                            String attempt = "" + c1 + c2 + c3 + c4 + c5;
                            if (attempt.equals(motDePasse)) {
                                cracked = true;
                                break;
                            }
                        }
                        if (cracked) break;
                    }
                    if (cracked) break;
                }
                if (cracked) break;
            }
            if (cracked) break;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        if (cracked) {
            System.out.println("Mot de passe trouvé!");
            System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
            return null;
        }else {
            System.out.println("Mot de passe non trouvé!");
            System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
            return null;
        }
    }



}
