public class Affichage {
    public static void main(String[] args) {
        Filiere info = new Filiere("Informatique", "Scientifique", 200000, 250000, 300000, 350000, 400000);

        Parents parents = new Parents("Jean", 500000, "Marine", 300000);
        Parcours[] antecedent = new Parcours[3];
        antecedent[0] = new Parcours(info, 1, new Date(9, 10, 2022), new Date(30, 7, 2023));
        antecedent[1] = new Parcours(info, 1, new Date(20, 9, 2023), new Date(10, 7, 2024));
        antecedent[2] = new Parcours(info, 2, new Date(15, 9, 2024), new Date(5, 7, 2025));

        Etudiant etudiant = new Etudiant("Rakoto", info, 3, parents, antecedent);

        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("Filière:");
        System.out.println("- Nom: " + info.nom);
        System.out.println("- Type: " + info.type);
        System.out.println("- Ecolage:");
        for (int i = 0; i < info.ecolage.length; i++) {
            if (i == 0) {
                System.out.println("=> " + (i + 1) + "ère année: " + info.ecolage[i] + " Ar");
            } else {
                System.out.println("=> " + (i + 1) + "e année: " + info.ecolage[i] + " Ar");
            }
        }

        System.out.println();
        System.out.println("Etudiant:");
        System.out.println("- Nom: " + etudiant.nom);
        System.out.println("- Filière: " + etudiant.antecedent[0].filiere.nom);
        System.out.println("- Année Actuelle: " + etudiant.annee);

        System.out.println();
        System.out.println("Parents:");
        System.out.println("- Père:");
        System.out.println("=> Nom: " + etudiant.parents.pere);
        System.out.println("=> Salaire: " + etudiant.parents.salairePere + " Ar");
        System.out.println("- Mère:");
        System.out.println("=> Nom: " + etudiant.parents.mere);
        System.out.println("=> Salaire: " + etudiant.parents.salaireMere + " Ar");

        System.out.println();
        System.out.println("Antécédent:");
        for (int i = 0; i < etudiant.antecedent.length; i++) {
            System.out.println("- Date de debut: " + etudiant.antecedent[i].debut.jour + " "
                    + new Mois(etudiant.antecedent[i].debut.mois).getMois() + " " + etudiant.antecedent[i].debut.annee);
            System.out.println("- Date de fin: " + etudiant.antecedent[i].fin.jour + " "
                    + new Mois(etudiant.antecedent[i].fin.mois).getMois()
                    + " " + etudiant.antecedent[i].fin.annee);
            if (etudiant.antecedent[i].annee == 1) {
                System.out.println("- Classe: " + etudiant.antecedent[i].annee + "ère année");
            } else {
                System.out.println("- Classe: " + etudiant.antecedent[i].annee + "e année");
            }
            System.out.println();
        }

        System.out.println("Bourse:");
        boolean redouble = etudiant.isRedoublant();
        if (redouble == true) {
            System.out.println("- Redoublant: Oui");
        } else {
            System.out.println("- Redoublant: Non");
        }
        if (redouble == true) {
            int[] anneeRedouble = etudiant.getAnneeRedouble();
            System.out.print("- Année(s) redoublée(s): ");
            for (int i = 0; i < anneeRedouble.length; i++) {
                if (anneeRedouble[i] != 0) {
                    if (anneeRedouble[i] == 1) {
                        System.out.print(anneeRedouble[i] + "ère année");
                    } else {
                        System.out.print(anneeRedouble[i] + "ème année");
                    }
                }
            }
            System.out.println();
        }
        boolean boursier = etudiant.isBoursier(1000000);
        if (boursier == true) {
            System.out.println("- Boursier: Oui");
        } else {
            System.out.println("- Boursier: Non");
        }
        System.out.println();
        System.out.println("Ecolage:");
        System.out.println("- Ecolage à payer: " + info.ecolage[etudiant.annee - 1] + " Ar");
        System.out.println("- Ecolage total payé: " + etudiant.getTotaAPayer() + " Ar");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}