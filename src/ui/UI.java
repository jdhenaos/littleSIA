package ui;

import java.util.ArrayList;

import data.Carrera;
import data.Curso;
import data.Departamento;
import data.Estudiante;
import data.Facultad;
import data.Grupo;
import data.Nota;
import data.Profesor;
import data.Sede;

public class UI {
	
	private String Separador= "______________________________"; 
	
	public void imprimirSede(Sede sede){
		
		System.out.print(sede.toString());	
	}
	
	public void Inicio(ArrayList<Sede> sedes){
		System.out.println("Bienvenidos al miniSIA, escoga su sede:\n"+Separador+"\n");
		
		int index=0;
		for(Sede s:sedes)
			System.out.print("["+ ++index +"] "+s.getNombre()+"\n");
	}

}

