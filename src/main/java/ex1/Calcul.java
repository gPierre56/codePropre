package ex1;

/**
 * @author Guillaume Classe comportant des méthodes d'opération basique
 *
 */
public class Calcul {

	/**
	 * @param nombre1 int : premier nombre à additionner
	 * @param nombre2 int : deuxième nombre à additionner
	 * @return additionne les deux nombres et retourne le résultat
	 */
	public int addition(int nombre1, int nombre2) {
		return nombre1 + nombre2;
	}

	/**
	 * @param nombre1 int : premier nombre
	 * @param nombre2 int : deuxieme nombre à soustraire au premier
	 * 
	 * @return renvoie la différence entre le premier et le deuxieme nombre
	 */
	public int soustraction(int nombre1, int nombre2) {
		return nombre1 - nombre2;
	}
}
