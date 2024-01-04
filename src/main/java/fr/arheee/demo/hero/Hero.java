package fr.arheee.demo.hero;


import java.util.ArrayList;
import java.util.List;

public class Hero {
    private Identity identity;
    private List<Power> powers = new ArrayList<>();

    public Hero(Identity identity, List<Power> powers){
        this.identity =identity;
        this.powers = powers;
    }

    /**
     * Le héro reprend son identité civile
     * @return une jolie phrase
     */
    public String removeCostume(){
        return "Le héro retire son costume et redevient " + identity.getIdentity();
    }

    /**
     * Le héro utilise sont pouvoir aléatoire
     * @return une jolie phrase d'attaque
     */
    public  String fight(){
        return " les hero utilise sont pouvoir : " + this.getRandowPower();
    }

    /**
     * Retourne un pouvoir aléatoire
     * @return un pouvoir
     */

    public Power getRandowPower(){
        int index = (int) Math.floor(Math.random() * powers.toArray().length);
        return this.powers.get(index);
    }

    public void setPowers(List<Power> powers){
        this.powers = powers;
    }
}
