/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @file Alumno.java
 * @author Miriam Colomo Gil <mcg00098@red.ujaen.es>
 * @brief Fichero de la clase Alumno
 * Created on 14 de febrero de 2017, 10:39
 */


package practica0_ia;
import java.util.Scanner;

public class Alumno {
    //Creamos el Scanner para escribir por teclado.
    Scanner sc = new java.util.Scanner(System.in);
    /**
     * @brief Nombre 
     */
    private String nombre;
    /**
     * @brief Dni
     */
    private int dni;
    /**
     * @brief Correo Electronico
     */
    private String correo_E;
    
    /**
     * @brief Constructor por defecto.
     */
    public Alumno(){
        nombre = "";
        dni = 0;
        correo_E = "";
    }
    
    /**
     * @brief Constructor parametrizado de la clase
     * @param _nombre Nombre del Alumno
     * @param _dni Dni del Alumno
     * @param _correo_E Correo del Alumno
     */
    public Alumno(String _nombre, int _dni, String _correo_E){
        nombre = _nombre;
        dni = _dni;
        correo_E = _correo_E;
    }
    
    //Metodos Get y Set
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the correo_E
     */
    public String getCorreo_E() {
        return correo_E;
    }

    /**
     * @param correo_E the correo_E to set
     */
    public void setCorreo_E(String correo_E) {
        this.correo_E = correo_E;
    }
    
    //Funciones de la clase
    
    /**
     * @brief Funcion crearAlumno, funcion para crear un nuevo alumno y darle valor a sus campos.
     * @param a Alumno
     */
    public void crearAlumno(Alumno a){
        System.out.println("Introduce el nombre del alumno ");
        setNombre(sc.nextLine());
        System.out.println("Introduce el dni del alumno ");
        setDni(sc.nextInt());
        System.out.println("Introduce el correo del alumno ");
        setCorreo_E(sc.next());
        
        a = new Alumno(getNombre(), getDni(), getCorreo_E());
    }
    
    /**
     * @brief Funcion mostrarAlumno, funcion para mostrar los datos de los alumnos
     * @param a Alumno del que queremos ver los datos
     */
    public void mostrarAlumno(Alumno a){
        System.out.println("Nombre: "+ a.getNombre());
        System.out.println("Dni: "+ a.getDni());
        System.out.println("Correo: "+ a.getCorreo_E());
    }
    
    /**
     * @brief Funcion DniP, para calcular los dni pares.
     * @return si es par o no el dni.
     */
     public boolean DniP(){
        return (dni%2) == 0;
    }
}    

