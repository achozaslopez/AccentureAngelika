package alumno.profesor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Profesor profe1 = new Profesor ("1","Pedro",54,"123456",345f,"23/01=2023");
		Alumno alum1 = new Alumno("1","Rosa",34,"123456",5);
		
		
		HashSet<String>asignatura = new HashSet<String>();
		
		asignatura.add("matemáticas");
		asignatura.add("física");
		asignatura.add("química");
		asignatura.add("informática");
		asignatura.add("inglés");

	}
	
}
