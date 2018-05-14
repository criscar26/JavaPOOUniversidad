/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        String asiga[]={"Calculo I","Fisica I"}; 
        String asigd[]={"Calculo I","Fisica I","Algebra I","Quimica I"}; 
        personas.add(new Alumno("35-1", 1,asiga));
        personas.add(new Docente(1,asigd, "Licenciado en Informática", "222222", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-2", 1,asiga));
        personas.add(new Alumno("35-3", 1,asiga));
        personas.add(new Docente(2,asigd, "Ingeniero de Sistemas"));
        personas.add(new Alumno("35-4", 1, asiga));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Profesores                         |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 4) Gestión de Administrativos                    |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAdministrativos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docentes                              |");
        System.out.println("| 3) Añadir Docentes Titular                       |");
        System.out.println("| 4) Añadir Docentes a Contrato                   |");
        System.out.println("| 5) Modificar Docentes                            |");
        System.out.println("| 6) Borrar Docentes                              |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentes();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                anadirDocentes();
                volverMenu();
                menuDocentes();
                break;
            case "3":
                anadirDocentesTit();
                volverMenu();
                menuDocentes();
                break;
            case "4":
                anadirDocentesCon();
                volverMenu();
                menuDocentes();
                break;
            case "5":
                modificarDocentes();
                volverMenu();
                menuDocentes();
                break;
            case "6":
                borrarDocentes();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
        public static void menuAdministrativos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Administrativos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Administrativos                              |");
        System.out.println("| 2) Añadir Administrativos                                 |");
        System.out.println("| 3) Modificar Administrativos                              |");
        System.out.println("| 4) Borrar Administrativos                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "2":
                anadirAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "3":
                modificarAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            case "4":
                borrarAdministrativo();
                volverMenu();
                menuAdministrativos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                           |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona profesor: personas) {
            if (profesor instanceof Docente) {
                i++;
                System.out.println(i + ": " + profesor);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocentes() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int anio;
        String titulo;
        String Asig[]; 
        int n;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                  |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca los Años de Experiencia: ");
            anio = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca cantidad de asignaturas : ");
            n = Integer.parseInt(entradaTeclado.readLine());
            Asig=new String[n];
            for(int i=0;i<n;i++){
                System.out.print("Introduzca el Asignatura: ");
                Asig[i]=entradaTeclado.readLine();
            }
            personas.add(new Docente(anio,Asig, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
        public static void anadirDocentesTit() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int anio;
        String titulo;
        String Asig[];
        String Exam;
        int n;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                  |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca los Años de Experiencia: ");
            anio = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca Examen de com[etencia: ");
            Exam = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca cantidad de asignaturas : ");
            n = Integer.parseInt(entradaTeclado.readLine());
            Asig=new String[n];
            for(int i=0;i<n;i++){
                System.out.print("Introduzca el Asignatura: ");
                Asig[i]=entradaTeclado.readLine();
            }
            personas.add(new Doc_Titular(Exam,anio,Asig, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

        
            public static void anadirDocentesCon() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int anio;
        String titulo;
        String Asig[]; 
        String Cont;
        int n;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                  |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca los Años de Experiencia: ");
            anio = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca Contrato: ");
            Cont = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca cantidad de asignaturas : ");
            n = Integer.parseInt(entradaTeclado.readLine());
            Asig=new String[n];
            for(int i=0;i<n;i++){
                System.out.print("Introduzca el Asignatura: ");
                Asig[i]=entradaTeclado.readLine();
            }
            personas.add(new Doc_Contrato(Cont,anio,Asig, titulo, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    
    public static void modificarDocentes() {
        int id;
        String Asigm[];
        Docente docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente                               |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docente = (Docente)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docente.getCarnetIdentidad()+ "': ");
                docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docente.getNombre() + "': ");
                docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docente.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Los años de experiencia'" + docente.getAnioexp()+ "': ");
                docente.setAnioexp(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Introduzca el Título Universitario: ");
                docente.setTitulo(entradaTeclado.readLine());
                System.out.print("Introduzca cantidad de asignaturas : ");
                 int n = Integer.parseInt(entradaTeclado.readLine());
                Asigm=new String[n];
                for(int i=0;i<n;i++){
                 System.out.print("Introduzca el Asignatura: ");
                Asigm[i]=entradaTeclado.readLine();
                 }
                docente.setAsignaturas(Asigm);
                personas.set(id, docente);
                System.out.println("Registro de Docente modificado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocentes() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docentes                                  |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        String Asiga[];
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
             System.out.print("Introduzca cantidad de asignaturas : ");
                 int n = Integer.parseInt(entradaTeclado.readLine());
            Asiga=new String[n];
                for(int i=0;i<n;i++){
                 System.out.print("Introduzca la Asignatura: ");
                Asiga[i]=entradaTeclado.readLine();
                 }
            personas.add(new Alumno(carnetUniversitario, semestre, Asiga, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    
    
    
        
    public static void listarAdministrativo() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Administrativos                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona admi: personas) {
            if (admi instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + admi);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAdministrativo() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String Cargo;
        String LugarTrabajo;
        String FechaIngreso; 

        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Administrativo                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca Cargo: ");
            Cargo = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar de Trabajo: ");
            LugarTrabajo = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de ingreso (ejemplo: 1980-01-01): ");
            FechaIngreso = entradaTeclado.readLine();
            Date fechaingresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(FechaIngreso);
            Calendar fechaingresoCalendario = Calendar.getInstance();
            fechaingresoCalendario.setTime(fechaingresoDate);
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);

                 
            personas.add(new Administrativo(Cargo, LugarTrabajo, fechaingresoCalendario, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAdministrativo() {
        int id;
        Administrativo Admin;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrativo                                |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                Admin= (Administrativo)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + Admin.getCarnetIdentidad()+ "': ");
                Admin.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + Admin.getNombre() + "': ");
                Admin.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Admin.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                Admin.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar Cargo '" + Admin.getCargo() + "': ");
                Admin.setCargo(entradaTeclado.readLine());
                System.out.print("Introduzca Lugar de Trabajo " + Admin.getLugarTrabajo() + "': ");
                Admin.setLugarTrabajo(entradaTeclado.readLine());
                System.out.print("Modificar Fecha de ingreso "+ Utilitarios.getFechaCalendario(Admin.getFechaIngreso()) + "': ");
                Date fechaingresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaingresoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaingresoDate);

                personas.set(id, Admin);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAdministrativo() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrativo                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrativo borrado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    
    
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
