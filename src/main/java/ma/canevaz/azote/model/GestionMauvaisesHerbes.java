package ma.canevaz.azote.model;

/**
 * Weed/grass management strategy in the orchard.
 * Affects nitrogen uptake competition from grass.
 */
public enum GestionMauvaisesHerbes {
    /**
     * Occasional grass present (Herbe occasionnelle) - 110 units N uptake
     */
    HERBE_OCCASIONNELLE,
    
    /**
     * Regular weeding or tilling (Désherbage ou labour) - 0 units N uptake
     */
    DESHERBAGE_OU_LABOUR
}
