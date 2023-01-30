public class MotGenreNombre extends MotNombre {
    public static final int MASCULIN = 6;
    public static final int FEMININ = 7;
    protected int genre;

    public MotGenreNombre(String form, String cat, int gen, int nombre) {
        super(form, cat, nombre);
        if (gen != MASCULIN && gen != FEMININ)
            throw new IllegalArgumentException();
        genre = gen;
    }

    public boolean estMasculin() {
        return genre == MASCULIN;
    }

    public boolean estFeminin() {
        return genre == FEMININ;
    }

    public String toStringBis() {
        String res = "Mot " + formeMot + " categorie: " +
                categorie + " nombre:";
        if (nombre == SINGULIER) {
            res = res + " singulier";
        } else {
            res = res + " pluriel";
        }
        if (genre == MASCULIN) res = res + " genre: masculin";
        else
            res = res + " genre: feminin";
        return res;
    }
}