package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {


    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Commentaire : execute la commande ajouter.
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Ajoute le texte fourni dans le paramètre après le point virgule.";
    }

}
