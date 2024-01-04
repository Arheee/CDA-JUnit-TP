package fr.arheee.demo.exercices.tp2;

public abstract class Salarie {
    private Salaire salaire;
    private Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public void travailler(double heures) {
            heures = 151.67;
        double salaireRecu = salaire.payer(heures);

        System.out.println("Le salarié " + identite.getNom() + " " + identite.getPrenom() +
                " a travaillé " + heures + " heures et a perçu " + salaireRecu + " euros");
    }

    public void demenager(Adresse nouvelleAdresse) {
        identite.setAdresse(nouvelleAdresse);
    }

    public void augmenter(double pourcentageAugmentation) {
        double nouveauTauxHoraire = salaire.getTauxHoraire() * (1 + pourcentageAugmentation / 100);
        salaire.setTauxHoraire(nouveauTauxHoraire);
    }

    @Override
    public String toString() {
        return "Salarie " + "salaire=" + salaire + ", identite=" + identite ;
    }
}