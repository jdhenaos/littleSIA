package data;

import java.util.List;

import java.util.Date;

public class Profesor {
	
	private String nombre;
	private String apellido;
	private int documento;
	private Date fechaDeNacimiento;
	private String titulo;
	private Departamento departamento;
	private List<Grupo> grupos;
	
	
	///////////////////////////////////////
	
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public int getDocumento(){
		return this.documento;
	}
	
	public Date getFechaDeNacimiento(){
		return this.fechaDeNacimiento;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public String getDepartamento(){
		return this.departamento.getNombre();
	}
	
	public List<Grupo> getGrupos(){
		return this.grupos;
	}
	
	
	///////////////////////////////////////////////
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setDocumento(int documento){
		this.documento=documento;
	}
	
	public void setFechaDeNacimiento(Date fechaDeNacimiento){
		this.fechaDeNacimiento=fechaDeNacimiento;
	}
	
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	
	public void setDepartamento(Departamento departamento){
		this.departamento=departamento;
	}
	
	public void setGrupos(List<Grupo> grupos){
		this.grupos=grupos;
	}
	
	//////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDocumento(documento);
		this.setFechaDeNacimiento(fechaDeNacimiento);
		this.setTitulo(titulo);
		this.setDepartamento(departamento);
		this.setGrupos(grupos);
	}
	
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, 
			String titulo, Departamento departamento){
		this(nombre, apellido, documento, fechaDeNacimiento, titulo, departamento, null);
	}
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, 
			String titulo){
		this(nombre, apellido, documento, fechaDeNacimiento, titulo, null, null);
	}
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento){
		this(nombre, apellido, documento, fechaDeNacimiento, null, null, null);
	}
	public Profesor(String nombre, String apellido, int documento){
		this(nombre, apellido, documento, null, null, null, null);
	}
	public Profesor(String nombre, String apellido){
		this(nombre, apellido, 0, null, null, null, null);
	}
	public Profesor(String nombre){
		this(nombre, null, 0, null, null, null, null);
	}
	
	///////////////////////////////////////////////////////////////
	
	public Profesor(String apellido, int documento, Date fechaDeNacimiento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(null, apellido, documento, fechaDeNacimiento, titulo, departamento, grupos);
	}
	public Profesor(String apellido, int documento, Date fechaDeNacimiento, 
			String titulo, Departamento departamento){
		this(null, apellido, documento, fechaDeNacimiento, titulo, departamento, null);
	}
	public Profesor(String apellido, int documento, Date fechaDeNacimiento, 
			String titulo){
		this(null, apellido, documento, fechaDeNacimiento, titulo, null, null);
	}
	public Profesor(String apellido, int documento, Date fechaDeNacimiento){
		this(null, apellido, documento, fechaDeNacimiento, null, null, null);
	}
	public Profesor(String apellido, int documento){
		this(null, apellido, documento, null, null, null, null);
	}
	
	/////////////////////////////////////////////////////////////////
	
	public Profesor(int documento, Date fechaDeNacimiento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(null, null, documento, fechaDeNacimiento, titulo, departamento, grupos);
	}
	public Profesor(int documento, Date fechaDeNacimiento, 
			String titulo, Departamento departamento){
		this(null, null, documento, fechaDeNacimiento, titulo, departamento, null);
	}
	public Profesor(int documento, Date fechaDeNacimiento, 
			String titulo){
		this(null, null, documento, fechaDeNacimiento, titulo, null, null);
	}
	public Profesor(int documento, Date fechaDeNacimiento){
		this(null, null, documento, fechaDeNacimiento, null, null, null);
	}
	public Profesor(int documento){
		this(null, null, documento, null, null, null, null);
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public Profesor(Date fechaDeNacimiento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(null, null, 0, fechaDeNacimiento, titulo, departamento, grupos);
	}
	public Profesor(Date fechaDeNacimiento, String titulo, Departamento departamento){
		this(null, null, 0, fechaDeNacimiento, titulo, departamento, null);
	}
	public Profesor(Date fechaDeNacimiento, String titulo){
		this(null, null, 0, fechaDeNacimiento, titulo, null, null);
	}
	public Profesor(Date fechaDeNacimiento){
		this(null, null, 0, fechaDeNacimiento, null, null, null);
	}
	
	//////////////////////////////////////////////////////////////////////
	
	public Profesor(String titulo, Departamento departamento, List<Grupo> grupos){
		this(null, null, 0, null, titulo, departamento, grupos);
	}
	public Profesor(String titulo, Departamento departamento){
		this(null, null, 0, null, titulo, departamento, null);
	}
	
	///////////////////////////////////////////////////////////////////////
	
	public Profesor(Departamento departamento, List<Grupo> grupos){
		this(null, null, 0, null, null, departamento, grupos);
	}
	public Profesor(Departamento departamento){
		this(null, null, 0, null, null, departamento, null);
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	public Profesor(List<Grupo> grupos){
		this(null, null, 0, null, null, null, grupos);
	}
	public Profesor(){
		this(null, null, 0, null, null, null, null);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, 
			String titulo, List<Grupo> grupos){
		this(nombre, apellido, documento, fechaDeNacimiento, titulo, null, grupos);
	}
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, Departamento departamento, List<Grupo> grupos){
		this(nombre, apellido, documento, fechaDeNacimiento, null, departamento, grupos);
	}
	public Profesor(String nombre, String apellido, int documento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(nombre, apellido, documento, null, titulo, departamento, grupos);
	}
	public Profesor(String nombre, String apellido, Date fechaDeNacimiento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(nombre, apellido, 0, fechaDeNacimiento, titulo, departamento, grupos);
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, Date fechaDeNacimiento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(nombre, null, 0, fechaDeNacimiento, titulo, departamento, grupos);
	}
	public Profesor(String nombre, String apellido, String titulo, Departamento departamento, List<Grupo> grupos){
		this(nombre, apellido, 0, null, titulo, departamento, grupos);
	}
	public Profesor(String nombre, String apellido, int documento, Departamento departamento, List<Grupo> grupos){
		this(nombre, apellido, documento, null, null, departamento, grupos);
	}
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, 
			List<Grupo> grupos){
		this(nombre, apellido, documento, fechaDeNacimiento, null, null, grupos);
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, int documento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(nombre, null, documento, null, titulo, departamento, grupos);
	}
	public Profesor(String nombre, int documento, Date fechaDeNacimiento, 
			 Departamento departamento, List<Grupo> grupos){
		this(nombre, null, documento, fechaDeNacimiento, null, departamento, grupos);
	}
	public Profesor(String nombre, int documento, Date fechaDeNacimiento, 
			String titulo, List<Grupo> grupos){
		this(nombre, null, documento, fechaDeNacimiento, titulo, null, grupos);
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, Date fechaDeNacimiento, 
		 Departamento departamento, List<Grupo> grupos){
		this(nombre, apellido, 0, fechaDeNacimiento, null, departamento, grupos);
	}
	public Profesor(String nombre, String apellido, Date fechaDeNacimiento, 
			String titulo, List<Grupo> grupos){
		this(nombre, apellido, 0, fechaDeNacimiento, titulo, null, grupos);
	}
	public Profesor(String nombre, String apellido, Date fechaDeNacimiento, 
			String titulo, Departamento departamento){
		this(nombre, apellido, 0, fechaDeNacimiento, titulo, departamento, null);
	}
	
	/////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, int documento, 
			String titulo, List<Grupo> grupos){
		this(nombre, apellido, documento, null, titulo, null, grupos);
	}
	public Profesor(String nombre, String apellido, int documento,  
			String titulo, Departamento departamento){
		this(nombre, apellido, documento, null, titulo, departamento, null);
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, int documento, Date fechaDeNacimiento, 
			Departamento departamento){
		this(nombre, apellido, documento, fechaDeNacimiento, null, departamento, null);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(int documento, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(null, null, documento, null, titulo, departamento, grupos);
	}
	
	public Profesor(int documento, Date fechaDeNacimiento, 
			Departamento departamento, List<Grupo> grupos){
		this(null, null, documento, fechaDeNacimiento, null, departamento, grupos);
	}
	public Profesor(int documento, Date fechaDeNacimiento, 
			String titulo, List<Grupo> grupos){
		this(null, null, documento, fechaDeNacimiento, titulo, null, grupos);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, 
			String titulo, Departamento departamento, List<Grupo> grupos){
		this(nombre, null, 0, null, titulo, departamento, grupos);
	}
	public Profesor(String nombre, Date fechaDeNacimiento, 
			Departamento departamento, List<Grupo> grupos){
		this(nombre, null, 0, fechaDeNacimiento, null, departamento, grupos);
	}
	public Profesor(String nombre, Date fechaDeNacimiento, 
			String titulo, List<Grupo> grupos){
		this(nombre, null, 0, fechaDeNacimiento, titulo, null, grupos);
	}
	public Profesor(String nombre, Date fechaDeNacimiento, 
			String titulo, Departamento departamento){
		this(nombre, null, 0, fechaDeNacimiento, titulo, departamento, null);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String apellido, int documento, Departamento departamento, List<Grupo> grupos){
		this(null, apellido, documento, null, null, departamento, grupos);
	}
	
	public Profesor(String apellido, int documento, 
			String titulo, List<Grupo> grupos){
		this(null, apellido, documento, null, titulo, null, grupos);
	}
	public Profesor(String apellido, int documento, 
			String titulo, Departamento departamento){
		this(null, apellido, documento, null, titulo, departamento, null);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String apellido, int documento, Date fechaDeNacimiento, List<Grupo> grupos){
		this(null, apellido, documento, fechaDeNacimiento, null, null, grupos);
	}
	public Profesor(String apellido, int documento, Date fechaDeNacimiento, 
			Departamento departamento){
		this(null, apellido, documento, fechaDeNacimiento, null, departamento, null);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, List<Grupo> grupos){
		this(nombre, apellido, 0, null, null , null, grupos);
	}
	public Profesor(String nombre, String apellido,Departamento departamento){
		this(nombre, apellido, 0, null, null, departamento, null);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(String nombre, String apellido, Date fechaDeNacimiento){
		this(nombre, apellido, 0, fechaDeNacimiento, null, null, null);
	}
	public Profesor(String nombre, Date fechaDeNacimiento, 
			String titulo){
		this(nombre, null, 0, fechaDeNacimiento, titulo, null, null);
	}
	public Profesor(String nombre, Date fechaDeNacimiento, 
			Departamento departamento){
		this(nombre, null, 0, fechaDeNacimiento, null, departamento, null);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public Profesor(int documento, Departamento departamento){
		this(null, null, documento, null, null, departamento, null);
	}
	public Profesor(Date fechaDeNacimiento, List<Grupo> grupos){
		this(null, null, 0, fechaDeNacimiento, null, null, grupos);
	}
	public Profesor(String nombre, Date fechaDeNacimiento, List<Grupo> grupos){
		this(nombre, null, 0, fechaDeNacimiento, null, null, grupos);
	}
	public Profesor(String nombre, List<Grupo> grupos){
		this(nombre, null, 0, null, null, null, grupos);
	}
	public Profesor(String nombre, Date fechaDeNacimiento){
		this(nombre, null, 0, fechaDeNacimiento, null, null, null);
	}
	public Profesor(int documento, 
			String titulo){
		this(null, null, documento, null, titulo, null, null);
	}
	public Profesor(int documento,Departamento departamento, List<Grupo> grupos){
		this(null, null, documento, null, null, departamento, grupos);
	}
	public Profesor(int documento, Date fechaDeNacimiento, 
			Departamento departamento){
		this(null, null, documento, fechaDeNacimiento, null, departamento, null);
	}
	public Profesor(String nombre, String apellido, 
			String titulo, List<Grupo> grupos){
		this(nombre, apellido, 0, null, titulo, null, grupos);
	}
	public Profesor(Date fechaDeNacimiento, 
			Departamento departamento, List<Grupo> grupos){
		this(null, null, 0, fechaDeNacimiento, null, departamento, grupos);
	}
	public Profesor(Date fechaDeNacimiento, 
			Departamento departamento){
		this(null, null, 0, fechaDeNacimiento, null, departamento, null);
	}
	public Profesor(int documento, 
			String titulo, List<Grupo> grupos){
		this(null, null, documento, null, titulo, null, grupos);
	}
	public Profesor(String nombre, String apellido, Date fechaDeNacimiento, 
			String titulo){
		this(nombre, apellido, 0, fechaDeNacimiento, titulo, null, null);
	}
	
}