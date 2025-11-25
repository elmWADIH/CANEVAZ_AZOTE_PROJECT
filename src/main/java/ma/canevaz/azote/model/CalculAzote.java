package ma.canevaz.azote.model;

import java.time.LocalDateTime;

/**
 * Représente un calcul complet de fumure azotée pour un verger.
 * Contient les données d'entrée et tous les résultats (1 à 6).
 */
public class CalculAzote {

    // Données d'entrée
    private Verger verger;
    private double rendementPotentielTParHa;
    private IntensiteTaille intensiteTaille;
    private GestionFeuillage gestionFeuillage;
    private GestionMauvaisesHerbes gestionHerbes;
    private double pourcentageAzoteFeuilles;

    // Résultats du calcul
    private double exportRecolte;      // (1)
    private double exportTaille;       // (2)
    private double prelevementHerbe;   // (3)
    private double besoinsTotaux;      // (4)
    private double correctionFeuilles; // (5)
    private double doseFinale;         // (6)

    private LocalDateTime dateCalcul = LocalDateTime.now();

    public CalculAzote() {
    }

    // ---------- Getters & Setters ----------

    public Verger getVerger() {
        return verger;
    }

    public void setVerger(Verger verger) {
        this.verger = verger;
    }

    public double getRendementPotentielTParHa() {
        return rendementPotentielTParHa;
    }

    public void setRendementPotentielTParHa(double rendementPotentielTParHa) {
        this.rendementPotentielTParHa = rendementPotentielTParHa;
    }

    public IntensiteTaille getIntensiteTaille() {
        return intensiteTaille;
    }

    public void setIntensiteTaille(IntensiteTaille intensiteTaille) {
        this.intensiteTaille = intensiteTaille;
    }

    public GestionFeuillage getGestionFeuillage() {
        return gestionFeuillage;
    }

    public void setGestionFeuillage(GestionFeuillage gestionFeuillage) {
        this.gestionFeuillage = gestionFeuillage;
    }

    public GestionMauvaisesHerbes getGestionHerbes() {
        return gestionHerbes;
    }

    public void setGestionHerbes(GestionMauvaisesHerbes gestionHerbes) {
        this.gestionHerbes = gestionHerbes;
    }

    public double getPourcentageAzoteFeuilles() {
        return pourcentageAzoteFeuilles;
    }

    public void setPourcentageAzoteFeuilles(double pourcentageAzoteFeuilles) {
        this.pourcentageAzoteFeuilles = pourcentageAzoteFeuilles;
    }

    public double getExportRecolte() {
        return exportRecolte;
    }

    public void setExportRecolte(double exportRecolte) {
        this.exportRecolte = exportRecolte;
    }

    public double getExportTaille() {
        return exportTaille;
    }

    public void setExportTaille(double exportTaille) {
        this.exportTaille = exportTaille;
    }

    public double getPrelevementHerbe() {
        return prelevementHerbe;
    }

    public void setPrelevementHerbe(double prelevementHerbe) {
        this.prelevementHerbe = prelevementHerbe;
    }

    public double getBesoinsTotaux() {
        return besoinsTotaux;
    }

    public void setBesoinsTotaux(double besoinsTotaux) {
        this.besoinsTotaux = besoinsTotaux;
    }

    public double getCorrectionFeuilles() {
        return correctionFeuilles;
    }

    public void setCorrectionFeuilles(double correctionFeuilles) {
        this.correctionFeuilles = correctionFeuilles;
    }

    public double getDoseFinale() {
        return doseFinale;
    }

    public void setDoseFinale(double doseFinale) {
        this.doseFinale = doseFinale;
    }

    public LocalDateTime getDateCalcul() {
        return dateCalcul;
    }

    public void setDateCalcul(LocalDateTime dateCalcul) {
        this.dateCalcul = dateCalcul;
    }

    @Override
    public String toString() {
        return "CalculAzote{" +
                "verger=" + (verger != null ? verger.getNom() : "null") +
                ", exportRecolte=" + exportRecolte +
                ", exportTaille=" + exportTaille +
                ", prelevementHerbe=" + prelevementHerbe +
                ", besoinsTotaux=" + besoinsTotaux +
                ", correctionFeuilles=" + correctionFeuilles +
                ", doseFinale=" + doseFinale +
                '}';
    }
}

