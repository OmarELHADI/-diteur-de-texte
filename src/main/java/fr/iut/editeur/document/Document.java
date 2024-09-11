package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut,fin,"");
    }

    public void clear(){
        setContentDocument("");
    }

    public void remplacer(int debut, int fin, String remplacement) {
            String partieGauche = contentDocument.substring(0, debut);
            String partieDroite = contentDocument.substring(fin + 1);
            contentDocument = partieGauche + remplacement + partieDroite;

    }

    public void majuscules(int debut, int fin) {
        String partie = contentDocument.substring(debut, fin);
        partie =partie.toUpperCase();
        remplacer(debut, fin-1, partie);
    }

    public void minuscule(int debut, int fin) {
        String partie = contentDocument.substring(debut, fin);
        partie =partie.toLowerCase();
        remplacer(debut, fin-1, partie);
    }

    public void inserer(int debut,String remplacement){
        remplacer(debut,debut,remplacement+ contentDocument.substring(debut));
    }
    @Override
    public String toString() {
        return this.contentDocument;
    }

}
