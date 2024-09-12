package fr.iut.editeur.document;

public class Document {
    /*

     */
    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }

    public String getTexteDocument() {
        return texteDocument;
    }

    /**
     * @param texteDocument texte affiché.
     */
    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }


    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        setTexteDocument("");
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;

    }

    public void majuscules(int debut, int fin) {
        String partie = texteDocument.substring(debut, fin);
        partie = partie.toUpperCase();
        remplacer(debut, fin - 1, partie);
    }

    public void minuscule(int debut, int fin) {
        String partie = texteDocument.substring(debut, fin);
        partie = partie.toLowerCase();
        remplacer(debut, fin - 1, partie);
    }

    public void inserer(int debut, String remplacement) {
        remplacer(debut, debut, remplacement + texteDocument.substring(debut));
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

}
