package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument {


    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : minuscule;debut;fin");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        this.document.minuscule(debut,fin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Met en minuscule le texte entre le début et la fin saisi en paramètres";
    }
}