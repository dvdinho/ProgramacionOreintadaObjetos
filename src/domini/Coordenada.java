package domini;

public class Coordenada {//cada objecta representar� una coordenada del taulell

	private int fila;//n�mero de la fila dins el taulell (0..9)
	private int columna;//n�mero de la columna dins el taulell (0..9)
	
	public Coordenada(int fila, int columna) {
		//PENDENT IMPLEMENTAR
		
	}
	
	public int getFila() {
		//PENDENT IMPLEMENTAR
		return -1000;
	}
	
	public int getColumna() {
		//PENDENT IMPLEMENTAR
		return -1000;
	}
	
	/*Una casella depenent la seva situaci� en el taulell, pot tenir 2, 5 o 8 veins.
	 * Aquest m�tode retorna en un array les coordenades  veines a l'objecte actual.
	 * Cal tenir en compte que una coordenada no �s veina de si mateixa.*/
	
	public Coordenada [] cercarCoordenadesVeines() {
		//PENDENT IMPLEMENTAR
		return null;		
	}
}