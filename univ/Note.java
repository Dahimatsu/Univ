package univ;

public class Note {
    String intitule;
    double valeur;
    int coefficient;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        if (valeur >= 0 && valeur <= 20)
            this.valeur = valeur;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public Note(String intitule, double valeur, int coefficient) {
        this.intitule = intitule;
        this.valeur = valeur;
        this.coefficient = coefficient;
    }
}
