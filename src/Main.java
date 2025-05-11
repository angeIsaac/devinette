/**
 * La classe Main contient le point d'entrée du programme qui
 * implémente un jeu interactif de devinette où
 * l'utilisateur tente de deviner un nombre généré aléatoirement
 * avec des indications fournies après chaque tentative.
 * Le jeu permet à l'utilisateur jusqu'à 10 tentatives pour deviner le nombre correct.
 * Le programme interagit avec l'utilisateur via la console d'entrée et de sortie –
 * Invite l'utilisateur à entrer un nombre.
 * - Fournit des indices indiquant si le nombre cible est plus grand ou plus petit que
 *   la tentative de l'utilisateur.
 * - Le jeu se termine lorsque l'utilisateur devine correctement le nombre
 *   ou dépasse le nombre maximum de tentatives autorisées.
 * - Félicite l'utilisateur lorsqu'il devine le nombre correct.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Devinette jeux = new Devinette();
        int compteur = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        int userIput = input.nextInt();
        while(compteur < 10){
            if(jeux.isWinn(userIput)){
                System.out.println("Bravo vous avez gagné");
                break;
            }else{
                System.out.println(jeux.indice(userIput));
                compteur++;
                System.out.println("vous avez pas trouvé le nombre \nVeuillez reessayer s'il vous plait");
                userIput = input.nextInt();
            }
        }
        if(compteur == 10){
            System.out.println("vous avez perdu");
        }
    }
}