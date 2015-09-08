package data;

import java.util.List;

public class Grupo {
	
	private int numero;
	private String diasDeLaSemana;
	private String horasDelDia;
	private int cupos;
	private String edificio;
	private String salon;
	private Profesor profesor;
	private Curso curso;
	private List<Estudiante> estudiantes;
	
	////////////////////////////////////////
	
	public int getNumero(){
		return this.numero;
	}
	public String getDiasDeLaSemana(){
		return this.diasDeLaSemana;
	}
	public String getHorasDelDia(){
		return this.horasDelDia;
	}
	public int getCupos(){
		return this.cupos;
	}
	public String getEdificio(){
		return this.edificio;
	}
	public String getSalon(){
		return this.salon;
	}
	public String getProfesor(){
		return this.profesor.getNombre();
	}
	public String getCurso(){
		return this.curso.getNombre();
	}
	public List<Estudiante> getEstudiantes(){
		return this.estudiantes;
	}
	
	////////////////////////////////////////////////////////
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setDiasDeLaSemana(String diasDeLaSemana){
		this.diasDeLaSemana = diasDeLaSemana;
	}
	public void setHorasDelDia(String horasDelDia){
		this.horasDelDia = horasDelDia;
	}
	public void setCupos(int cupos){
		this.cupos = cupos;
	}
	public void setEdificio(String edificio){
		this.edificio = edificio;
	}
	public void setSalon(String salon){
		this.salon = salon;
	}
	public void setProfesor(Profesor profesor){
		this.profesor = profesor;
	}
	public void setCurso(Curso curso){
		this.curso = curso;
	}
	public void setEstudiantes(List<Estudiante> estudiantes){
		this.estudiantes = estudiantes;
	}
	
	/////////////////////////////////////////////////////////
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia,int cupos,String edificio,
			String salon,Profesor profesor,Curso curso,List<Estudiante> estudiantes){
		this.setNumero(numero);
		this.setDiasDeLaSemana(diasDeLaSemana);
		this.setHorasDelDia(horasDelDia);
		this.setCupos(cupos);
		this.setEdificio(edificio);
		this.setSalon(salon);
		this.setProfesor(profesor);
		this.setCurso(curso);
		this.setEstudiantes(estudiantes);
	}
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia,int cupos,String edificio,
			String salon,Profesor profesor,Curso curso){
		this(numero, diasDeLaSemana, horasDelDia, cupos, edificio, salon, profesor, curso, null);
	}
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia,
			int cupos,String edificio,String salon,Profesor profesor){
		this(numero, diasDeLaSemana, horasDelDia, cupos, edificio, salon, profesor, null, null);
	}
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia,
			int cupos,String edificio,String salon){
		this(numero, diasDeLaSemana, horasDelDia, cupos, edificio, salon, null, null, null);
	}
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia,int cupos,String edificio){
		this(numero, diasDeLaSemana, horasDelDia, cupos, edificio, null, null, null, null);
	}
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia,int cupos){
		this(numero, diasDeLaSemana, horasDelDia, cupos, null, null, null, null, null);
	}
	
	public Grupo(int numero, String diasDeLaSemana,String horasDelDia){
		this(numero, diasDeLaSemana, horasDelDia, 0, null, null, null, null, null);
	}

	
	public Grupo(int numero){
		this(numero,null,null,0,null,null,null,null,null);
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	
	public Grupo(int numero, List<Estudiante> estudiantes){
		this(numero,null,null,0,null,null,null,null,estudiantes);
	}
	public Grupo(int numero, Curso curso){
		this(numero,null,null,0,null,null,null,curso,null);
	}
	public Grupo(int numero, Profesor profesor){
		this(numero,null,null,0,null,null,profesor,null,null);
	}
	public Grupo(int numero, String salon){
		this(numero,null,null,0,null,salon,null,null,null);
	}
	
	public Grupo(int numero, int cupos){
		this(numero,null,null,cupos,null,null,null,null,null);
	}

	
	///////////////////////////////////////////////////////////////////////////////////
	
	public Grupo(String horasDelDia,int cupos,String edificio,
			String salon,Profesor profesor,Curso curso,List<Estudiante> estudiantes){
		this(0, null, horasDelDia, cupos, edificio, salon, profesor, curso, estudiantes);
	}
	public Grupo(String horasDelDia,int cupos,String edificio,
			String salon,Profesor profesor,Curso curso){
		this(0, null, horasDelDia, cupos, edificio, salon, profesor, curso, null);
	}
	public Grupo(String horasDelDia,int cupos,String edificio,
			String salon,Profesor profesor){
		this(0, null, horasDelDia, cupos, edificio, salon, profesor, null, null);
	}
	public Grupo(String horasDelDia,int cupos,String edificio,
			String salon){
		this(0, null, horasDelDia, cupos, edificio, salon, null, null, null);
	}
	public Grupo(String horasDelDia,int cupos,String edificio){
		this(0, null, horasDelDia, cupos, edificio, null, null, null, null);
	}
	public Grupo(String horasDelDia,int cupos){
		this(0, null, horasDelDia, cupos, null, null, null, null, null);
	}
	public Grupo(String horasDelDia){
		this(0, null, horasDelDia, 0, null, null, null, null, null);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	public Grupo(int cupos,String edificio,
			String salon,Profesor profesor,Curso curso,List<Estudiante> estudiantes){
		this(0, null, null, cupos, edificio, salon, profesor, curso, estudiantes);
	}
	public Grupo(int cupos,String edificio,
			String salon,Profesor profesor,Curso curso){
		this(0, null, null, cupos, edificio, salon, profesor, curso, null);
	}
	public Grupo(int cupos,String edificio,
			String salon,Profesor profesor){
		this(0, null, null, cupos, edificio, salon, profesor, null, null);
	}

	
}

