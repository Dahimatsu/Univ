package personne;

public class Parents {
    String pere;
    double salairePere;
    String mere;
    double salaireMere;

    public String getPere() {
        return pere;
    }

    public void setPere(String pere) {
        this.pere = pere;
    }

    public double getSalairePere() {
        return salairePere;
    }

    public void setSalairePere(double salairePere) {
        this.salairePere = salairePere;
    }

    public String getMere() {
        return mere;
    }

    public void setMere(String mere) {
        this.mere = mere;
    }

    public double getSalaireMere() {
        return salaireMere;
    }

    public void setSalaireMere(double salaireMere) {
        this.salaireMere = salaireMere;
    }

    public Parents(String pere, double salairePere, String mere, double salaireMere) {
        this.pere = pere;
        this.salairePere = salairePere;
        this.mere = mere;
        this.salaireMere = salaireMere;
    }

}
