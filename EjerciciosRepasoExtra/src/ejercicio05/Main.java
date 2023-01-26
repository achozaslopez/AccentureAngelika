package ejercicio05;
/**
 * 
 * @author Angelika Chozas López
 *
 */
public class Main {

	public static void main(String[] args) {
		CocheCRUDImpl cochecrud = new CocheCRUDImpl();
		cochecrud.save();
		cochecrud.findAll();
		cochecrud.delete();
	}
}
