package rf.curso.S4_MiniApi2;

import java.util.List;

import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	CountryController cc = new CountryController();
    	List<Country> ll = cc.leerTodos();
    	listarCtr(ll);
    	
    	System.out.println("-----------------------------");
    	System.out.println(cc.leerUno("BR"));
    	
    	Country datos = cc.leerUno("BR");
    	datos.setCountry_name("Modificado");
    	System.out.println("Afectados: ");
    	
    	System.out.println("-----------------------------");
    	System.out.println(cc.leerUno("BR"));
    	
    	Country datos1 = cc.leerUno("BR");
    	System.out.println("Afectados borrados: ");
    	
    	System.out.println("-----------------------------");
    	System.out.println(cc.leerUno("BR"));
    	
    
    }

    private static void listarCtr(List<Country> ctr) {
    	ctr.stream().forEach(System.out::println);}

}