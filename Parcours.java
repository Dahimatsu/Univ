public class Parcours {
    Filiere filiere;
    int annee;
    Date debut;
    Date fin;

    Parcours(Filiere filiere, int annee, Date debut, Date fin) {
        this.filiere = filiere;
        this.annee = annee;
        this.debut = debut;
        this.fin = fin;
    }

    public double getEcolage() {
        return this.filiere.ecolage[this.annee - 1];
    }
}