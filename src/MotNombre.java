public class MotNombre extends Mot {
    public static final int SINGULIER = 4;
    public static final int PLURIEL = 5;
    protected int nombre;

    public MotNombre(String forme, String cat, int nomb) {
        super(forme, cat);
        if (nomb != SINGULIER && nomb != PLURIEL) throw new IllegalArgumentException("nombre ni SINGULIER ni PLURIEL");
        nombre = nomb;
    }

    public boolean estSingulier() {
        return nombre == SINGULIER;
    }

    public boolean estPluriel() {
        return nombre == PLURIEL;
    }

    public String toStringBis() {
        String res = "Mot variable en nombre " + formeMot + " categorie: " +
                categorie + " nombre: ";
        if (nombre == SINGULIER) {
            res = res + " singulier";
        } else {
            res = res + " pluriel";
        }
        return res;
    }
}