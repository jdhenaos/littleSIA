
package data;

public class Nota {
	
	private double nota;
	private Grupo grupo;
	private Curso curso;
	private Estudiante estudiante;
	
	/////////////////////////////////////
	
	public double getNota(){
		return this.nota;
	}
	
	public Grupo getGrupo(){
		return this.grupo;
	}
	
	public Curso getCurso(){
		return this.curso;
	}
	
	public Estudiante getEstudiante(){
		return this.estudiante;
	}
	
	////////////////////////////////////////////
	
	
	public void setNota(double nota){
		this.nota=nota;
	}
	
	public void setGrupo(Grupo grupo){
		this.grupo=grupo;
	}
	
	public void setCurso(Curso curso){
		this.curso=curso;
	}
	
	public void setEstudiante(Estudiante estudiante){
		this.estudiante=estudiante;
	}
	
	////////////////////////////////////////////////////
	
	public Nota(double nota, Grupo grupo, Curso curso, Estudiante estudiante){
		this.setNota(nota);
		this.setGrupo(grupo);
		this.setCurso(curso);
		this.setEstudiante(estudiante);
	}
	public Nota(double nota, Grupo grupo, Curso curso){
		this(nota, grupo, curso, null);
	}
	public Nota(double nota, Grupo grupo){
		this(nota, grupo, null, null);
	}
	public Nota(double nota){
		this(nota, null, null, null);
	}
	
	////////////////////////////////////////////////////////////
	
	public Nota(Grupo grupo, Curso curso, Estudiante estudiante){
		this(0, grupo, curso, estudiante);
	}
	public Nota(Grupo grupo, Curso curso){
		this(0, grupo, curso, null);
	}
	public Nota(Grupo grupo){
		this(0, grupo, null, null);
	}
	
	//////////////////////////////////////////////////////////////
	
	public Nota(Curso curso, Estudiante estudiante){
		this(0, null, curso, estudiante);
	}
	public Nota(Curso curso){
		this(0, null, curso, null);
	}
	
	////////////////////////////////////////////////////////////////
	
	public Nota(Estudiante estudiante){
		this(0, null, null, estudiante);
	}
	public Nota(){
		this(0, null, null, null);
	}
	
	///////////////////////////////////////////////////////////////////////
	
	public Nota(double nota, Estudiante estudiante){
		this(nota, null, null, estudiante);
	}
	public Nota(double nota, Curso curso, Estudiante estudiante){
		this(nota, null, curso, estudiante);
	}
	public Nota(double nota, Curso curso){
		this(nota, null, curso, null);
	}
	public Nota(Grupo grupo, Estudiante estudiante){
		this(0, grupo, null, estudiante);
	}
	
		//////////////////////////////////////////////////////////////////////////////////////////
		
	public Nota(double nota, Grupo grupo, Estudiante estudiante){
		this(nota, grupo, null, estudiante);
	}
	
}
