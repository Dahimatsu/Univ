public class Affichage {
    public static void main(String[] args) {
        Filiere info = new Filiere("Informatique", "Scientifique", 200000, 250000, 300000, 350000, 400000, 1000000,
                1000000);

        Parents parents = new Parents("Jean", 500000, "Marine", 300000);

        // Notes année 1
        Matiere[] note1 = new Matiere[6];
        note1[0] = new Matiere("Anglais Professionnel", 15, 6);
        note1[1] = new Matiere("Design", 17, 4);
        note1[2] = new Matiere("Programmation", 12, 6);
        note1[3] = new Matiere("Web Dynamique", 13.5, 4);
        note1[4] = new Matiere("Base de Données", 15, 4);
        note1[5] = new Matiere("Mathématiques", 12, 6);

        // Notes année 2
        Matiere[] note2 = new Matiere[6];
        note2[0] = new Matiere("Anglais Professionnel", 12, 6);
        note2[1] = new Matiere("Design", 14, 4);
        note2[2] = new Matiere("Programmation", 10, 6);
        note2[3] = new Matiere("Web Dynamique", 9, 4);
        note2[4] = new Matiere("Base de Données", 11.5, 4);
        note2[5] = new Matiere("Mathématiques", 10.5, 6);

        // Notes année 3
        Matiere[] note3 = new Matiere[6];
        note3[0] = new Matiere("Anglais Professionnel", 17, 6);
        note3[1] = new Matiere("Design", 16.5, 4);
        note3[2] = new Matiere("Programmation", 15, 6);
        note3[3] = new Matiere("Web Dynamique", 14, 4);
        note3[4] = new Matiere("Base de Données", 18, 4);
        note3[5] = new Matiere("Mathématiques", 15, 6);

        Parcours[] antecedent = new Parcours[3];
        antecedent[0] = new Parcours(info, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), note1);
        antecedent[1] = new Parcours(info, 2, new Date(20, 9, 2023), new Date(10, 7, 2024), note2);
        antecedent[2] = new Parcours(info, 2, new Date(15, 9, 2024), new Date(5, 7, 2025), note3);

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
        System.out.println("- Bourse Max accordée: " + info.bourseMax + " Ar");

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

        double[] moyenne = etudiant.getMoyenne();
        System.out.println();
        System.out.println("Notes:");
        for (int i = 0; i < etudiant.antecedent.length; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("- " + etudiant.antecedent[i].notes[j].intitule + ": "
                        + etudiant.antecedent[i].notes[j].valeur);
            }
            if (moyenne[i] >= 10) {
                System.out.println("=> Moyenne: " + moyenne[i] + " (Admis)");
            } else {
                System.out.println("=> Moyenne: " + moyenne[i] + " (Non Admis)");
            }

            System.out.println();
        }

        System.out.println("Bourse:");
        boolean redouble = etudiant.isRedoublant();
        if (redouble == true) {
            System.out.println("- Redoublant: Oui");
            int[] anneeRedouble = etudiant.getAnneeRedouble();
            System.out.print("- Année(s) redoublée(s): ");
            for (int i = 0; i < anneeRedouble.length; i++) {
                if (anneeRedouble[i] != 0) {
                    if (anneeRedouble[i] == 1) {
                        System.out.print(anneeRedouble[i] + "ère année ");
                    } else {
                        System.out.print(anneeRedouble[i] + "ème année ");
                    }
                }
            }
            System.out.println();
        } else {
            System.out.println("- Redoublant: Non");
        }

        if (etudiant.isBoursier()) {
            System.out.println("- Boursier: Oui");
            System.out.println("- Bourse obtenue: ");
            for (int i = 0; i < moyenne.length; i++) {
                double bourse = etudiant.getBourse(moyenne[i]);
                System.out.println("=> " + (i + 2) + ": " + bourse + " Ar");
            }

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