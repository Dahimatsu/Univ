public class Affichage {
    public static void main(String[] args) {
        Filiere medecine = new Filiere("Medecine", "Scientifique", 200000, 250000, 300000, 350000, 400000, 1000000,
                1000000);

        Parents[] parents = new Parents[4];
        parents[0] = new Parents("P1", 600000, "M1", 300000);
        parents[1] = new Parents("P2", 600000, "M2", 400000);
        parents[2] = new Parents("P3", 400000, "M3", 400000);
        parents[3] = new Parents("P4", 400000, "M4", 400000);

        // Notes année 1 E1
        Matiere[] note1 = new Matiere[3];
        note1[0] = new Matiere("Mat1", 10, 5);
        note1[1] = new Matiere("Mat2", 12, 3);
        note1[2] = new Matiere("Mat3", 8, 4);

        // Notes année 2 E1
        Matiere[] note2 = new Matiere[3];
        note2[0] = new Matiere("Mat1", 16, 2);
        note2[1] = new Matiere("Mat2", 10, 1);
        note2[2] = new Matiere("Mat3", 9, 4);

        // Notes année 3 E1
        Matiere[] note3 = new Matiere[6];
        note3[0] = new Matiere("Mat1", 6, 5);
        note3[1] = new Matiere("Mat2", 7, 6);
        note3[2] = new Matiere("Mat3", 12, 4);

        // Notes année 4 E1
        Matiere[] note4 = new Matiere[6];
        note4[0] = new Matiere("Mat1", 15, 3);
        note4[1] = new Matiere("Mat2", 12, 2);
        note4[2] = new Matiere("Mat3", 13, 1);

        // Antecedent E1
        Parcours[] antecedent1 = new Parcours[4];
        antecedent1[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), note1);
        antecedent1[1] = new Parcours(medecine, 2, new Date(20, 9, 2023), new Date(10, 7, 2024), note2);
        antecedent1[2] = new Parcours(medecine, 3, new Date(15, 9, 2024), new Date(5, 7, 2025), note3);
        antecedent1[3] = new Parcours(medecine, 4, new Date(15, 9, 2024), new Date(5, 7, 2025), note4);

        // Notes année 1 E2
        Matiere[] note5 = new Matiere[3];
        note5[0] = new Matiere("Mat1", 16, 5);
        note5[1] = new Matiere("Mat2", 14, 3);
        note5[2] = new Matiere("Mat3", 12, 4);

        // Notes année 2 E2
        Matiere[] note6 = new Matiere[3];
        note6[0] = new Matiere("Mat1", 16, 2);
        note6[1] = new Matiere("Mat2", 10, 1);
        note6[2] = new Matiere("Mat3", 14, 7);

        // Antecedent E2
        Parcours[] antecedent2 = new Parcours[2];
        antecedent2[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), note5);
        antecedent2[1] = new Parcours(medecine, 2, new Date(20, 9, 2023), new Date(10, 7, 2024), note6);

        // Notes année 1 E3
        Matiere[] note7 = new Matiere[3];
        note7[0] = new Matiere("Mat1", 11, 5);
        note7[1] = new Matiere("Mat2", 12, 3);
        note7[2] = new Matiere("Mat3", 10, 4);

        // Antecedent E3
        Parcours[] antecedent3 = new Parcours[1];
        antecedent3[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), note7);

        // Notes année 1 E4
        Matiere[] note8 = new Matiere[3];
        note8[0] = new Matiere("Mat1", 8, 5);
        note8[1] = new Matiere("Mat2", 6, 3);
        note8[2] = new Matiere("Mat3", 7, 4);

        // Notes année 1(2) E4
        Matiere[] note9 = new Matiere[3];
        note9[0] = new Matiere("Mat1", 14, 5);
        note9[1] = new Matiere("Mat2", 16, 3);
        note9[2] = new Matiere("Mat3", 16, 4);

        // Antecedent E4
        Parcours[] antecedent4 = new Parcours[2];
        antecedent4[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), note8);
        antecedent4[1] = new Parcours(medecine, 1, new Date(20, 9, 2023), new Date(10, 7, 2024), note9);

        Etudiant[] etudiants = new Etudiant[4];
        etudiants[0] = new Etudiant("E1", "M", medecine, 5, parents[0], antecedent1);
        etudiants[1] = new Etudiant("E2", "F", medecine, 3, parents[1], antecedent2);
        etudiants[2] = new Etudiant("E3", "M", medecine, 2, parents[2], antecedent3);
        etudiants[3] = new Etudiant("E4", "M", medecine, 2, parents[3], antecedent4);

        System.out.println();
        for (int i = 0; i < etudiants.length; i++) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");
            System.out.println("Etudiant " + (i + 1) + ":");
            System.out.println("- Nom: " + etudiants[i].nom);
            System.out.println("- Filière: " + medecine.nom);
            System.out.println("- Année Actuelle: " + etudiants[i].annee);
            System.out.println("- Sexe: " + etudiants[i].sexe);
            System.out.println();

            // Parents
            System.out.println("- Parents:");
            System.out.println("=> Père: " + etudiants[i].parents.pere);
            System.out.println("=> Salaire: " + etudiants[i].parents.salairePere + " Ar");
            System.out.println("=> Mère: " + etudiants[i].parents.mere);
            System.out.println("=> Salaire: " + etudiants[i].parents.salaireMere + " Ar");
            System.out.println();

            // Antécédents
            System.out.println("- Antécédents:");
            for (int j = 0; j < etudiants[i].antecedent.length; j++) {
                System.out.println("=> Date de début: " + etudiants[i].antecedent[j].debut.jour + " "
                        + new Mois(etudiants[i].antecedent[j].debut.mois).getMois() + " "
                        + etudiants[i].antecedent[j].debut.annee);
                System.out.println("=> Date de fin: " + etudiants[i].antecedent[j].fin.jour + " "
                        + new Mois(etudiants[i].antecedent[j].fin.mois).getMois() + " "
                        + etudiants[i].antecedent[j].fin.annee);
                if (etudiants[i].antecedent[j].annee == 1) {
                    System.out.println("=> Classe: " + etudiants[i].antecedent[j].annee + "ère année");
                } else {
                    System.out.println("=> Classe: " + etudiants[i].antecedent[j].annee + "e année");
                }
                System.out.println();
            }

            // Bourse
            if (etudiants[i].isRedoublant()) {
                System.out.println("- Redoublant: Oui");
                int[] anneeRedouble = etudiants[i].getAnneeRedouble();
                for (int k = 0; k < anneeRedouble.length; k++) {
                    if (anneeRedouble[k] != 0) {
                        if (anneeRedouble[k] == 1) {
                            System.out.println("- Année(s) redoublée(s): " + anneeRedouble[k] + "ère année ");
                        } else {
                            System.out.println("- Année(s) redoublée(s): " + anneeRedouble[k] + "ème année ");
                        }
                    }
                }

            } else {
                System.out.println("- Redoublant: Non");
            }

            double[] moyenne = etudiants[i].getMoyenne();
            if (etudiants[i].isBoursier()) {
                System.out.println("- Boursier: Oui");
                System.out.println("- Bourse obtenue: ");
                for (int j = 0; j < moyenne.length; j++) {
                    double bourse = etudiants[i].getBourse(moyenne[j]);
                    System.out.println("=> Année " + (j + 2) + ": " + bourse + " Ar");
                }
            } else {
                System.out.println("- Boursier: Non");
            }
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
    }
}