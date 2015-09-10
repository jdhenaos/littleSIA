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
import ui.UI;

import java.lang.reflect.Array;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.omg.PortableInterceptor.HOLDING;

public class CrearSia {
	
	
	private static void Inicio(ArrayList<Sede> sedes){
		UI ui = new UI();
		
			ui.Inicio(sedes);
		
	}

	public static void main(String[] args) throws ParseException {
		
		ArrayList<Sede> sedes= new ArrayList<Sede>() ;
		
		Sede Bogota = new Sede("Bogota");
		Sede Medellin =new Sede("Medellin");
		
		sedes.add(Medellin);
		sedes.add(Bogota);
		//////////////////////////////////////////////////////////////////////////
		
		ArrayList<Facultad> FacultadBog = new ArrayList<Facultad>();
		ArrayList<Facultad> FacultadMed = new ArrayList<Facultad>();
		
		Facultad IngBog = new Facultad("Ingenieria",Bogota);
		Facultad ArtBog = new Facultad("Artes",Bogota);
		Facultad CiencMed = new Facultad("Ciencias", Medellin);
		Facultad HumMed = new Facultad("Ciencias Humanas",Medellin);
		
		FacultadBog.add(IngBog);
		FacultadBog.add(ArtBog);
		
		FacultadMed.add(HumMed);
		FacultadMed.add(CiencMed);
		
		
		
		/**/ Bogota.setFacultades(FacultadBog);
			Medellin.setFacultades(FacultadMed);
		
	
		
		/////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Departamento> DepartamentoIngBog = new ArrayList<Departamento>();
		ArrayList<Departamento> DepartamentoArtBog = new ArrayList<Departamento>();
		ArrayList<Departamento> DepartamentoHumMed = new ArrayList<Departamento>();
		ArrayList<Departamento> DepartamentoCiencMed = new ArrayList<Departamento>();
		
		Departamento IngSisIndBog = new Departamento("Industrial y Sistemas",IngBog);
		Departamento  DisGrafBog= new Departamento("Escuela de DiseÃ±o Grafico", ArtBog);
		
		Departamento MatMed = new Departamento("Matematicas", CiencMed);
		Departamento HistMed = new Departamento("Historia",HumMed);
		
		DepartamentoIngBog.add(IngSisIndBog);
		DepartamentoArtBog.add(DisGrafBog);
		DepartamentoHumMed.add(HistMed);
		DepartamentoCiencMed.add(MatMed);
		
		
		IngBog.setDepartamento(DepartamentoIngBog);
		ArtBog.setDepartamento(DepartamentoArtBog);
		HumMed.setDepartamento(DepartamentoHumMed);
		CiencMed.setDepartamento(DepartamentoCiencMed);		
		
		
	///////////////////////////////////////////////////////////////////////
		
		ArrayList<Carrera> CarrerasIngSisIndBog = new ArrayList<Carrera>();
		ArrayList<Carrera> CarrerasDisGrafBog = new ArrayList<Carrera>();
		ArrayList<Carrera> CarrerasHistMed = new ArrayList<Carrera>(); 
		ArrayList<Carrera> CarrerasMatMed = new ArrayList<Carrera>();
		
		Carrera IngSistemas = new Carrera("IngenierÃ­a Sistemas", 2879, IngSisIndBog);
		Carrera DisGrafico = new Carrera("DiseÃ±o GrÃ¡fico", 2509, DisGrafBog);
		
		Carrera Historia  = new Carrera("Historia", 3515, HistMed);
		Carrera Matematicas = new Carrera("Matematicas",3507,MatMed);
		
		CarrerasIngSisIndBog.add(IngSistemas);
		CarrerasDisGrafBog.add(DisGrafico);
		CarrerasHistMed.add(Historia);
		CarrerasMatMed.add(Matematicas);
		
		HistMed.setCarreras(CarrerasHistMed);
		IngSisIndBog.setCarreras(CarrerasIngSisIndBog);
		MatMed.setCarreras(CarrerasMatMed);
		DisGrafBog.setCarreras(CarrerasDisGrafBog);
		
		
		/////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Curso> CursosIndSisIngBog = new ArrayList<Curso>();
		ArrayList<Curso> CursosDisGrafBog = new ArrayList<Curso>();
		ArrayList<Curso> CursosMatMed = new ArrayList<Curso>();
		ArrayList<Curso> CursosHistMed = new ArrayList<Curso>();
		
		Curso POO = new Curso("Programacion Orientada a objetos",2016375, 'C', 3, IngSisIndBog);
		Curso FotoII = new Curso("Fotografia II ",2016918, 'C', 3, DisGrafBog );
		
		Curso AlgLineal = new Curso("Algebra Lineal",1000003, 'F', 4, MatMed);
		Curso CatSigifEspinal = new Curso("Catedra Sigifredo Espinal",3006734, 'L', 4, HistMed);
		
		
		
		CursosIndSisIngBog.add(POO);		
		CursosDisGrafBog.add(FotoII);		
		CursosMatMed.add(AlgLineal);		
		CursosHistMed.add(CatSigifEspinal);
		
		IngSisIndBog.setCursos(CursosIndSisIngBog);
		DisGrafBog.setCursos(CursosDisGrafBog);
		MatMed.setCursos(CursosMatMed);
		HistMed.setCursos(CursosHistMed);
		
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/mm/yyyy");
		
		Date FechaNacRAcosta;
		FechaNacRAcosta = format.parse("03/08/1957");
		Date fechaProfesor1_1 = format.parse("15/12/1960");
		
		Date fechaProfesor2 = format.parse("06/10/1975");
		Date fechaProfesor2_2 = format.parse("26/03/1985");
		
		ArrayList<Profesor> profesoresIngSisInd = new ArrayList<Profesor>();
		ArrayList<Profesor> profesoresHist = new ArrayList<Profesor>();
		
		Profesor profesor1 = new Profesor("Ricardo", "Acosta", FechaNacRAcosta, "Ingeniero Industrial");
		Profesor profesor1_1 = new Profesor("Sara", "Gomez", fechaProfesor1_1, "Ingeniera de Sistemas");
		
		Profesor profesor2 = new Profesor("Santiago", "Arias", fechaProfesor2, "Filologo");
		Profesor profesor2_2 = new Profesor("Maria", "Rodriguez", fechaProfesor2_2, "Licenciada en Lenguas Modernas");
		
		profesoresIngSisInd.add(profesor1);
		profesoresIngSisInd.add(profesor1_1);
		
		IngSisIndBog.setProfesores(profesoresIngSisInd);
		
		profesoresHist.add(profesor2);
		profesoresHist.add(profesor2_2);
		
		HistMed.setProfesores(profesoresHist);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
	
		
				
		Date fechaEstudiante1 = format.parse("14/11/1990");
		Date fechaEstudiante1_1 = format.parse("09/05/1991");
		Date fechaEstudiante1_2 = format.parse("06/07/1994");
		Date fechaEstudiante1_3 = format.parse("30/01/1989");
		
		Date fechaEstudiante2 = format.parse("24/01/1993");
		Date fechaEstudiante2_1 = format.parse("29/08/1996");
		Date fechaEstudiante2_2 = format.parse("16/04/1994");
		Date fechaEstudiante2_3 = format2.parse("20/11/1992");
		
		ArrayList<Estudiante> estudiantesIngSis = new ArrayList<Estudiante>();
		ArrayList<Estudiante> estudiantesDisGraf = new ArrayList<Estudiante>();
		
		ArrayList<Estudiante> estudiantesHist = new ArrayList<Estudiante>();
		ArrayList<Estudiante> estudiantesMate = new ArrayList<Estudiante>();
		
		Estudiante estudiante1 = new Estudiante(1713123789, "gbedoyar", "Bedoya", "Guillermo", 3, fechaEstudiante1, 1253, IngSistemas);
		Estudiante estudiante1_1 = new Estudiante(1113778990, "phurtadoz", "Hurtado", "Pilar", 4, fechaEstudiante1_1, 1192, IngSistemas);
		Estudiante estudiante1_2 = new Estudiante(1115713446, "grojasp", "Rojas", "Gustavo", 4, fechaEstudiante1_2, 1188, DisGrafico);
		Estudiante estudiante1_3 = new Estudiante(1980970115, "vlopezd", "Lopez", "Vanesa", 5, fechaEstudiante1_3, 1090, DisGrafico);
		
		Estudiante estudiante2 = new Estudiante(1023073913, "jcorredorh", "Corredor", "Jhon", 8, fechaEstudiante2, 7890, Historia);
		Estudiante estudiante2_1 = new Estudiante(1115678243, "mguzmanr", "Guzman", "Marta", 7, fechaEstudiante2_1, 7934, Historia);
		Estudiante estudiante2_2 = new Estudiante(1334609717, "ejimenezd", "Jimenez", "Esteban", 9, fechaEstudiante2_2, 7800, Matematicas);
		Estudiante estudiante2_3 = new Estudiante(1453620910, "acortazara", "Cortazar", "Alfredo", 8, fechaEstudiante2_3, 7886, Matematicas);
		
		estudiantesIngSis.add(estudiante1);
		estudiantesIngSis.add(estudiante1_1);
		
		IngSistemas.setEstudiantes(estudiantesIngSis);
		
		estudiantesDisGraf.add(estudiante1_2);
		estudiantesDisGraf.add(estudiante1_3);
		
		DisGrafico.setEstudiantes(estudiantesDisGraf);
		
		estudiantesHist.add(estudiante2);
		estudiantesHist.add(estudiante2_1);
		
		Historia.setEstudiantes(estudiantesHist);
		
		estudiantesMate.add(estudiante2_2);
		estudiantesMate.add(estudiante2_3);
		
		Matematicas.setEstudiantes(estudiantesMate);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		
		Grupo grupoPOO1 = new Grupo(1, "Lunes-Jueves", "14:00-16:00", 34, "Aulas Ingenieria", "503-113", profesor1, POO, estudiantesIngSis);
		Grupo grupoPOO2 = new Grupo(2, "Martes-Viernes", "16:00-18:00", 30, "Facultad Ingenieria", "501-224", profesor1_1, POO, estudiantesIngSis);
		
		Grupo grupoAlgLin1 = new Grupo(1, "Miercoles-Viernes", "7:00-9:00", 20, "Auditorio Gabriel Garcia Marquez", "206", profesor2, AlgLineal, estudiantesMate);
		Grupo grupoAlgLin2 = new Grupo(2, "Lunes-Miercoles", "9:00-11:00", 25, "Auditorio Julio Cortazar", "206", profesor2_2, AlgLineal, estudiantesMate);
		
		Grupo grupoFotoII_1 = new Grupo(1, "Miercoles-Viernes", "7:00-9:00", 20, "Auditorio Gabriel Garcia Marquez", "206", profesor2, FotoII, estudiantesDisGraf);
		Grupo grupoFotoII_2 = new Grupo(2, "Lunes-Miercoles", "9:00-11:00", 25, "Auditorio Julio Cortazar", "206", profesor2_2, FotoII, estudiantesDisGraf);

		Grupo grupoCatSigifEspinal = new Grupo(1,"Lunes","8:00-12:00",31,"Auditorio A","Bloque 12",profesor2,CatSigifEspinal,estudiantesHist);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Nota notaEstudiante1 = new Nota(3.5, grupoPOO1,POO, estudiante1);
		Nota notaEstudiante1_1 = new Nota(3.5,grupoPOO2, POO, estudiante1_1);
		Nota notaEstudiante1_2 = new Nota(4.5, grupoAlgLin1, AlgLineal, estudiante1_2);
		Nota notaEstudiante1_3 = new Nota(3.8, grupoAlgLin2, AlgLineal, estudiante1_3);
		
		Nota notaEstudiante2 = new Nota(4.0, grupoFotoII_1, FotoII, estudiante2);
		Nota notaEstudiante2_1 = new Nota(3.7, grupoFotoII_2, FotoII, estudiante2_1);
		Nota notaEstudiante2_2 = new Nota(4.0, grupoCatSigifEspinal,CatSigifEspinal, estudiante2_2);
		Nota notaEstudiante2_3 = new Nota(4.5, grupoFotoII_2, FotoII, estudiante2_3);

		
		
		Inicio(sedes);
		
		
		
	}
	
	
	
	

}
