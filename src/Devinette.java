/**
 * La classe Devinette encapsule la logique principale d'un jeu
 * de devinette basé sur la génération d'un nombre aléatoire.
 * L'objectif du joueur est de deviner ce nombre, avec la possibilité
 * de recevoir des indices par rapport à ses tentatives.
 */
public class Devinette {
    int nombreAleatoire;

    Devinette (){
        this.nombreAleatoire = (int)( Math.random() * 100 );
    }


    public boolean isWinn(int nombre){
       return nombre == this.nombreAleatoire;
    }

    public String indice(int nombre){
        if(nombre > this.nombreAleatoire){
            return "le nombre est plus grand";
        }else {
            return "le nombre est plus petit";
        }
    }
}
