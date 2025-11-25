package ma.canevaz.azote.service;

import ma.canevaz.azote.model.*;

public class CalculateurAzote {

    private static final double PRELEVEMENT_HERBE = 110.0;

    private static final double NAVEL_INF = 2.35;
    private static final double NAVEL_SUP = 2.55;
    private static final double AUTRES_INF = 2.20;
    private static final double AUTRES_SUP = 2.40;

    private static final double COEFF_DEFICIT = 1.2;
    private static final double COEFF_EXCES = 0.6;

    // (1)
    public double calculExportRecolte(Variete variete, double rendement) {
        return variete.getCoefficientRecolte() * rendement;
    }

    // (2)
    public double calculExportTaille(Variete variete,
                                     IntensiteTaille intensite,
                                     GestionFeuillage gestionFeuillage) {

        boolean estClementine = variete.getNom().equalsIgnoreCase("CLEMENTINE");

        if (estClementine) {
            return valeurTailleClementine(intensite, gestionFeuillage);
        } else {
            return valeurTailleAutresVarietes(gestionFeuillage);
        }
    }

    private double valeurTailleClementine(IntensiteTaille intensite, GestionFeuillage feuille) {

        switch (intensite) {
            case FORTE:
                switch (feuille) {
                    case TOUT_ENLEVE:           return 80;
                    case FEUILLES_ENFOUIES:     return 25;
                    case FEUILLES_NON_ENFOUIES: return 50;
                }
            case MOYENNE:
                switch (feuille) {
                    case TOUT_ENLEVE:           return 60;
                    case FEUILLES_ENFOUIES:     return 15;
                    case FEUILLES_NON_ENFOUIES: return 30;
                }
            case LEGERE:
                switch (feuille) {
                    case TOUT_ENLEVE:           return 30;
                    case FEUILLES_ENFOUIES:     return 10;
                    case FEUILLES_NON_ENFOUIES: return 20;
                }
        }
        throw new IllegalArgumentException("Combinaison invalide");
    }

    private double valeurTailleAutresVarietes(GestionFeuillage feuille) {
        switch (feuille) {
            case TOUT_ENLEVE:           return 75;
            case FEUILLES_ENFOUIES:     return 30;
            case FEUILLES_NON_ENFOUIES: return 52;
        }
        throw new IllegalArgumentException("Gestion feuillage invalide");
    }

    // (3)
    public double calculPrelevementHerbe(GestionMauvaisesHerbes gestionHerbes) {
        return gestionHerbes == GestionMauvaisesHerbes.HERBE_OCCASIONNELLE
                ? PRELEVEMENT_HERBE
                : 0;
    }

    // (5)
    public double calculCorrectionFeuilles(Variete variete, double nFeuilles) {
        double inf, sup;

        if (variete.getGroupe() == GroupeVariete.NAVEL) {
            inf = NAVEL_INF;
            sup = NAVEL_SUP;
        } else {
            inf = AUTRES_INF;
            sup = AUTRES_SUP;
        }

        if (nFeuilles < inf)
            return (inf - nFeuilles) * COEFF_DEFICIT;
        else if (nFeuilles > sup)
            return (sup - nFeuilles) * COEFF_EXCES;

        return 0;
    }

    // FULL
    public CalculAzote calculComplet(Verger verger,
                                     double rendement,
                                     IntensiteTaille intensite,
                                     GestionFeuillage gestionFeuillage,
                                     GestionMauvaisesHerbes gestionHerbes,
                                     double nFeuilles) {

        CalculAzote c = new CalculAzote();

        c.setVerger(verger);
        c.setRendementPotentielTParHa(rendement);
        c.setIntensiteTaille(intensite);
        c.setGestionFeuillage(gestionFeuillage);
        c.setGestionHerbes(gestionHerbes);
        c.setPourcentageAzoteFeuilles(nFeuilles);

        double ex1 = calculExportRecolte(verger.getVariete(), rendement);
        double ex2 = calculExportTaille(verger.getVariete(), intensite, gestionFeuillage);
        double ex3 = calculPrelevementHerbe(gestionHerbes);
        double tot = ex1 + ex2 + ex3;
        double corr = calculCorrectionFeuilles(verger.getVariete(), nFeuilles);
        double finale = tot + corr;

        c.setExportRecolte(ex1);
        c.setExportTaille(ex2);
        c.setPrelevementHerbe(ex3);
        c.setBesoinsTotaux(tot);
        c.setCorrectionFeuilles(corr);
        c.setDoseFinale(finale);

        return c;
    }
}
