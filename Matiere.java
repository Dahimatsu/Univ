package univ;

public class Matiere {
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
        this.valeur = valeur;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public Matiere(String intitule, double valeur, int coefficient) {
        this.intitule = intitule;
        this.valeur = valeur;
        this.coefficient = coefficient;
    }

}
