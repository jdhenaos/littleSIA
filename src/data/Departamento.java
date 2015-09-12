
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
	
	@Override	
	public String toString(){
		
		String s = "\n";
		s="Departamentos: "+this.getNombre()+"\n\n[1] Carreras:\n";
		
		for (Carrera carrera : carreras)
		    s += "-"+carrera.getNombre()+"\n";
		
		s+="[2] Profesores\n[3] Cursos";
		
		return(s);
	}
	
	public String listarCarreras(){
		String s = "\n";
		s="Carreras de "+this.getNombre()+"\n\nCarreras:\n";
		
		int index=0;
		for (Carrera carrera : carreras)
		    s += "-"+ ++index+ " "+carrera.getNombre()+"\n";
		
		return(s);
	}
	
	public String listarProfesores(){
		String s = "\n";
		s="Profesores de "+this.getNombre()+"\n\nProfesores:\n";
		
		int index=0;
		for (Profesor profesor: profesores)
		    s += "-"+ ++index+ " "+profesor.getNombre()+"\n";
		
		
		
		return(s);
	}
	
	public String listarCursos(){
		String s = "\n";
		s="Cursos de "+this.getNombre()+"\n\nCursos:\n";
		
		int index=0;
		for (Curso curso : cursos)
		    s += "-"+ ++index+ " "+curso.getNombre()+"\n";
		
		return(s);
	}
	
	
}
