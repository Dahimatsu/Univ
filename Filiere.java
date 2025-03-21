package univ;

public class Filiere {
    String nom;
    String type;
    double[] ecolage;
    double salaireMax;
    double bourseMax;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getEcolage() {
        return ecolage;
    }

    public void setEcolage(double[] ecolage) {
        this.ecolage = ecolage;
    }

    public double getSalaireMax() {
        return salaireMax;
    }

    public void setSalaireMax(double salaireMax) {
        this.salaireMax = salaireMax;
    }

    public double getBourseMax() {
        return bourseMax;
    }

    public void setBourseMax(double bourseMax) {
        this.bourseMax = bourseMax;
    }

    public Filiere(String nom, String type, double e1, double e2, double e3, double e4, double e5, double salaireMax, double bourseMax) {
        this.nom = nom;
        this.type = type;
        this.ecolage = new double[5];
        this.ecolage[0] = e1;
        this.ecolage[1] = e2;
        this.ecolage[2] = e3;
        this.ecolage[3] = e4;
        this.ecolage[4] = e5;
        this.salaireMax = salaireMax;
        this.bourseMax = bourseMax;
    }
}