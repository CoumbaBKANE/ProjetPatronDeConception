import java.util.Scanner;

public class CodeCracker {
    public static void main(String[] args) {
        System.out.println("Quel type de mot de passe voulez vous craquer?");
        System.out.println("1-Simple");
        System.out.println("2-Haché");
        Scanner sc = new Scanner(System.in);
        Integer choix = sc.nextInt();

        System.out.println("Quel méthode souhaitez vous utiliser?");
        System.out.println("1-Bruteforce");
        System.out.println("2-Dictionnaire");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        System.out.println("Saisissez le mot de passe que vous souhaitez craquer");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.next();

        CodeCracker cracker=Factory.getInstance(choix,number,password);

    }

    }




