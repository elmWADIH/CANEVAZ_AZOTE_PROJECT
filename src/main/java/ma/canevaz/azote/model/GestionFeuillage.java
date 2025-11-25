package ma.canevaz.azote.model;

/**
 * Leaf management strategy after pruning.
 * Affects nitrogen exportation calculations.
 */
public enum GestionFeuillage {
    /**
     * All leaves removed (Tout enlevé) - Maximum nitrogen export
     */
    TOUT_ENLEVE,
    
    /**
     * Leaves buried (Feuilles enfouies) - Minimum nitrogen export (nutrients returned to soil)
     */
    FEUILLES_ENFOUIES,
    
    /**
     * Leaves not buried (Feuilles non enfouies) - Medium nitrogen export
     */
    FEUILLES_NON_ENFOUIES
}
