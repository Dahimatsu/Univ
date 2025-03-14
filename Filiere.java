public class Filiere {
    String nom;
    String type;
    double[] ecolage;
    double salaireMax;
    double bourseMax;

    Filiere(String nom, String type, double e1, double e2, double e3, double e4, double e5, double salaireMax, double bourseMax) {
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