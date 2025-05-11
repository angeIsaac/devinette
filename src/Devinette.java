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
