package ma.canevaz.azote;

import ma.canevaz.azote.model.*;
import ma.canevaz.azote.service.CalculateurAzote;

public class TestCalcul {

    public static void main(String[] args) {

        // 1. Create a variety (example: Navel)
        Variete navel = new Variete(
                "NAVEL",
                2.10,
                GroupeVariete.NAVEL
        );

        // 2. Create a verger
        Verger verger = new Verger(
                "Parcelle 1",
                navel,
                1.5,
                IntensiteTaille.MOYENNE,
                GestionFeuillage.TOUT_ENLEVE,
                GestionMauvaisesHerbes.HERBE_OCCASIONNELLE
        );

        // 3. Create calculator
        CalculateurAzote calc = new CalculateurAzote();

        // 4. Run full calculation
        CalculAzote result = calc.calculComplet(
                verger,
                40,      // Potential yield t/ha
                IntensiteTaille.MOYENNE,
                GestionFeuillage.TOUT_ENLEVE,
                GestionMauvaisesHerbes.HERBE_OCCASIONNELLE,
                2.1      // leaf nitrogen %
        );

        // 5. Print results
        System.out.println("Export récolte (1)     = " + result.getExportRecolte());
        System.out.println("Export taille (2)      = " + result.getExportTaille());
        System.out.println("Prélèvement herbe (3)  = " + result.getPrelevementHerbe());
        System.out.println("Besoins totaux (4)     = " + result.getBesoinsTotaux());
        System.out.println("Correction feuilles (5)= " + result.getCorrectionFeuilles());
        System.out.println("Dose finale (6)        = " + result.getDoseFinale());
    }
}
