package ex3.service;

import java.util.Scanner;

import ex3.Zoo;
import ex3.animal.Comportement;
import ex3.animal.Mammifere;
import ex3.animal.Poisson;
import ex3.animal.Serpent;
import ex3.zone.Aquarium;
import ex3.zone.FermeReptile;
import ex3.zone.SavaneAfricaine;
import ex3.zone.Zone;
import ex3.zone.ZoneCarnivore;

/**
 * @author Guillaume Classe contenant les principales fonctions d'administration
 *         du zoo
 *
 */
public class ZooService {

	SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	FermeReptile fermeReptile = new FermeReptile();
	Aquarium aquarium = new Aquarium();

	/**
	 * Affichage de la liste de tous les animaux du zoo ou d'une zone en particulier
	 */
	public void afficherListeAnimaux(Scanner sc, Zoo zoo) {

		// affichage de toutes les zones du zoo avec son index pour que l'utilisateur
		// puisse en consulter le contenu
		for (int i = 0; i < zoo.getListeZones().size(); i++) {
			System.out.println(i + 1 + " - " + (zoo.getListeZones().get(i).getClass().getSimpleName()));
		}

		System.out.println("250 - Afficher la liste complète");
		String selection = sc.next();
		int castSelection = Integer.parseInt(selection);
		int j = Integer.parseInt(selection) - 1;

		switch (castSelection) {
		case 1:

			Zone zone1 = zoo.getListeZones().get(j);
			zone1.afficherListeAnimaux();

			break;
		case 2:

			Zone zone2 = zoo.getListeZones().get(j);
			zone2.afficherListeAnimaux();

			break;
		case 3:

			Zone zone3 = zoo.getListeZones().get(j);
			zone3.afficherListeAnimaux();

			break;
		case 4:

			Zone zone4 = zoo.getListeZones().get(j);
			zone4.afficherListeAnimaux();

			break;

		case 250:
			for (int i = 0; i < zoo.getListeZones().size(); i++) {
				zoo.getListeZones().get(i).afficherListeAnimaux();
			}
			break;
		}

	}

	/**
	 * @param sc Méthode d'ajout d'un animal dans une zone du zoo
	 */
	public void addAnimal(Scanner sc, Zoo zoo) {
		System.out.println("De quel type est l'animal?");
		System.out.println("1 - Serpent");
		System.out.println("2 - Mammifère");
		System.out.println("3 - Poisson");
		String choixType = sc.next();
		System.out.println("Veuillez renseigner le nom de l'animal à ajouter");
		String nomAnimal = sc.next();
		System.out.println("Veuillez renseigner son comportement alimentaire");
		for (int i = 0; i < Comportement.values().length; i++) {
			System.out.println(Comportement.values()[i].getNumComportement() + " - "
					+ Comportement.values()[i].getNomComportement());
		}
		String comportement = sc.next();
		switch (choixType) {
		case "1":
			zoo.getListeZones().get(1).addAnimal(new Serpent(nomAnimal, Comportement.values()[1]));

		case "2":
			if (comportement.equalsIgnoreCase("1") && choixType.equalsIgnoreCase("2")) {
				zoo.getListeZones().get(2).addAnimal(new Mammifere(nomAnimal, Comportement.values()[1]));
			} else if (comportement.equalsIgnoreCase("2") && choixType.equalsIgnoreCase("2")) {
				zoo.getListeZones().get(3).addAnimal(new Mammifere(nomAnimal, Comportement.values()[2]));
			}
			break;
		case "3":
			zoo.getListeZones().get(0)
					.addAnimal(new Poisson(nomAnimal, Comportement.values()[Integer.parseInt(comportement)]));
			break;
		default:
			System.out.println("Erreur");
			break;
		}

	}

	/**
	 * @param sc
	 * @param zoo Renvoie la quantité de nourriture consommée par jour pour une zone
	 *            donnée
	 */
	public void calculerRation(Scanner sc, Zoo zoo) {
		System.out.println(
				"Indiquer la zone pour laquelle vous souhaitez calculer la quantité de nourriture quotidienne nécessaire");
		for (int i = 0; i < zoo.getListeZones().size(); i++) {
			System.out.println(i + 1 + " - " + (zoo.getListeZones().get(i).getClass().getSimpleName()));
		}

		String selection = sc.next();
		int castSelection = Integer.parseInt(selection);
		int j = Integer.parseInt(selection) - 1;
		switch (castSelection) {
		case 1:

			Zone zone1 = zoo.getListeZones().get(j);
			System.out.println(zone1.calculerKgsNourritureParJour() + " kgs de nourriture par jour");

			break;
		case 2:

			Zone zone2 = zoo.getListeZones().get(j);
			System.out.println(zone2.calculerKgsNourritureParJour() + " kgs de nourriture par jour");

			break;
		case 3:

			Zone zone3 = zoo.getListeZones().get(j);
			System.out.println(zone3.calculerKgsNourritureParJour() + " kgs de nourriture par jour");

			break;
		case 4:

			Zone zone4 = zoo.getListeZones().get(j);
			System.out.println(zone4.calculerKgsNourritureParJour() + " kgs de nourriture par jour");

			break;
		}

	}

}
