package data;

import java.util.List;

public class Carrera {
	
	private String nombre;
	private int codigo;
	private Departamento departamento;
	private List<Estudiante> estudiantes;

	////////////////////////////////////////
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	
	public void setDepartamento(Departamento departamento){
		this.departamento=departamento;
	}
	public void setEstudiantes(List<Estudiante> estudiantes){
		this.estudiantes=estudiantes;
	}
	
	///////////////////////////////////////////
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public Departamento getDepartamento(){
		return this.departamento;
	}
	
	public List<Estudiante> getEstudiantes(){
		return this.estudiantes;
	}
	
	//////////////////////////////////////
	
	public Carrera(String nombre, int codigo, Departamento departamento, List<Estudiante> estudiantes){
		this.setCodigo(codigo);
		this.setDepartamento(departamento);
		this.setEstudiantes(estudiantes);
		this.setNombre(nombre);
	}
	
	
	
	public Carrera(String nombre){
		this (nombre,0,null,null);
	}
	
	public Carrera(String nombre, int codigo){
		this (nombre,codigo,null,null);
	}
	public Carrera(String nombre, List<Estudiante> estudiantes){
		this(nombre, 0, null,estudiantes);
	}
	public Carrera(String nombre, Departamento departamento){
		this(nombre, 0, departamento,null);
	}
	public Carrera(String nombre, Departamento departamento, List<Estudiante> estudiantes){
		this(nombre, 0, departamento,estudiantes);
	}
	public Carrera(String nombre, int codigo, List<Estudiante> estudiantes){
		this(nombre, codigo, null,estudiantes);
	}
	public Carrera(String nombre, int codigo, Departamento departamento){
		this (nombre,codigo,departamento,null);
	}
	
	/////////////////////////////
	
	public Carrera(List<Estudiante> estudiantes){
		this(null,0,null,estudiantes);
	}
	public Carrera(int codigo,List<Estudiante> estudiantes){
		this(null,0,null,estudiantes);
	}
	public Carrera(int codigo, Departamento departamento, List<Estudiante> estudiantes){
		this(null,codigo,departamento,estudiantes);
	}
	
	
	///////////////////////
	
	public Carrera(Departamento departamento){
		this(null,0,departamento,null);
	}
	public Carrera(Departamento departamento, List<Estudiante> estudiantes){
		this(null,0,departamento,estudiantes);
	}
		
	///////////////////////////
	
	public Carrera(int codigo){
		this(null, codigo, null, null);
	}
	
	public Carrera(int codigo, Departamento departamento){
		this(null, codigo, departamento, null);
	}
	
	
	
	public Carrera(){
		this (null,0,null,null);
	}
	
	
	
	
}
