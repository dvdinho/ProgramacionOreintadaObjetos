package domini;

//cada objecte d'aquesta classe repreentar� una casella del taulell del joc
public class Casella {
	
	//-1=mina, de 0 a 8=numero mines veines
	private int contingut;
	//la casella est� o no destapada. Inicialment est� tapada
	private boolean destapada;
	//indica en quina posici� es troba la casella dins el taulell de joc
	private Coordenada posicio;
	//la casella est� o no marcada com a possible mina. Inicialment no est� marcada
	private boolean possibleMina;
	//valor de l'atribut contingut que representar� que la casella cont� una mina
	private final int MINA = -1;
	//valor de l'atribut contingut que representar� que la casella no t� cap mina al voltan
	private final int POS_BUIDA = 0;
	
	public Casella(Coordenada coordenada) {
		//PENDENT IMPLEMENTAR
	}
	
	/* actualitza l'atribut contingut possant'hi una mina
	 * i crida el m�tode modificarVeinsNovaMina() 
	 * per tal d'actualitzar tots els seus veins*/

	public void collocarMina(Casella[] casellesVeines) {
		//PENDENT IMPLEMENTAR
	}
	
	/*Cada cop que es col�loca una mina en una casella, cal informar 
	 * a tos els seus veins que no tinguin mina, que hi ha un nou vei amb mina. 
	 * Caldr� doncs incrementar el nombre de veins amb mina de cada vei.*/
	
	
	private void modificarVeinsNovaMina(Casella[] veins) {			
		//PENDENT IMPLEMENTAR
	}		
	
	//Retorna cert si la casella t� una mina, i fals altrament
	
	public boolean hiHaMina() {
		//PENDENT IMPLEMENTAR
		return false;
	}
	
	//Retorna el contingut de la casella
	
	public int getContingut() {
		//PENDENT IMPLEMENTAR
		return -100;
	}

	//Retrona cert si la casella est� destapada, fals altrament
	
	public boolean estaDestapada() {
		//PENDENT IMPLEMENTAR
		return false;
	}

	//Destapa la casella

	public void destapar() {
		//PENDENT IMPLEMENTAR
	}

	//Actualitza l'atribut possibleMina
	
	public void setPosibleMina(boolean marca) {
		//PENDENT IMPLEMENTAR
	}
	
	//Retorna si la casella est� o no marcada

	public boolean estaMarcadaPosibleMina() {
		//PENDENT IMPLEMENTAR
		return false;
	}
	
	//Retorna les coordenades de la casella
	//AXEL
	public Coordenada getPosicio() {
		//PENDENT IMPLEMENTAR
		return null;
	}

	/*Retorna cert si la casella no t� cap vei amb mina 
	 * ni ella cont� una mina, altrament retorna fals.*/
	//AXEL
	public boolean esBuida() {
		//PENDENT IMPLEMENTAR
		return false;
	}
}