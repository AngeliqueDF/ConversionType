public class ConversionType {
    public static void main(String[] args) {
        MotGenreNombre m1 = new MotGenreNombre("blanc", "cat", 6, 4);
        MotGenreNombre m4 = new MotGenreNombre(null, "cat", 6, 4);
        System.out.println(m4.getForme());
        System.out.println(estMotGenreNombre(m1));
        MotNombre m2 = new MotNombre("blanc", "cat", 5);
        System.out.println(estMotGenreNombre(m2));
        MotPersonneNombre m3 = new MotPersonneNombre("blanc", "cat", 2, 4);
        System.out.println(estMotGenreNombre(m3));
    }

    public static boolean estMotGenreNombre(Mot unmot) {
        try {
            MotGenreNombre test = (MotGenreNombre) unmot;
        } catch (ClassCastException ce) {
            System.out.println(ce.getMessage());
            return false;
        }
        return true;
    }
}