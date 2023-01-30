public class Mot {
    protected String formeMot;
    protected String categorie;

    public Mot(String fm, String cat) {
        formeMot = fm;
        categorie = cat;
    }

    public String getForme() {
        return formeMot;
    }

    public String getCategorie() {
        return categorie;
    }

    public String toStringBis() {
        return "Mot " + formeMot + " categorie: " + categorie;
    }
}