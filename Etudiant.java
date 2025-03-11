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
        for (int i = 0; i < antecedent.length; i++) {
            if (this.antecedent[i].annee == i + 1) {
                return true;
            }
        }
        return false;
    }

    public int[] getAnneeRedouble() {
        int[] anneeRedouble = new int[antecedent.length];
        int indiceR = 0;
        for (int i = 0; i < antecedent.length; i++) {
            if (this.antecedent[i].annee == i + 1) {
                anneeRedouble[indiceR] = i + 1;
                indiceR++;
            }
        }
        return anneeRedouble;
    }

    public boolean isBoursier(double seuil) {
        double sommeSalaires = 0;
        sommeSalaires = this.parents.salairePere + this.parents.salaireMere;
        if (sommeSalaires < seuil && !this.isRedoublant()) {
            return true;
        }
        return false;
    }
}