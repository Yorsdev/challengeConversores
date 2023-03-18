import java.awt.GridBagLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;



public class Main extends TablasConversoras{

	public static void main(String[] args) {

		//Objetos para Cop a Otros
		TablasConversoras copEuro = new TablasConversoras();
		TablasConversoras copDolar = new TablasConversoras();
		TablasConversoras copLibra = new TablasConversoras();
		
		TablasConversoras copYen = new TablasConversoras();
		TablasConversoras copWon = new TablasConversoras();		
		
		//Objetos para Otros a Cop
		TablasConversoras euroCop = new TablasConversoras();
		TablasConversoras dolarCop = new TablasConversoras();
		TablasConversoras libraCop = new TablasConversoras();
		TablasConversoras yenCop = new TablasConversoras();
		TablasConversoras wonCop = new TablasConversoras();	
		
		
		Object[] options = {"Convertir divisa", "Convertir temperatura","salir"};		int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer?","Conversor", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
		if(elige == 2) {
			JOptionPane.showMessageDialog(null, "El programa se ha cerrado con exito");
			System.exit(0);
		}
		if(elige == 0) {
			
			DecimalFormat formatearDivisa = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			
			while (continuarPrograma) {
				
				String[] opciones = {"COP - EUR", "COP - USD", "COP - GBP", "COP - JYP", "COP - KRW", 
									  "EUR - COP", "USD - COP", "GBP - COP", "JYP - COP", "KRW - COP"};
				
				String cambio = (String) JOptionPane.showInputDialog(null,"Elija una opcion: ", "Conversor de moneda", 
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
								
				if(cambio == "COP - EUR" || cambio == "COP - USD" || cambio == "COP - GBP"
						|| cambio == "COP - JYP" || cambio == "COP - KRW") {
				
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Pesos: ");
					double pesos = 1000.00;
					
					try {
						pesos = Double.parseDouble(input);
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					if(cambio.equals("COP - EUR")) {
						
						JOptionPane.showMessageDialog(null, "$ "+pesos + " Pesos colombianos son: " + 
						formatearDivisa.format(copEuro.pesoEuro(pesos)) + " Euros. ");
						
					}else if(cambio.equals("COP - USD")) {
						
						JOptionPane.showMessageDialog(null, "$ "+pesos + " Pesos colombianos son: " + 
						formatearDivisa.format(copDolar.pesoDolar(pesos)) + " Dolares. ");
						
					}else if(cambio.equals("COP - GBP")) {

						JOptionPane.showMessageDialog(null, "$ "+pesos + " Pesos colombianos son: " + 
						formatearDivisa.format(copLibra.pesoLibra(pesos)) + " Libras Esterlinas. ");
						
					}else if(cambio.equals("COP - JYP")) {

						JOptionPane.showMessageDialog(null, "$ "+pesos + " Pesos colombianos son: " + 
						formatearDivisa.format(copYen.pesoYen(pesos)) + " Yenes Japoneses. ");
						
					}else if (cambio.equals("COP - KRW")) {

						JOptionPane.showMessageDialog(null, "$ "+pesos + " Pesos colombianos son: " + 
						formatearDivisa.format(copWon.pesoWon(pesos)) + " Wones SurCoreanos. ");
					}else {
						JOptionPane.showMessageDialog(null, "Registro no valido");
					}

//--------------DE EXTRANJEROS A NACIONAL					
				}else if(cambio.equals("EUR - COP")) {
					
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Euros: ");
					double euros = 5100.49;
					
					try {
						euros = Double.parseDouble(input);
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					JOptionPane.showMessageDialog(null, "€ "+euros + " Euros, son: " + 
							formatearDivisa.format(euroCop.euroCop(euros)) + " Pesos colombianos.");
					
				}else if(cambio.equals("USD - COP")) {
					
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Dolares: ");
					double dolares = 4765.50;
					
					try {
						dolares = Double.parseDouble(input);
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					JOptionPane.showMessageDialog(null, "$ "+dolares + " Dolare(s) americanos, son: " + 
							formatearDivisa.format(dolarCop.dolarCop(dolares)) + " Pesos colombianos.");
					
				}else if(cambio.equals("GBP - COP")) {
					
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Libras Esterlinas: ");
					double libras = 5792.87;
					
					try {
						libras = Double.parseDouble(input);
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					JOptionPane.showMessageDialog(null, "£ "+libras + " Libras(s) Esterlinas, son: " + 
							formatearDivisa.format(copLibra.pesoLibra(libras)) + " Pesos colombianos.");
					
				}else if(cambio.equals("JYP - COP")) {
					
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Yenes: ");
					double yenes = 35.64;
					
					try {
						yenes = Double.parseDouble(input);
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					JOptionPane.showMessageDialog(null, "¥ "+yenes + " Yenes japoneses, son: " + 
							formatearDivisa.format(yenCop.yenCop(yenes)) + " Pesos colombianos.");
					
				}else if(cambio.equals("KRW - COP")) {
					
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Wones Sur-Coreanos: ");
					double wones = 3.66;
					
					try {
						wones = Double.parseDouble(input);
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}
					
					JOptionPane.showMessageDialog(null, "₩ "+wones + " Wones Sur-Coreanos, son: " + 
							formatearDivisa.format(yenCop.yenCop(wones)) + " Pesos colombianos.");
				}else {
					JOptionPane.showMessageDialog(null, "Registro no valido");
				}
		
				
				//PROBAR CODIGO				
				int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar el programa?", "Confirmar", 
						JOptionPane.YES_NO_CANCEL_OPTION);
				if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					
					
				}			
			}
		}
		if (elige  == 1) {
			boolean seguirPrograma = true;
			while(seguirPrograma) {
				String[] opciones = {"°C a °F", "°F a °C"};
				int opcion = JOptionPane.showOptionDialog(null, "Elija una opcion:", "Conversor de temperatura", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
				
				String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
				double valor = 0.0;
				
				try {
					valor = Double.parseDouble(valorNominal);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}
				
				double resultado = 0;
				
				if(opcion == 0) {
					 resultado = (valor *9/5)+32;
					 JOptionPane.showMessageDialog(null, valor + "Grados Celcius son: " + resultado + " Grafos Fahrenheit");
				} else if (opcion == 1) {
					resultado = (valor - 32) * 5 /9;
					JOptionPane.showMessageDialog(null, valor + "Grados Fahrenheit son:" + resultado + " Grados Celcius");
				}
				int continuar = JOptionPane.showConfirmDialog(null, "Desea Seguir usando el programa?", "",
				JOptionPane.YES_NO_OPTION);
				if(continuar == JOptionPane.NO_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
			}
		}
	}
}
		
		
	


