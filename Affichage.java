package aff;

import date.*;
import univ.*;
import personne.*;

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
        Matiere[] e1_note1 = new Matiere[3];
        e1_note1[0] = new Matiere("Mat1", 10, 5);
        e1_note1[1] = new Matiere("Mat2", 12, 3);
        e1_note1[2] = new Matiere("Mat3", 8, 4);

        // Notes année 2 E1
        Matiere[] e1_note2 = new Matiere[3];
        e1_note2[0] = new Matiere("Mat1", 16, 2);
        e1_note2[1] = new Matiere("Mat2", 10, 1);
        e1_note2[2] = new Matiere("Mat3", 9, 4);

        // Notes année 3 E1
        Matiere[] e1_note3 = new Matiere[6];
        e1_note3[0] = new Matiere("Mat1", 6, 5);
        e1_note3[1] = new Matiere("Mat2", 7, 6);
        e1_note3[2] = new Matiere("Mat3", 12, 4);

        // Notes année 4 E1
        Matiere[] e1_note4 = new Matiere[6];
        e1_note4[0] = new Matiere("Mat1", 15, 3);
        e1_note4[1] = new Matiere("Mat2", 12, 2);
        e1_note4[2] = new Matiere("Mat3", 13, 1);

        // Antecedent E1
        Parcours[] e1_antecedent = new Parcours[4];
        e1_antecedent[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), e1_note1);
        e1_antecedent[1] = new Parcours(medecine, 2, new Date(20, 9, 2023), new Date(10, 7, 2024), e1_note2);
        e1_antecedent[2] = new Parcours(medecine, 3, new Date(15, 9, 2024), new Date(5, 7, 2025), e1_note3);
        e1_antecedent[3] = new Parcours(medecine, 4, new Date(15, 9, 2024), new Date(5, 7, 2025), e1_note4);

        // Notes année 1 E2
        Matiere[] e2_note1 = new Matiere[3];
        e2_note1[0] = new Matiere("Mat1", 16, 5);
        e2_note1[1] = new Matiere("Mat2", 14, 3);
        e2_note1[2] = new Matiere("Mat3", 12, 4);

        // Notes année 2 E2
        Matiere[] e2_note2 = new Matiere[3];
        e2_note2[0] = new Matiere("Mat1", 16, 2);
        e2_note2[1] = new Matiere("Mat2", 10, 1);
        e2_note2[2] = new Matiere("Mat3", 14, 7);

        // Antecedent E2
        Parcours[] e2_antecedent = new Parcours[2];
        e2_antecedent[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), e2_note1);
        e2_antecedent[1] = new Parcours(medecine, 2, new Date(20, 9, 2023), new Date(10, 7, 2024), e2_note2);

        // Notes année 1 E3
        Matiere[] e3_note1 = new Matiere[3];
        e3_note1[0] = new Matiere("Mat1", 11, 5);
        e3_note1[1] = new Matiere("Mat2", 12, 3);
        e3_note1[2] = new Matiere("Mat3", 10, 4);

        // Antecedent E3
        Parcours[] e3_antecedent = new Parcours[1];
        e3_antecedent[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), e3_note1);

        // Notes année 1a E4
        Matiere[] e4_note1a = new Matiere[3];
        e4_note1a[0] = new Matiere("Mat1", 8, 5);
        e4_note1a[1] = new Matiere("Mat2", 6, 3);
        e4_note1a[2] = new Matiere("Mat3", 7, 4);

        // Notes année 1b E4
        Matiere[] e4_note1b = new Matiere[3];
        e4_note1b[0] = new Matiere("Mat1", 14, 5);
        e4_note1b[1] = new Matiere("Mat2", 16, 3);
        e4_note1b[2] = new Matiere("Mat3", 16, 4);

        // Antecedent E4
        Parcours[] e4_antecedent = new Parcours[2];
        e4_antecedent[0] = new Parcours(medecine, 1, new Date(9, 10, 2022), new Date(30, 7, 2023), e4_note1a);
        e4_antecedent[1] = new Parcours(medecine, 1, new Date(20, 9, 2023), new Date(10, 7, 2024), e4_note1b);

        Etudiant[] etudiants = new Etudiant[4];
        etudiants[0] = new Etudiant("E1", "M", medecine, 5, parents[0], e1_antecedent);
        etudiants[1] = new Etudiant("E2", "F", medecine, 3, parents[1], e2_antecedent);
        etudiants[2] = new Etudiant("E3", "M", medecine, 2, parents[2], e3_antecedent);
        etudiants[3] = new Etudiant("E4", "M", medecine, 2, parents[3], e4_antecedent);

        System.out.println();
        for (int i = 0; i < etudiants.length; i++) {
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");
            System.out.println("Etudiant " + (i + 1) + ":");
            System.out.println("- Nom: " + etudiants[i].getNom());
            System.out.println("- Filière: " + medecine.getNom());
            System.out.println("- Année Actuelle: " + etudiants[i].getAnnee());
            System.out.println("- Sexe: " + etudiants[i].getSexe());
            System.out.println();

            // Parents
            System.out.println("- Parents:");
            System.out.println("=> Père: " + etudiants[i].getParents().getPere());
            System.out.println("=> Salaire: " + etudiants[i].getParents().getSalairePere() + " Ar");
            System.out.println("=> Mère: " + etudiants[i].getParents().getMere());
            System.out.println("=> Salaire: " + etudiants[i].getParents().getSalaireMere() + " Ar");
            System.out.println();

            // Antécédents
            System.out.println("- Antécédents:");
            for (int j = 0; j < etudiants[i].getAntecedent().length; j++) {
                System.out.println("=> Date de début: " + etudiants[i].getAntecedent()[j].getDebut().getJour() + " "
                        + new Mois(etudiants[i].getAntecedent()[j].getDebut().getMois()).getMois() + " "
                        + etudiants[i].getAntecedent()[j].getDebut().getAnnee());
                System.out.println("=> Date de fin: " + etudiants[i].getAntecedent()[j].getFin().getJour() + " "
                        + new Mois(etudiants[i].getAntecedent()[j].getFin().getMois()).getMois() + " "
                        + etudiants[i].getAntecedent()[j].getFin().getAnnee());
                if (etudiants[i].getAntecedent()[j].getAnnee() == 1) {
                    System.out.println("=> Classe: " + etudiants[i].getAntecedent()[j].getAnnee() + "ère année");
                } else {
                    System.out.println("=> Classe: " + etudiants[i].getAntecedent()[j].getAnnee() + "e année");
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