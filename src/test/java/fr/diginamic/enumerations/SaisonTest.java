package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SaisonTest {

    @Test
    public void testValueOfLibelle() {
        // Test pour chaque libellé
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));

        // Test pour un libellé inexistant
        assertNull(Saison.valueOfLibelle("Inexistant"));

        // Test pour null
        assertNull(Saison.valueOfLibelle(null));
    }
}
