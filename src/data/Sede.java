package data;

import java.util.List;

public class Sede {
	
	
	private String nombre;
	private List<Facultad> facultades;
	
	
	//////////////////////////////////////////
	
	public String getNombre(){
		return this.nombre;
	}
	
	public List<Facultad> getFacultades(){
		return this.facultades;
	}
	
	///////////////////////////////////////////////
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setFacultades(List<Facultad> facultades){
		this.facultades=facultades;
	}
	
	
	/////////////////////////////
	
	public Sede(String nombre, List<Facultad> facultades){
		this.setFacultades(facultades);
		this.setNombre(nombre);
		
	}
	
	public Sede(){
		this(null,null);
	}
	
	public Sede(String nombre){
		this(nombre,null);
	}
	
	public Sede(List<Facultad> facultades){
		this(null,facultades);
	}
	
	
	@Override	
	public String toString(){
		
		String s = "\n";
		s="Sede: "+this.getNombre()+"\n\nFacultades:\n";
		
		int index = 0;
		
		for (Facultad facultad : facultades)
		    s += "-"+ ++index+ " " +facultad.getNombre()+"\n";
		
		
		return(s);
	}
	

}


