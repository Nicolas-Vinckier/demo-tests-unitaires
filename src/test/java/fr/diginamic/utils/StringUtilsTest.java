package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistance() {
        // Mettre "Jva" et voir si la distance est de 1 pour "Java"
        assertEquals(1, StringUtils.levenshteinDistance("Jva", "Java"));

        // Test avec valeurs null
        assertThrows(NullPointerException.class, () -> {
            StringUtils.levenshteinDistance(null, null);
        });

        // Entre "chat" et "chats"
        assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));

        // Entre "machins" et "machine"
        assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));

        // Entre "aviron" et "avion"
        assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));

        // Entre "distance" et "instance"
        assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));

        // Entre "chien" et "chine"
        assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
    }
}
