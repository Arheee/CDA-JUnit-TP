package fr.arheee.demo.calculatrice;

public class Calculatrice {
    /**@
     * Retourne la somme de deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return la somme des deux nombres
     */
    public float additionner(float premierNombre, float secondNombre){
        return premierNombre + secondNombre;
    }

    /**@
     * Retourne la différence entre deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return la difference entre les deux nombres
     */
    public float soustraction (float premierNombre, float secondNombre){
        return premierNombre - secondNombre;
    }

    /**@
     * Retourne le produit des deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return le produit des deux nombres
     */
    public float multiplier(float premierNombre, float secondNombre){
        return premierNombre * secondNombre;
    }

    /**@
     * Retourne le quotient des deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return le quotient des deux nombres
     */
    public float diviser(float premierNombre, float secondNombre){
        if(secondNombre == 0){
            throw new IllegalArgumentException("La division par zero est impossible!");
        }
        return premierNombre / secondNombre;
    }

}
