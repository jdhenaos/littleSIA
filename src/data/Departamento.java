
package data;

import java.util.List;

public class Departamento {
	
	private String nombre;
	private Facultad facultad;
	private List<Carrera> carreras;
	private List<Profesor> profesores;
	private List<Curso> cursos;
	
	
	////////////////////////////////////////////////
	
	public String getNombre(){
		return this.nombre;
	}
	
	public Facultad getFacultad(){
		return this.facultad;
	}
	
	public List<Carrera> getCarreras(){
		return this.carreras;
	}
	
	public List<Profesor> getProfesores(){
		return this.profesores;
	}
	
	public List<Curso> getCursos(){
		return this.cursos;
	}
	
	////////////////////////////////////////////////////////////////////////
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setFacultad(Facultad facultad){
		this.facultad=facultad;
	}
	
	public void setCarreras(List<Carrera> carreras){
		this.carreras=carreras;
	}
	
	public void setProfesores(List<Profesor> profesores){
		this.profesores=profesores;
	}
	
	public void setCursos(List<Curso> cursos){
		this.cursos=cursos;
	}
	
	///////////////////////////////////////////////////////
	
	public Departamento(String nombre, Facultad facultad, List<Carrera> carreras, List<Profesor> profesores, List<Curso> cursos){
		this.setNombre(nombre);
		this.setFacultad(facultad);
		this.setCarreras(carreras);
		this.setProfesores(profesores);
		this.setCursos(cursos);
	}
	public Departamento(String nombre, Facultad facultad, List<Carrera> carreras, List<Profesor> profesores){
		this(nombre, facultad, carreras, profesores,null);
	}
	public Departamento(String nombre, Facultad facultad, List<Carrera> carreras){
		this(nombre, facultad, carreras, null, null);
	}
	public Departamento(String nombre, Facultad facultad){
		this(nombre, facultad, null, null, null);
	}
	public Departamento(String nombre){
		this(nombre, null, null, null, null);
	}
	
	////////////////////////////////////////////////////////
	
	public Departamento(Facultad facultad, List<Carrera> carreras, List<Profesor> profesores, List<Curso> cursos){
		this(null, facultad, carreras, profesores, cursos);
	}
	
	public Departamento(Facultad facultad, List<Carrera> carreras, List<Profesor> profesores){
		this(null, facultad, carreras, profesores, null);
	}
	public Departamento(Facultad facultad, List<Carrera> carreras){
		this(null, facultad, carreras, null, null);
	}
	public Departamento(Facultad facultad){
		this(null, facultad, null, null, null);
	}
	
	/////////////////////////////////////////////////////////
	
	public Departamento(List<Carrera> carreras, List<Profesor> profesores, List<Curso> cursos){
		this(null, null, carreras, profesores, cursos);
	}
	public Departamento(List<Carrera> carreras, List<Profesor> profesores){
		this(null, null, carreras, profesores, null);
	}
	public Departamento(List<Carrera> carreras){
		this(null, null, carreras, null, null);
	}
	
	public Departamento(){
		this(null, null, null, null, null);
	}
	
	//////////////////////////////////////////////////////////////////
	
	public Departamento(String nombre, List<Carrera> carreras, List<Profesor> profesores, List<Curso> cursos){
		this(nombre, null, carreras, profesores,cursos);
	}
	public Departamento(String nombre, List<Profesor> profesores, List<Curso> cursos){
		this(nombre, null, null, profesores,cursos);
	}
	public Departamento(String nombre, List<Curso> cursos){
		this(nombre, null, null, null,cursos);
	}
	
}
