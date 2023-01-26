package ejercicio04;
/**
 * @author Angelika Chozas López
 */

/**
 * Importo las Clases SmartPhone y SmartWatch
 */
import ejercicio04.SmartDevice.SmartPhone;
import ejercicio04.SmartDevice.SmartWatch;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Instancio las clases SmartPhone y SmartWatch
		 */
		SmartWatch smartwatch1 = new SmartWatch("AMOLED 1,75” cuadrado", 24.4, 1.75, "12 Días uso normal", "42,4x36x8,8 mm", "negro", "Amazfit", false);
		SmartWatch smartwatch2 = new SmartWatch("AMOLED 2,75” circular", 0.05, 1.75, "3 Días de autonomía", "33,4x32x8,8 mm", "rosa", "Vieta Pro", true);
		
		SmartPhone smartphone1 = new SmartPhone("Interior 7.6\" Exterior 6.2\"", 0.263, 16.52, "3700 mAh", "7.19 cm x 16.52 cm x 0.69 cm", "negro", "Samsung", 256, "Android", "Qualcomm Snapdragon 8+ Gen 1 (SM8475)", 2176, 19);
		SmartPhone smartphone2 = new SmartPhone("Super Retina XDR siempre encendida", 0.206, 15.49, "hasta 26h de reproducción de video", "7.15 cm x 14.75 cm x 0.78 cm", "negro", "Apple", 128, "iOS", "Chip A16 Bionic", 1812, 20);
		
		/**
		 * Imprimo por consola los objetos de las clases SmartPhone y SmartWatch
		 */
		System.out.println("Modelo 1 de SmartWatch " + smartwatch1);
		System.out.println("Modelo 2 de SmartWatch " + smartwatch2);
		
		System.out.println("Modelo 1 de SmartPhone " + smartphone1);
		System.out.println("Modelo 2 de SmartPhone " + smartphone2);
	}
}
