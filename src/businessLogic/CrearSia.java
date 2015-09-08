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
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
-import java.text.ParseException;
-import java.text.SimpleDateFormat;
-
-import org.omg.PortableInterceptor.HOLDING;

public class CrearSia {

	public static void main(String[] args) {
		
		Sede Bogota = new Sede("Bogota");
		Sede Medellin =new Sede("Medellin");
		
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
		
		Departamento IndSisIngBog = new Departamento("Industrial y Sistemas",IngBog);
		Departamento  DisGrafBog= new Departamento("Escuela de Diseño Grafico", ArtBog);
		
		Departamento MatMed = new Departamento("Matematicas", CiencMed);
		Departamento HistMed = new Departamento("Historia",HumMed);
		
		DepartamentoIngBog.add(IndSisIngBog);
		DepartamentoArtBog.add(DisGrafBog);
		DepartamentoHumMed.add(HistMed);
		DepartamentoCiencMed.add(MatMed);
		
		
		IngBog.setDepartamento(DepartamentoIngBog);
		ArtBog.setDepartamento(DepartamentoArtBog);
		HumMed.setDepartamento(DepartamentoHumMed);
		CiencMed.setDepartamento(DepartamentoCiencMed);		
		
		
	///////////////////////////////////////////////////////////////////////
		
		ArrayList<Carrera> CarrerasIndSisIngBog = new ArrayList<Carrera>();
		ArrayList<Carrera> CarrerasDisGrafBog = new ArrayList<Carrera>();
		ArrayList<Carrera> CarrerasHistMed = new ArrayList<Carrera>(); 
		ArrayList<Carrera> CarrerasMatMed = new ArrayList<Carrera>();
		
		Carrera IngSistemas = new Carrera("Ingeniería Sistemas", 2879, IndSisIngBog);
		Carrera DisGrafico = new Carrera("Diseño Gráfico", 2509, DisGrafBog);
		
		Carrera Historia  = new Carrera("Historia", 3515, HistMed);
		Carrera Matematicas = new Carrera("Matematicas",3507,MatMed);
		
		CarrerasIndSisIngBog.add(IngSistemas);
		CarrerasDisGrafBog.add(DisGrafico);
		CarrerasHistMed.add(Historia);
		CarrerasMatMed.add(Matematicas);
		
		HistMed.setCarreras(CarrerasHistMed);
		IndSisIngBog.setCarreras(CarrerasIndSisIngBog);
		MatMed.setCarreras(CarrerasMatMed);
		DisGrafBog.setCarreras(CarrerasDisGrafBog);
		
		
		/////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Curso> CursosIndSisIngBog = new ArrayList<Curso>();
		ArrayList<Curso> CursosDisGrafBog = new ArrayList<Curso>();
		ArrayList<Curso> CursosMatMed = new ArrayList<Curso>();
		ArrayList<Curso> CursosHistMed = new ArrayList<Curso>();
		
		Curso POO = new Curso("Programación Orientada a objetos",2016375, 'C', 3, IndSisIngBog);
		Curso FotoII = new Curso("Fotografia II ",2016918, 'C', 3, DisGrafBog );
		
		Curso AlgLineal = new Curso("Algebra Lineal",1000003, 'F', 4, MatMed);
		Curso CatSigifEspinal = new Curso("Catedra Sigifredo Espinal",3006734, 'L', 4, HistMed);
		
		
		
		CursosIndSisIngBog.add(POO);		
		CursosDisGrafBog.add(FotoII);		
		CursosMatMed.add(AlgLineal);		
		CursosHistMed.add(CatSigifEspinal);
		
		IndSisIngBog.setCursos(CursosIndSisIngBog);
		DisGrafBog.setCursos(CursosDisGrafBog);
		MatMed.setCursos(CursosMatMed);
		HistMed.setCursos(CursosHistMed);
		
		
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
		Profesor profesor1_1 = new Profesor("Sara", "Gomez", fechaProfesor1_1, "Ingeniera de Sistemas");
		
		Profesor profesor2 = new Profesor("Santiago", "Arias", fechaProfesor2, "Filologo");
		Profesor profesor2_2 = new Profesor("Maria", "Rodriguez", fechaProfesor2_2, "Licenciada en Lenguas Modernas");
		
		profesoresMat.add(profesor1);
		profesoresMat.add(profesor1_1);
		
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
		Date fechaEstudiante2_3;
		
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
		estudiantesLenMod.add(estudiante2_2);
		estudiantesLenMod.add(estudiante2_3);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		
		Grupo grupoIntro1 = new Grupo(1, "Lunes-Jueves", "14:00-16:00", 34, "Aulas Ingenieria", "503-113", profesor1, curso1, estudiantesMatApl);
		Grupo grupoIntro2 = new Grupo(2, "Martes-Viernes", "16:00-18:00", 30, "Facultad Ingenieria", "501-224", profesor1_1, curso1_1, estudiantesEstad);
		
		Grupo grupoFilol1 = new Grupo(1, "Miercoles-Viernes", "7:00-9:00", 20, "Auditorio Gabriel Garcia Marquez", "206", profesor2, curso2, estudiantesFilAl);
		Grupo grupoFilol2 = new Grupo(2, "Lunes-Miercoles", "9:00-11:00", 25, "Auditorio Julio Cortazar", "206", profesor2_2, curso2_2, estudiantesLenMod);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Nota notaEstudiante1 = new Nota(3.5, grupoIntro1, curso1, estudiante1);
		Nota notaEstudiante1_1 = new Nota(3.5,grupoIntro1, curso1, estudiante1_1);
		Nota notaEstudiante1_2 = new Nota(4.5, grupoIntro2, curso1_1, estudiante1_2);
		Nota notaEstudiante1_3 = new Nota(3.8, grupoIntro2, curso1_1, estudiante1_3);
		
		Nota notaEstudiante2 = new Nota(4.0, grupoFilol1, curso2, estudiante2);
		Nota notaEstudiante2_1 = new Nota(3.7, grupoFilol1, curso2, estudiante2_1);
		Nota notaEstudiante2_2 = new Nota(4.0, grupoFilol2, curso2_2, estudiante2_2);
		Nota notaEstudiante2_3 = new Nota(4.5, grupoFilol2, curso2_2, estudiante2_3);

	}

}
