public class Parcours {
    Filiere filiere;
    int annee;
    Date debut;
    Date fin;
    Matiere[] notes;

    Parcours(Filiere filiere, int annee, Date debut, Date fin, Matiere[] notes) {
        this.filiere = filiere;
        this.annee = annee;
        this.debut = debut;
        this.fin = fin;
        this.notes = notes;
    }

    public double getEcolage() {
        return this.filiere.ecolage[this.annee - 1];
    }
}