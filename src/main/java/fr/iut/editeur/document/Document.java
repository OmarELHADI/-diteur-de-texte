package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void effacer(int debut, int fin) {
        remplacer(debut,fin,"");
        texte+="prout";
    }

    public void clear(){
        setTexte("");
    }

    public void remplacer(int debut, int fin, String remplacement) {
        if(!remplacement.isEmpty()) {
            String partieGauche = texte.substring(0, debut);
            String partieDroite = texte.substring(fin + 1);
            texte = partieGauche + remplacement + partieDroite;
        } else {
            setTexte(texte.substring(fin + 1));
        }
    }

    public void majuscules(int debut, int fin) {
        String partie = texte.substring(debut, fin);
        partie =partie.toUpperCase();
        remplacer(debut, fin-1, partie);
    }

    @Override
    public String toString() {
        return this.texte;
    }

}
