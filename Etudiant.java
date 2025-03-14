public class Etudiant {
    String nom;
    Filiere filiere;
    int annee;
    Parcours[] antecedent;
    Parents parents;

    Etudiant(String nom, Filiere filiere, int annee, Parents parents, Parcours[] antecedent) {
        this.nom = nom;
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
            if (this.antecedent[i].annee == this.antecedent[i - 1].annee) {
                return true;
            }
        }
        return false;
    }

    public int[] getAnneeRedouble() {
        int[] anneeRedouble = new int[antecedent.length];
        int indiceR = 0;
        for (int i = 1; i < antecedent.length; i++) {
            if (this.antecedent[i].annee == this.antecedent[i - 1].annee) {
                anneeRedouble[indiceR] = this.antecedent[i].annee;
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
        if (sommeSalaires < this.filiere.salaireMax && !this.isRedoublant()) {
            return true;
        }
        return false;
    }

    public double[] getMoyenne() {
        double[] moyennes = new double[antecedent.length];

        for (int i = 0; i < antecedent.length; i++) {
            double somme = 0;
            int sommeCoef = 0;

            if (this.antecedent[i].notes != null) {
                for (int j = 0; j < this.antecedent[i].notes.length; j++) {
                    somme += this.antecedent[i].notes[j].valeur * this.antecedent[i].notes[j].coefficient;
                    sommeCoef += this.antecedent[i].notes[j].coefficient;
                }
            }

            moyennes[i] = somme / sommeCoef;
        }

        return moyennes;
    }

    public double getBourse(double moyenne) {
        if (moyenne >= 16) {
            return this.filiere.bourseMax * 3 / 3;
        } else if (moyenne >= 14) {
            return this.filiere.bourseMax * 2 / 3;
        } else if (moyenne >= 12) {
            return this.filiere.bourseMax * 1 / 3;
        } else {
            return 0;
        }
    }
}