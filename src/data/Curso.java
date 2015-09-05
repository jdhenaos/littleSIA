package data;

import java.util.List;

public class Curso {
	
	private int codigo;
	private String nombre;
	private char tipologia;
	private int creditos;
	private Departamento departamento;
	private List<Grupo> grupos;
	
	
	////////////////////////////////////////////
	
	public int getCodigo(){
		return this.codigo;
	}
	public String getNombre(){
		return this.nombre;
	}
	public char getTipologia(){
		return this.tipologia;
	}
	public int getCreditos(){
		return this.creditos;
	}
	public String getDepartamento(){
		return this.departamento.getNombre();
	}
	public List<Grupo> getGrupos(){
		return this.grupos;
	}
	
	////////////////////////////////////////////////////////////
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setTipologia(char tipologia){
		this.tipologia = tipologia;
	}
	public void setCreditos(int creditos){
		this.creditos = creditos;
	}
	public void setDepartamento(Departamento departamento){ 
		this.departamento = departamento;						
	}
	public void setGrupos(List<Grupo> grupos){
		this.grupos = grupos;
	}
	
	//////////////////////////////////////////////////////////////
	
	public Curso(String nombre, int codigo, char tipologia, int creditos, Departamento departamento, List<Grupo> grupos){
		this.setCodigo(codigo);
		this.setCreditos(creditos);
		this.setTipologia(tipologia);
		this.setDepartamento(departamento);
		this.setGrupos(grupos);
		this.setNombre(nombre);
	}
	
	public Curso(String nombre){
		this(nombre,0,'0',0,null,null);
	}
	public Curso(String nombre, char tipologia){
		this(nombre,0,tipologia,0,null,null);
	}
	public Curso(String nombre, int creditos){
		this(nombre,0,'0',creditos,null,null);
	}
	public Curso(String nombre, int i, String string, int j, Departamento departamento){
		this(nombre,0,'0',0,departamento,null);
	}
	public Curso(String nombre, List<Grupo> grupos){
		this(nombre, 0,'0',0,null,grupos);
	}
	public Curso(String nombre, int codigo, char tipologia){
		this(nombre,codigo,tipologia,0,null,null);
	}
	public Curso(String nombre, int codigo, char tipologia,int creditos){
		this(nombre,codigo,tipologia,creditos,null,null);
	}
	public Curso(String nombre, int codigo, char tipologia,int creditos, Departamento departamento){
		this(nombre,codigo,tipologia,creditos,departamento,null);
	}
	public Curso(String nombre, Departamento departamento, List<Grupo> grupos){
		this(nombre,0,'0',0,departamento,grupos);
	}
	public Curso(String nombre,int codigo,Departamento departamento, List<Grupo> grupos){
		this(nombre,codigo,'0',0,departamento,grupos);
	}
	public Curso(String nombre,char tipologia,int creditos,Departamento departamento, List<Grupo> grupos){
		this(nombre,0,tipologia,creditos,departamento,grupos);
	}
	public Curso(String nombre,int codigo,int creditos,Departamento departamento, List<Grupo> grupos){
		this(nombre,codigo,'0',creditos,departamento,grupos);
	}
	public Curso(String nombre,int codigo,char tipologia,Departamento departamento, List<Grupo> grupos){
		this(nombre,codigo,tipologia,0,departamento,grupos);
	}
	public Curso(String nombre,int codigo,char tipologia,int creditos,List<Grupo> grupos){
		this(nombre,codigo,tipologia,creditos,null,grupos);
	}
	public Curso(String nombre, int codigo, List<Grupo> grupos){
		this(nombre,codigo,'0',0,null,grupos);
	}
	public Curso(String nombre, int codigo,char tipologia,List<Grupo> grupos){
		this(nombre,codigo,tipologia,0,null,grupos);
	}
	public Curso(String nombre, int codigo, Departamento departamento){
		this (nombre,codigo,'0',0,departamento,null);
	}
	public Curso(String nombre,char tipologia, int creditos){
		this (nombre,0,tipologia,creditos,null,null);
	}
	public Curso(String nombre,char tipologia, int creditos,List<Grupo> grupos){
		this (nombre,0,tipologia,creditos,null,grupos);
	}
	public Curso(String nombre,int codigo,int creditos,List<Grupo> grupos){
		this (nombre,codigo,'0',creditos,null,grupos);
	}
	public Curso(String nombre,char tipologia,Departamento departamento,List<Grupo> grupos){
		this (nombre,0,tipologia,0,departamento,grupos);
	}
	public Curso(String nombre, int codigo, char tipologia, Departamento departamento){
		this (nombre,codigo,tipologia,0,departamento,null);
	}
	public Curso(String nombre, int codigo, int creditos, Departamento departamento){
		this (nombre,codigo,'0',creditos,departamento,null);
	}
	public Curso(String nombre,char tipologia, int creditos, Departamento departamento){
		this (nombre,0,tipologia,creditos,departamento,null);
	}
	public Curso(String nombre,char tipologia,Departamento departamento){
		this (nombre,0,tipologia,0,departamento,null);
	}
	
	/////////////////////////////
	
	public Curso(int codigo){
		this(null,codigo,'0',0,null,null);
	}
	public Curso(int codigo, char tipologia){
		this(null,codigo,tipologia,0,null,null);
	}
	public Curso(int codigo, int creditos){
		this(null,codigo,'0',creditos,null,null);
	}
	public Curso(int codigo, Departamento departamento){
		this(null,codigo,'0',0,departamento, null);
	}
	public Curso(int codigo, List<Grupo> grupos){
		this(null,codigo,'0',0,null,grupos);
	}
	public Curso(int codigo, char tipologia, int creditos){
		this(null,codigo,tipologia,creditos,null,null);
	}
	public Curso(int codigo, char tipologia, int creditos, Departamento departamento){
		this(null,codigo,tipologia,creditos,departamento,null);
	}
	public Curso(int codigo, char tipologia, int creditos, Departamento departamento, List<Grupo> grupos){
		this(null,codigo,tipologia,creditos,departamento,grupos);
	}
	public Curso(int codigo,int creditos, Departamento departamento, List<Grupo> grupos){
		this(null,codigo,'0',creditos,departamento,grupos);
	}
	public Curso(int codigo, char tipologia,Departamento departamento, List<Grupo> grupos){
		this(null,codigo,tipologia,0,departamento,grupos);
	}
	public Curso(int codigo, char tipologia, int creditos, List<Grupo> grupos){
		this(null,codigo,tipologia,creditos,null,grupos);
	}
	public Curso(int codigo, Departamento departamento, List<Grupo> grupos){
		this(null,codigo,'0',0,departamento,grupos);
	}
	public Curso(int codigo, char tipologia, List<Grupo> grupos){
		this(null,codigo,tipologia,0,null,grupos);
	}
	public Curso(int codigo, char tipologia, Departamento departamento){
		this(null,codigo,tipologia,0,departamento,null);
	}
	public Curso(int codigo, int creditos, Departamento departamento){
		this(null,codigo,'0',creditos,departamento,null);
	}
	public Curso(int codigo, int creditos, List<Grupo> grupos){
		this(null,codigo,'0',creditos,null,grupos);
	}
	
	/////////////////////////////
	
	public Curso(char tipologia){
		this(null,0,tipologia,0,null,null);
	}
	public Curso(char tipologia, int creditos){
		this(null,0,tipologia,creditos,null,null);
	}
	public Curso(char tipologia, Departamento departamento){
		this(null,0,tipologia,0,departamento,null);
	}
	public Curso(char tipologia, List<Grupo> grupos){
		this(null,0,tipologia,0,null,grupos);
	}
	public Curso(char tipologia,Departamento departamento,List<Grupo> grupos){
		this(null,0,tipologia,0,departamento,grupos);
	}
	public Curso(char tipologia,int creditos,Departamento departamento,List<Grupo> grupos){
		this(null,0,tipologia,creditos,departamento,grupos);
	}
	public Curso(char tipologia,int creditos,List<Grupo> grupos){
		this(null,0,tipologia,creditos,null,grupos);
	}
	public Curso(char tipologia,int creditos,Departamento departamento){
		this(null,0,tipologia,creditos,departamento,null);
	}
	
	/////////////////////////////
	
	public Curso(Departamento departamento){
		this(null,0,'0',0,departamento,null);
	}
	public Curso(Departamento departamento, List<Grupo> grupos){
		this(null,0,'0',0,departamento,grupos);
	}
	
	//////////////////////////////
	
	public Curso(List<Grupo> grupos){
		this(null,0,'0',0,null,grupos);
	}
	
	/////////////////////////////
	
	public Curso(){
		this(null,0,'0',0,null,null);
	}
}
