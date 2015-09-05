package businessLogic;

import data.Carrera;
import data.Curso;
import data.Departamento;
import data.Estudiante;
import data.Facultad;
import data.Grupo;
import data.Nota;
import data.Profesor;
import data.Sede;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CrearSia {

	public static void main(String[] args) {
		
		Sede sede1 = new Sede("Bogota");
		Sede sede2 =new Sede("Medellin");
		
		//////////////////////////////////////////////////////////////////////////
		
		ArrayList<Facultad> facultades = new ArrayList<Facultad>();
		
		Facultad facultad1 = new Facultad("Ingenieria",sede1);
		Facultad facultad2 = new Facultad("Lenguas", sede2);
		
		facultades.add(facultad1);
		facultades.add(facultad2);
		
		
		///////////////////////////////////////////////////////////////////////
		
		ArrayList<Carrera> carrerasMat = new ArrayList<Carrera>();
		ArrayList<Carrera> carrerasLen = new ArrayList<Carrera>();
		
		Carrera carrera1= new Carrera("Matematica Aplicada", 1025566);
		Carrera carrera1_1 = new Carrera("Estadistica", 67465657);
		
		Carrera carrera2 = new Carrera("Filologia en Aleman", 5698845);
		Carrera carrera2_2 = new Carrera("Lenguas Modernas", 577878895);
		
		carrerasMat.add(carrera1);
		carrerasMat.add(carrera1_1);
		
		carrerasLen.add(carrera2);
		carrerasLen.add(carrera2_2);
		
		/////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Departamento> departamento1 = new ArrayList<Departamento>();
		ArrayList<Departamento> departamento2 = new ArrayList<Departamento>();
		
		Departamento departamentoBtaMat = new Departamento("Matematicas", facultad1, carrerasMat);
		Departamento departamentoBtaLen = new Departamento("Humanas", facultad2, carrerasLen);
		
		Departamento departamentoMedMat = new Departamento("Matematicas", facultad1, carrerasMat);
		Departamento departamentoMedLen = new Departamento("Humanas", facultad2, carrerasLen);
		
		departamento1.add(departamentoBtaMat);
		departamento1.add(departamentoBtaLen);
		
		departamento2.add(departamentoMedMat);
		departamento2.add(departamentoMedLen);
		
		/////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Curso> cursosMat = new ArrayList<Curso>();
		ArrayList<Curso> cursosLen = new ArrayList<Curso>();
		
		Curso curso1 = new Curso(3312, "Introduccion", "O", 3, departamentoBtaMat);
		Curso curso1_1 = new Curso(2212, "Introduccion", "L", 3, departamentoMedMat);
		
		Curso curso2 = new Curso(3220, "Filologia", "L", 4, departamentoBtaLen);
		Curso curso2_2 = new Curso(3230, "Filologia", "O", 4, departamentoMedLen);
		
		cursosMat.add(curso1);
		cursosMat.add(curso1_1);
		
		cursosLen.add(curso2);
		cursosLen.add(curso2_2);
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaProfesor1 = null;
		Date fechaProfesor1_1 = null;
		
		Date fechaProfesor2 = null;
		Date fechaProfesor2_2 = null;
		
		fechaProfesor1 = formato.parse("03/08/1957");
		fechaProfesor1_1 = formato.parse("15/12/1960");
		
		fechaProfesor2 = formato.parse("06/10/1975");
		fechaProfesor2_2 = formato.parse("26/03/1985");
		
		ArrayList<Profesor> profesoresMat = new ArrayList<Profesor>();
		ArrayList<Profesor> profesoresLen = new ArrayList<Profesor>();
		
		Profesor profesor1 = new Profesor("Ricardo", "Acosta", fechaProfesor1, "Ingeniero Mecanico");
		Profesor prfesor1_1 = new Profesor("Sara", "Gomez", fechaProfesor1_1, "Ingeniera de Sistemas");
		
		Profesor profesor2 = new Profesor("Santiago", "Arias", fechaProfesor2, "Filologo");
		Profesor profesor2_2 = new Profesor("Maria", "Rodriguez", fechaProfesor2_2, "Licenciada en Lenguas Modernas");
		
		profesoresMat.add(profesor1);
		profesoresMat.add(prfesor1_1);
		
		profesoresLen.add(profesor2);
		profesoresLen.add(profesor2_2);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		SimpleDateFormat formato2 = new SimpleDateFormat();
		
		Date fechaEstudiante1 = null;
		Date fechaEstudiante1_1 = null;
		Date fechaEstudiante1_2 = null;
		Date fechaEstudiante1_3 = null;
		
		Date fechaEstudiante2 = null;
		Date fechaEstudiante2_1 = null;
		Date fechaEstudiante2_2 = null;
		Date fechaEstudiante2_3 = null;
		
		fechaEstudiante1 = formato.parse("14/11/1990");
		fechaEstudiante1_1 = formato.parse("09/05/1991");
		fechaEstudiante1_2 = formato.parse("06/07/1994");
		fechaEstudiante1_3 = formato.parse("30/01/1989");
		
		ArrayList<Estudiante> estudiantesMatApl = new ArrayList<Estudiante>();
		ArrayList<Estudiante> estudiantesEstad = new ArrayList<Estudiante>();
		
		ArrayList<Estudiante> estudiantesFilAl = new ArrayList<Estudiante>();
		ArrayList<Estudiante> estudiantesLenMod = new ArrayList<Estudiante>();
		
		Estudiante estudiante1 = new Estudiante(1713123789, "gbedoyar", "Bedoya", "Guillermo", 3, fechaEstudiante1, 1253, carrera1);
		Estudiante estudiante1_1 = new Estudiante(1113778990, "phurtadoz", "Hurtado", "Pilar", 4, fechaEstudiante1_1, 1192, carrera1);
		Estudiante estudiante1_2 = new Estudiante(1115713446, "grojasp", "Rojas", "Gustavo", 4, fechaEstudiante1_2, 1188, carrera1_1);
		Estudiante estudiante1_3 = new Estudiante(1980970115, "vlopezd", "Lopez", "Vanesa", 5, fechaEstudiante1_3, 1090, carrera1_1);
		
		Estudiante estudiante2 = new Estudiante(1023073913, "jcorredorh", "Corredor", "Jhon", 8, fechaEstudiante2, 7890, carrera2);
		Estudiante estudiante2_1 = new Estudiante(1115678243, "mguzmanr", "Guzman", "Marta", 7, fechaEstudiante2_1, 7934, carrera2);
		Estudiante estudiante2_2 = new Estudiante(1334609717, "ejimenezd", "Jimenez", "Esteban", 9, fechaEstudiante2_2, 7800, carrera2_2);
		Estudiante estudiante2_3 = new Estudiante(1453620910, "acortazara", "Cortazar", "Alfredo", 8, fechaEstudiante2_3, 7886, carrera2_2);
		
		estudiantesMatApl.add(estudiante1);
		estudiantesMatApl.add(estudiante1_1);
		estudiantesEstad.add(estudiante1_2);
		estudiantesEstad.add(estudiante1_3);
		
		estudiantesFilAl.add(estudiante2);
		estudiantesFilAl.add(estudiante2_1);
		estudiantesLenMod.add(estudiante2_1);
		estudiantesLenMod.add(estudiante2_3);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		

	}

}
