
public class TablasConversoras {
	
	public TablasConversoras() {
		
	}
	//Divisas 1
	private double copDolar = 0.00;
	private double copEuro = 0.00;
	private double copLibra = 0.00;
	private double copYen = 0.00;
	private double copWon = 0.00;
	
	//Divisas 2
	private double dolarCop = 0.00;
	private double euroCop = 0.00;
	private double libraCop = 0.00;
	private double yenCop = 0.00;
	private double wonCop = 0.00;
	
	//Temperaturas
	private double kCelsius = 0.0;
	
	
	public double getCopDolar() {
		return copDolar;
	}

	public double getCopEuro() {
		return copEuro;
	}

	public double getCopLibra() {
		return copLibra;
	}

	public double getCopYen() {
		return copYen;
	}

	public double getCopWon() {
		return copWon;
	}
	
	public double getDolarCop() {
		return dolarCop;
	}

	public double getEuroCop() {
		return euroCop;
	}

	public double getLibraCop() {
		return libraCop;
	}

	public double getYenCop() {
		return yenCop;
	}

	public double getWonCop() {
		return wonCop;
	}

	//de Cop a Otros
	public double pesoEuro(double valor) {
		return valor / 5100.49;
	}
	
	public double pesoDolar(double valor) {
		return valor / 4765.50;
	}
	
	public double pesoLibra(double valor) {
		return valor / 5792.87;
	}
	
	public double pesoYen(double valor) {
		return valor / 35.64;
	}
	
	public double pesoWon(double valor) {
		return valor / 3.66;
	}
	
	
	//De otros a Cop
	public double euroCop(double valor) {
		return valor / 0.00020;
	}
	
	public double dolarCop(double valor) {
		return valor / 0.00021;
	}
	
	public double libraCop(double valor) {
		return valor / 0.00018;
	}
	
	public double yenCop(double valor) {
		return valor / 0.028;
	}
	
	public double wonCop(double valor) {
		return valor / 0.28;
	}
	
}
