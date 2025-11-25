package ma.canevaz.azote.model;

public class Variete {

    private final String nom;
    private final double coefficientRecolte; 
    private final GroupeVariete groupe;

    public Variete(String nom, double coefficientRecolte, GroupeVariete groupe) {
        this.nom = nom;
        this.coefficientRecolte = coefficientRecolte;
        this.groupe = groupe;
    }

    public String getNom() {
        return nom;
    }

    public double getCoefficientRecolte() {
        return coefficientRecolte;
    }

    public GroupeVariete getGroupe() {
        return groupe;
    }

    @Override
    public String toString() {
        return nom;
    }
}

