package domini;

import java.util.Random;

public class TaulellCercaMines {

	private Casella[][] taulell;//taulell pel joc del cercamines
	private static int MAX_FILES;//N�mero de files del taulell
	private static int MAX_COLUMNES;//N�mero de columnes del taulell
	private final int MAX_MINES; // % de mines com a m�xim
	private final int MIN_MINES; // % de mines com a m�nim
	private static Random random = new Random();

	public TaulellCercaMines() {
		MAX_FILES = 10;
		MAX_COLUMNES = 10;
		MAX_MINES = 50;
		MIN_MINES = 10;
		this.taulell = new Casella[MAX_FILES][MAX_COLUMNES];
		this.inicialitzarTaulell();
		this.collocarMines();
	}
	
	/*Inicialitzar el taulell creant totes les caselles buides i sense mina*/
	
	private void inicialitzarTaulell() {
		//PENDENT IMPLEMENTAR
	}

	/*Col�locar mines en el taulell de forma aleatoria, per fer-ho caldr�:
	 * 1: calcular el nombre de mines que cal col�locar
	 * 	1.1: generar un n�mero aleatori entre MIN_MINES i MAX_MINES
	 * 	1.2: el n�mero obtingut en el pas anterior �s el % de mines que ha de tenir el taulell
	 * 2: col�locar cada mina en una casella especifica
	 * 	2.1: obtenir les coordenades de la casella de forma aleatoria
	 * 	2.2: si la casella de la coordenada obtinguda NO t� cap mina
	 * 		2.2.1: col�locar una mina a la casella i informar a tots els veins de la casella, 
	 * 				que hi ha una mina veina (m�tode cercarCasellesVeines())
	 * 		2.2.2: col�locar seg�ent mina (tornar al pas 2)
	 * 	2.2: si la casella de la coordenada obtinguda ja t� una mina
	 * 		2.2.1: tornar al pas 2.1*/
	//DAVID
	private void collocarMines() {
		//PENDENT IMPLEMENTAR
	}
	
	/* Retorna un vector amb les caselles que son veines a la casella de l'argument:
	 * 1: obtenir les coordenades de la casella de l'argument
	 * 2: obtenir totes les coordenades veines a la coordenada obtinguda al pas 1
	 * 	  utilitzant el m�tode cercarCoordenadesVeines() de la classe Coordenada
	 * 3:  obtenir i retornar les caselles de les coordenades calculades en el pas 2 */
	//DAVID
	private Casella [] cercarCasellesVeines (Casella casella){
		//PENDENT IMPLEMENTAR	
		return null;
	}	
	
	/*Generador de nombres aleatoris
	 * retorna un enter entre min i max ambd�s inclosus*/
	private int generarNumAleatori (int min, int max) {
		double aleatori = random.nextDouble();
		int retorn =  (int)Math.floor(aleatori*(max-min+1)+min);
		return retorn;
	}

	/*Retorna el n�mero de files del taulell*/
	
	public static int getFiles() {
		//PENDENT IMPLEMENTAR
		return MAX_FILES;
	}

	/*Retorna el n�mero de columnes del taulell*/
	
	public static int getColumnes() {
		//PENDENT IMPLEMENTAR
		return MAX_COLUMNES;
	}

	/*Retorna el taulell en una matriu de String*/
	public String [][] veureTaulell() {
		String [][] retorn = new String [MAX_FILES][MAX_COLUMNES];
		Casella casella;
		String valor;
		//Recorrer tot el taulell
		for (int i = 0; i < MAX_FILES; i++) {//Per tota fila
			for (int j = 0; j < MAX_COLUMNES; j++) {//Per cada columna
				casella = this.taulell[i][j];
				if (casella.estaDestapada()) {
					if (casella.hiHaMina()) {
						valor = "M";//si la casella est� destapada i hi ha una mina posem una "M"
					} else {
						//si la casella est� destapada i NO hi ha una mina posem el nombre de caselles veines amb mina
						valor = String.valueOf(casella.getContingut());
					}
				} else {//casella tapada
					if (casella.estaMarcadaPosibleMina()) {
						valor = "X";
					} else {
						valor = "";
					}
				}
				retorn [i][j]= valor;
			}
		}
		return retorn;
	}	
	
	/*Prepara totes les caselles per mostrar el seu contingut,
	 * per fer-ho les marca totes com destapades i sense possible mina*/
	//DAVID
	private void destaparTotElTaulell() {
		//PENDENT IMPLEMENTAR
		
	}
	
	/*Retorna cert si totes les caselles sense mina estan destapades
	 * Com afecte lateral, en cas de retornar cert, destapa tot el taulell*/
	//DAVID
	public boolean estaTotElTaulellDestapat() {
		//PENDENT IMPLEMENTAR
		return false;
	}

	/*Retorna cert si a la casella hi ha una mina, i fals altrament*/
	//AXEL
	public boolean hiHaMina(int fila, int columna) {
		//PENDENT IMPLEMENTAR
		return false;
	}

	/*El jugador vol marcar una posici� com a possible mina
	 * Si la casella est� destapada no cal fer res de res
	 * Altrament cal marcar la casella com a possible mina*/
	//DAVID
	public void marcarMina(int fila, int columna) {
		//PENDENT IMPLEMENTAR
	}

	/*El jugador vol desmarcar una posici� com a possible mina
	 * Si la casella est� destapada no cal fer res de res
	 * Altrament cal desmarcar la casella com a possible mina*/
	//DAVID
	public void desmarcarMina(int fila, int columna) {
		//PENDENT IMPLEMENTAR
	}
	
	/* El jugador vol destapar una casella, hi ha varies situacions:
	 * A: Hi ha una mina a la casella que vol destapar, aleshores es destapar� 
	 * 		tot el taulell, situaci� de fi de joc.
	 * B: La casella ja est� destapada, no cal fer res de res
	 * C: La casella esta o no marcada com a possible mina i est� tapada, caldr�:
	 * 	C1: destapar la casella
	 * 	C2: Si estava marcada com a possible mina, desmarcar-la
	 * 	C3: destapar de forma recursiva, totes les caselles veines tapades sense
	 *  mina (m�tode destaparVeinsBuits()).*/
	//AXEL
	public void destapar(int fila, int columna) {
		//PENDENT IMPLEMENTAR
	}
	
	/*Donada una casella destapada sense mina, destapa totes les caselles veines de forma 
	 * recursiva (m�tode que es crida a ell mateix).
	 * Es podr� destapar una casella veina si es compleixen totes les seg�ents condicions:
	 * 1: no estar destapada
	 * 2: no estar marcada com a possible mina (tan si hi ha mina com si no)
	 * 3: no tenir una mina
	 * En el suposit que finalment la casella es destapada, si no t� cap mina veina caldr� cridar
	 * el mateix m�tode, esent l'argument d'entrada la casella destapada (aix� �s la recursivitat)*/
	private void destaparVeinsBuits(Casella casella) {
		Casella[] veins = this.cercarCasellesVeines(casella);
		for (Casella c : veins) {
			if (!c.estaDestapada() && !c.estaMarcadaPosibleMina() && !c.hiHaMina()) {
				c.destapar();
				if (c.esBuida()) {
					this.destaparVeinsBuits(c);// recursivitat
				}
			}
		}
	}
}