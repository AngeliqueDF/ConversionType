public class MotPersonneNombre extends MotNombre {
    public static final int PERS1 = 1;
    public static final int PERS2 = 2;
    public static final int PERS3 = 3;
    protected int personne;

    public MotPersonneNombre(String forme, String cat, int pers, int nombre) {
        super(forme, cat, nombre);
        if (pers < PERS1 || pers > PERS3)
            throw new IllegalArgumentException();
        personne = pers;
    }

    public int getPersonne() {
        return personne;
    }

    public String toStringBis() {
        String res = "Mot " + formeMot + " categorie: " +
                categorie + " nombre: ";
        if (nombre == SINGULIER) {
            res = res + " singulier";
        } else {
            res = res + " pluriel";
        }
        res = res + " personne: " + personne;
        return res;
    }
}
