package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testMethode() {
        Document d = new Document();
        d.ajouter("Bonjour");
        assertEquals("Bonjour",d.toString());
    }

}