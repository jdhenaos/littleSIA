package data;

import java.util.List;
import data.Sede;

public class Facultad {
	
	private String nombre;
	private Sede sede;
	private List<Departamento> departamentos;
	
	
	///////////////////////////////////////////
	
	public String getNombre(){
		return this.nombre;
	}
	public String getSede(){
		return this.sede.getNombre();
	}
	public List<Departamento> getDepartamentos(){
		return this.departamentos;
	}
	
	///////////////////////////////////////////////
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setSede(Sede sede){
		this.sede = sede;
	}
	public void setDepartamento(List<Departamento> departamentos){
		this.departamentos = departamentos;
	}
	
	//////////////////////////////////////////////
	
	public Facultad(String nombre, Sede sede, List<Departamento> departamentos){
		this.setSede(sede);
		this.setNombre(nombre);
		this.setDepartamento(departamentos);
	}

	public Facultad(String nombre){
		this (nombre,null,null);
	}
	public Facultad(String nombre, Sede sede){
		this (nombre,sede,null);
	}
	public Facultad(String nombre, List<Departamento> departamentos){
		this (nombre,null,departamentos);
	}
	public Facultad(Sede sede){
		this (null,sede,null);
	}
	public Facultad(Sede sede, List<Departamento> departamentos){
		this (null,sede,departamentos);
	}
	public Facultad(List<Departamento> departamentos){
		this (null,null,departamentos);
	}
	public Facultad(){
		this (null,null,null);
	}
	
	
	@Override	
	public String toString(){
		
		String s = "\n";
		s="Facultad: "+this.getNombre()+"\n\nDepartamentos:\n";
		
		int index=0;
		for (Departamento departamento : departamentos)
		    s += "-"+ ++index+ " "+departamento.getNombre()+"\n";
		
		
		return(s);
	}
}
