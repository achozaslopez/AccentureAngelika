package es.rf.tienda.dominio;

import java.time.LocalDate;

import es.rf.tienda.util.Validator;

public class Producto {
	
	private String id_producto;			//Codigo de producto
	
	private String pro_description;		//Descripcion corta
	
	private String pro_desLarga;		//Explicacion
	
	private Double pro_precio;			//Precio
	
	private int pro_stock;				//Stock
	
	private LocalDate pro_fecRepos;		//Fecha prevista reposicion
	
	private LocalDate pro_fecActi;		//Fecha activacion
	
	private LocalDate pro_fecDesacti;	//Fecha desactivacion
	
	private String pro_uniVenta;		//Unidad de venta
	
	private Double pro_cantXUniVenta;	//Cantidad de unidades ultimas
	
	private String pro_uniUltNivel;		//Unidad ultima
	
	private int id_pais;				//Pais de origen
	
	private String pro_usoRecomendado;	//Uso recomendado
	
	private int id_categoria;			//Categoria
	
	private int pro_stkReservado;		//Stock reservado
	
	private int pro_nStkAlto;			//Stock para nivel alto
	
	private int pro_nStkBajo;			//Stock para nivel bajo
	
	private char pro_stat;				//Estado
	
	
	public Producto() {}
	
	
	public boolean isValidLongIdProducto() {
		return Validator.cumpleLongitud(id_producto, 5, 5)&& Validator.isAlfanumeric(id_producto) ;
	}
	
	public boolean isValidLongDescripcion() {
		return Validator.cumpleLongitud(pro_description, 5, 100);
	}
	
	public boolean isValidLongDesLArga() {
		return Validator.cumpleLongitud(pro_desLarga, 5, 2000);
	}
	
	public boolean isValidRangoPrecio() {
		return Validator.cumpleRango(pro_precio, 0, 100);
	}
	
	public boolean isValidFechaRepos() {
		return Validator.valDateMin(pro_fecRepos, LocalDate.now());
	}
	
	public boolean isValidFechaActi() {
		return Validator.valDateMin(pro_fecActi, LocalDate.now());
	}
	
	public boolean isValidFechaDesacti() {
		return Validator.valDateMin(pro_fecDesacti, LocalDate.now());
	}
	
	public boolean isValidUniVenta() {
		return Validator.isAlfanumeric(pro_uniVenta);
	}
	
	public boolean isValidUsoRecomendado() {
		return Validator.isAlfanumeric(pro_usoRecomendado)&& Validator.cumpleLongitud(pro_usoRecomendado, 0, 2000);
	}
	
	

}
