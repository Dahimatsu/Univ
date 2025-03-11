public class Mois {
    String mois;

    Mois(int mois) {
        String[] moisNom = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
                "Octobre", "Novembre", "Decembre"};
        this.mois = moisNom[mois - 1];
    }

    public String getMois() {
        return mois;
    }
}
