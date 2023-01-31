package scanner;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class Reloj {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<2; i++) {
			int diasHoras = 0;
			int minutosHoras = 0;
			int segundosHoras = 0;
			
			DecimalFormat formatoHora = new DecimalFormat("00");
			
			for(diasHoras = 0; diasHoras < 24; diasHoras++) {
				for(minutosHoras = 0; minutosHoras < 60; minutosHoras++) {
					for(segundosHoras = 0; segundosHoras < 60; segundosHoras++) {
						
						System.out.println(formatoHora.format(diasHoras) + ":" + formatoHora.format(minutosHoras) 
						+ ":" + formatoHora.format(segundosHoras));
						
						Thread.sleep(1000);
					}
				}
			}
		}

	}

}
