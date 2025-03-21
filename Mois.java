package date;

public class Mois {
    String mois;

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public Mois(int mois) {
        String[] moisNom = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
                "Octobre", "Novembre", "Decembre"};
        this.mois = moisNom[mois - 1];
    }
}
