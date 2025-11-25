package ma.canevaz.azote.model;

/**
 * Variety group classification for citrus varieties.
 * Affects the nitrogen correction thresholds based on leaf analysis.
 */
public enum GroupeVariete {
    /**
     * Navel orange varieties (threshold: 2.35-2.55% N)
     */
    NAVEL,
    
    /**
     * Other citrus varieties (threshold: 2.20-2.40% N)
     */
    OTHER
}
