package ex3.zone;

/**
 * @author Guillaume Classe qui contient les animaux situés en zone reptile
 *
 */
public class FermeReptile extends Zone {

	public FermeReptile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimaux.size() * 0.1;
	}

}
