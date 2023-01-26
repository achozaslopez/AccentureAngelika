package ejercicio05;

public class Main {

	public static void main(String[] args) {
		CocheCRUD cochecrud = new CocheCRUDImpl();
		CocheCRUD.save();
		CocheCRUD.findAll();
		CocheCRUD.delete();
		
		System.out.print(CocheCRUD.save());
		System.out.println(CocheCRUD.findAll());
		System.out.println(CocheCRUD.delete());
	}

}
