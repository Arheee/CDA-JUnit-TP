package fr.arheee.demo.exercices.tp2;

public class Salaire {
    private double tauxHoraire;

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public Salaire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    /**
     * Calcul du salaire en fonction du nombre d'heures travaillées
     * @param heures = heures effectué par le salarié
     * @return la tune $$$$$
     */
    public double payer(double heures) {
        if (heures <= 151.67) {
            return tauxHoraire * heures;
        } else {
            return calculerSalaireAvecHeuresSupplementaires(heures);
        }
    }

    /**
     * Calcul du salaire avec heures Sup payé 25% plus cher pour les vacances aux Maldives
     * @param heures = les heures effectué par le salarié
     * @return encore plus de tune $$$$$
     */
    private double calculerSalaireAvecHeuresSupplementaires(double heures) {
        double heuresNormales = 151.67;
        double heuresSupplementaires = heures - heuresNormales;
        // heures supplémentaires sont payées 25% soit 1.25
        double tauxHoraireSupplementaire = tauxHoraire * 1.25;

        return (tauxHoraire * heuresNormales) + (tauxHoraireSupplementaire * heuresSupplementaires);
    }
}
