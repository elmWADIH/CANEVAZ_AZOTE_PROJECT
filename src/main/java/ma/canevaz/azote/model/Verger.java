package ma.canevaz.azote.model;

/**
 * Représente un verger (parcelle) avec ses paramètres par défaut.
 */
public class Verger {

    private int id;
    private String nom;
    private Variete variete;
    private double superficieHa;

    private IntensiteTaille intensiteTailleParDefaut;
    private GestionFeuillage gestionFeuillageParDefaut;
    private GestionMauvaisesHerbes gestionHerbesParDefaut;

    public Verger(String nom,
                  Variete variete,
                  double superficieHa,
                  IntensiteTaille intensiteTailleParDefaut,
                  GestionFeuillage gestionFeuillageParDefaut,
                  GestionMauvaisesHerbes gestionHerbesParDefaut) {

        this.nom = nom;
        this.variete = variete;
        this.superficieHa = superficieHa;
        this.intensiteTailleParDefaut = intensiteTailleParDefaut;
        this.gestionFeuillageParDefaut = gestionFeuillageParDefaut;
        this.gestionHerbesParDefaut = gestionHerbesParDefaut;
    }

    public Verger() {
    }

    // ---------- Getters & Setters ----------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Variete getVariete() {
        return variete;
    }

    public void setVariete(Variete variete) {
        this.variete = variete;
    }

    public double getSuperficieHa() {
        return superficieHa;
    }

    public void setSuperficieHa(double superficieHa) {
        this.superficieHa = superficieHa;
    }

    public IntensiteTaille getIntensiteTailleParDefaut() {
        return intensiteTailleParDefaut;
    }

    public void setIntensiteTailleParDefaut(IntensiteTaille intensiteTailleParDefaut) {
        this.intensiteTailleParDefaut = intensiteTailleParDefaut;
    }

    public GestionFeuillage getGestionFeuillageParDefaut() {
        return gestionFeuillageParDefaut;
    }

    public void setGestionFeuillageParDefaut(GestionFeuillage gestionFeuillageParDefaut) {
        this.gestionFeuillageParDefaut = gestionFeuillageParDefaut;
    }

    public GestionMauvaisesHerbes getGestionHerbesParDefaut() {
        return gestionHerbesParDefaut;
    }

    public void setGestionHerbesParDefaut(GestionMauvaisesHerbes gestionHerbesParDefaut) {
        this.gestionHerbesParDefaut = gestionHerbesParDefaut;
    }
}


