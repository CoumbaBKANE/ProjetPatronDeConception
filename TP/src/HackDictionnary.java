import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class HackDictionnary {
    public static CodeCracker rechHashage(String motDePasse){
        long startTime = System.currentTimeMillis();
       String path = "C:\\Users\\DELL\\Documents\\DIC1_Info_2nd_sem\\Patron_De_Conception\\ListePasswords.txt";
       String line = "";
      // int val = 0;
       try{
           BufferedReader br = new BufferedReader(new FileReader(path));
           PasswordHashing p2 = new PasswordHashing();
           String hashPass = p2.doHashing(motDePasse);
           while((line = br.readLine()) != null){
               PasswordHashing p = new PasswordHashing();
               String hash = p.doHashing(line);
              if (hashPass.equalsIgnoreCase(hash)){
                  long endTime = System.currentTimeMillis();
                  long executionTime = endTime - startTime;
                  System.out.println("Mot de passe trouvé");
                  System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
                  return null;
              }
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Mot de passe non trouvé");
        System.out.println("Temps d'exécution : " + executionTime + " millisecondes");
        return null;
    }
}
