package data;

import java.util.Date;

import java.util.List;

public class Estudiante {
	
	private int documento;
	private String usuario;
	private String nombre;
	private String apellido;
	private double papa;
	private int semestre;
	private Date fechaDeNacimiento;
	private int codigo;
	private Carrera carrera;
	private List<Grupo> gruposInscritos;
	private List<Nota> notas;

	////////////////////////////////////////////////////
	
	public int getDocumento(){
		return this.documento;
	}
	public String getUsuario(){
		return this.usuario;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
	public double getPAPA(){
		return this.papa;
	}
	public int getSemestre(){
		return this.semestre;
	}
	public Date getFechaDeNacimiento(){
		return this.fechaDeNacimiento;
	}
	public int getCodigo(){
		return this.codigo;
	}
	public Carrera getCarrera(){
		return this.carrera;
	}
	public List<Grupo> getGruposInscritos(){
		return this.gruposInscritos;
	}
	public List<Nota> getNotas(){
		return this.notas;
	}
	
	
	/////////////////////////////////////////////////
	
	public void setDocumento(int documento){
		this.documento=documento;
	}
	public void setUsuario(String usuario){
		this.usuario=usuario;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setPAPA(double papa){
		this.papa=papa;
	}
	public void setSemestre(int semestre){
		this.semestre=semestre;
	}
	public void setFechaDeNacimiento(Date fechanacimiento){
		this.fechaDeNacimiento=fechanacimiento;
	}
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public void setCarrera(Carrera carrera){
		this.carrera=carrera;
	}
	public void setGruposInscritos(List<Grupo> grupos){
		this.gruposInscritos=grupos;
	}
	public void setNotas(List<Nota> notas){
		this.notas=notas;
	}
	
	/////////////////////////////////////////////////////////
	
	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa,int semestre, Date fechanacimiento, int codigo,
																						Carrera carrera,List<Grupo> grupos, List<Nota> notas ){
		
		this.setDocumento(documento);
		this.setApellido(apellido);
		this.setCarrera(carrera);
		this.setCodigo(codigo);
		this.setFechaDeNacimiento(fechanacimiento);
		this.setGruposInscritos(grupos);
		this.setNombre(nombre);
		this.setNotas(notas);
		this.setPAPA(papa);
		this.setSemestre(semestre);
		this.setUsuario(usuario);
		
	}
	
	
	
	public Estudiante(int documento){
		this (documento,null,null,null,0,0,null,0,null,null,null);
	}
	public Estudiante(int documento,String usuario){
		this (documento,usuario,null,null,0,0,null,0,null,null,null);
	}
	public Estudiante(int documento,double papa){
		this (documento,null,null,null,papa,0,null,0,null,null,null);
	}
	public Estudiante(int documento,int codigo){
		this (documento,null,null,null,0,0,null,codigo,null,null,null);
	}
	public Estudiante(int documento,Date fecha){
		this (documento,null,null,null,0,0,fecha,0,null,null,null);
	}
	public Estudiante(int documento,Carrera carrera){
		this (documento,null,null,null,0,0,null,0,carrera,null,null);
	}
	public Estudiante(int documento,List<Grupo> grupos){
		this (documento,null,null,null,0,0,null,0,null,grupos,null);
	}
	/*public Estudiante(int documento,List<Nota> notas){
		this (documento,null,null,null,0,0,null,0,null,null,notas);
	}*/
	
	
	
	public Estudiante(String usuario){
		this (0,usuario,null,null,0,0,null,0,null,null,null);
	}
	
	public Estudiante(String usuario,String apellido){
		this (0,usuario,apellido,null,0,0,null,0,null,null,null);
	}
	
	public Estudiante(String usuario,double papa){
		this (0,usuario,null,null,papa,0,null,0,null,null,null);
	}
	
	public Estudiante(String usuario,int semestre){
		this (0,usuario,null,null,0,semestre,null,0,null,null,null);
	}
	
	public Estudiante(String usuario,Date fecha){
		this (0,usuario,null,null,0,0,fecha,0,null,null,null);
	}
	public Estudiante(String usuario,Carrera carrera){
		this (0,usuario,null,null,0,0,null,0,carrera,null,null);
	}
	public Estudiante(String usuario,List<Grupo> grupos){
		this (0,usuario,null,null,0,0,null,0,null,grupos,null);
	}
	
	/*public Estudiante(String usuario,List<Nota> notas){
		this (0,usuario,null,null,0,0,null,0,null,null,notas);
	}*/
	
	
	public Estudiante(double papa){
		this (0,null,null,null,papa,0,null,0,null,null,null);
	}
	
	public Estudiante(double papa,int codigo){
		this (0,null,null,null,papa,0,null,codigo,null,null,null);
	}
	public Estudiante(double papa,Date fecha){
		this (0,null,null,null,papa,0,fecha,0,null,null,null);
	}
	public Estudiante(double papa,Carrera carr){
		this (0,null,null,null,papa,0,null,0,carr,null,null);
	}
	public Estudiante(double papa,List<Grupo> grupos){
		this (0,null,null,null,papa,0,null,0,null,grupos,null);
	}
	
	
	
	
	
	public Estudiante(Date fecha){
		this (0,null,null,null,0,0,fecha,0,null,null,null);
	}
	
	
	
	
	public Estudiante(Carrera carrera){
		this (0,null,null,null,0,0,null,0,carrera,null,null);
	}
	
	
	
	public Estudiante(List<Grupo> grupos){
		this (0,null,null,null,0,0,null,0,null,grupos,null);
	}
	
	
	/*public Estudiante(List<Nota> notas){
	this (0,null,null,null,0,0,null,0,null,null,notas);
	}*/
	
	
	
	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera){

	this (documento,usuario,apellido,nombre,papa,semestre, fechanacimiento ,codigo,carrera,null,null);

}
	
	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos){

	this (documento,usuario,apellido,nombre,papa,semestre, fechanacimiento ,codigo,carrera,grupos,null);

}
	

	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa,int semestre, Date fechanacimiento, int codigo
			,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,apellido,nombre,papa,semestre, fechanacimiento ,codigo,null,grupos,notas);

}
	
	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa,int semestre, Date fechanacimiento,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,apellido,nombre,papa,semestre, fechanacimiento ,0,carrera,grupos,notas);

}
	
	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa,int semestre,  int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,apellido,nombre,papa,semestre, null ,codigo,carrera,grupos,notas);

}
	
	public Estudiante(int documento, String usuario, String apellido, String nombre,double papa, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,apellido,nombre,papa,0, fechanacimiento ,codigo,carrera,grupos,notas);

}
	public Estudiante(int documento, String usuario, String apellido, String nombre,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,apellido,nombre,0,semestre, fechanacimiento ,codigo,carrera,grupos,notas);

}
	public Estudiante(int documento, String usuario, String apellido,double papa,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,apellido,null,papa,semestre, fechanacimiento ,codigo,carrera,grupos,notas);

}
	public Estudiante(int documento, String usuario,double papa,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,usuario,null,null,papa,semestre, fechanacimiento ,codigo,carrera,grupos,notas);

}
	public Estudiante(int documento,double papa,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (documento,null,null,null,papa,semestre, fechanacimiento ,codigo,carrera,grupos,notas);

}
	public Estudiante( String usuario, String apellido, String nombre,double papa,int semestre, Date fechanacimiento, int codigo,
			Carrera carrera,List<Grupo> grupos,List<Nota> notas){

	this (0,usuario,apellido,nombre,papa,semestre, fechanacimiento ,codigo,carrera,grupos,notas);

}
	
	
	public Estudiante(){
		this (0,null,null,null,0,0,null,0,null,null,null);
	}
	
	
	
}
