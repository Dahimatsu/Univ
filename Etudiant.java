package personne;

import univ.*;
import date.*;

public class Etudiant {
    String nom;
    String sexe;
    Filiere filiere;
    int annee;
    Parcours[] antecedent;
    Parents parents;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

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
        this.annee = annee;
    }

    public Parcours[] getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(Parcours[] antecedent) {
        this.antecedent = antecedent;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public Etudiant(String nom, String sexe, Filiere filiere, int annee, Parents parents, Parcours[] antecedent) {
        this.nom = nom;
        this.sexe = sexe;
        this.filiere = filiere;
        this.annee = annee;
        this.parents = parents;
        this.antecedent = antecedent;
    }

    public double getTotaAPayer() {
        double total = 0;
        for (int i = 0; i < antecedent.length; i++) {
            total += this.antecedent[i].getEcolage();
        }
        return total;
    }

    public boolean isRedoublant() {
        for (int i = 1; i < antecedent.length; i++) {
            if (this.antecedent[i].getAnnee() == this.antecedent[i - 1].getAnnee()) {
                return true;
            }
        }
        return false;
    }

    public int[] getAnneeRedouble() {
        int[] anneeRedouble = new int[antecedent.length];
        int indiceR = 0;
        for (int i = 1; i < antecedent.length; i++) {
            if (this.antecedent[i].getAnnee() == this.antecedent[i - 1].getAnnee()) {
                anneeRedouble[indiceR] = this.antecedent[i].getAnnee();
                indiceR++;
            }
        }
        return anneeRedouble;
    }

    public double getSalaire() {
        double sommeSalaires = 0;
        sommeSalaires = this.parents.salairePere + this.parents.salaireMere;
        return sommeSalaires;
    }

    public boolean isBoursier() {
        double sommeSalaires = this.getSalaire();
        if (sommeSalaires <= this.filiere.getSalaireMax() && !this.isRedoublant()) {
            return true;
        }
        return false;
    }

    public double[] getMoyenne() {
        if (this.antecedent == null) {
            return new double[0];
        }

        double[] moyennes = new double[this.antecedent.length];

        for (int i = 0; i < this.antecedent.length; i++) {
            double somme = 0;
            int sommeCoef = 0;

            if (this.antecedent[i] != null && this.antecedent[i].getNotes() != null) {
                for (int j = 0; j < this.antecedent[i].getNotes().length; j++) {
                    if (this.antecedent[i].getNotes()[j] != null) {
                        somme += this.antecedent[i].getNotes()[j].getValeur()
                                * this.antecedent[i].getNotes()[j].getCoefficient();
                        sommeCoef += this.antecedent[i].getNotes()[j].getCoefficient();
                    }
                }
            }

            moyennes[i] = somme / sommeCoef;
        }

        return moyennes;
    }

    public double getBourse(double moyenne) {
        if (moyenne >= 16) {
            return this.filiere.getBourseMax() * 3 / 3;
        } else if (moyenne >= 14 && moyenne < 16) {
            return this.filiere.getBourseMax() * 2 / 3;
        } else if (moyenne >= 12 && moyenne < 14) {
            return this.filiere.getBourseMax() * 1 / 3;
        } else {
            return 0;
        }
    }

}