package univ;

import date.*;

public class Parcours {
    Filiere filiere;
    int annee;
    Date debut;
    Date fin;
    Note[] notes;

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        if (annee > 0 && annee <= 12)
            this.annee = annee;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public Parcours(Filiere filiere, int annee, Date debut, Date fin, Note[] notes) {
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