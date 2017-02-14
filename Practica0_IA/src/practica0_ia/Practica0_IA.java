/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @file Practica0_IA.java
 * @author Miriam Colomo Gil <mcg00098@red.ujaen.es>
 * @brief Fichero main
 * Created on 14 de febrero de 2017, 10:39
 */

///Librerias que vamos a usar / necesitar
package practica0_ia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

public class Practica0_IA {
    /**
     * @brief Funcion leerFichero, lee los datos de un fichero que pasamos como parametro.
     * @param ruta ruta del fichero que queremos leer
     * @throws Excepciones para el FileReader
     */
    public void leerFichero(String ruta){
        try {
            FileReader fr= new FileReader(ruta);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Practica0_IA.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Practica0_IA.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sCadena;
        try {
            while((sCadena = bf.readLine())!= null){
                System.out.println(sCadena);
            }
        } catch (IOException ex) {
            Logger.getLogger(Practica0_IA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @brief Funcion pasarFichero, Pasamos los datos de un fichero a un Vector
     * @param ruta ruta del fichero que vamos a obtener los datos
     * @param vAlumno vector donde vamos a guardar los datos
     */
    public void pasarFichero(String ruta, Vector<Alumno> vAlumno){
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/miriam/Documentos/Java/Practica0_IA/src/practica0_ia/datos.txt"));
            String lineaActual;
            lineaActual = br.readLine();
            
            while(lineaActual != null){
                System.out.println(lineaActual);
                String[] cadenas=lineaActual.split(" ");
                vAlumno.add(new Alumno(cadenas[0]+" "+cadenas[1]+" "+cadenas[2], Integer.parseInt(cadenas[3]), cadenas[4]));
             
                lineaActual = br.readLine();
            }
            br.close();
            
        }catch(IOException error){ 
            System.out.println("Error. Ruta del Fichero no correcta." + error);
            
        }  
    }
    
    /**
     * @brief Funcion crearPares, con esta funcion vamos a pasar los Alumnos con Dni pares a un nuevo fichero "pares.txt"
     * @param fNuevo ruta del fichero donde vamos a guardar los datos nuevos
     * @param vAlumno vector con los datos que queremos comprobar para guardar
     * @throws IOException 
     */
    public void crearPares(String fNuevo, Vector<Alumno> vAlumno) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fNuevo));
        for(int i = 0; i < vAlumno.size(); i++){
            if(vAlumno.get(i).DniP()){
                bw.write(vAlumno.get(i).getNombre() + " " + vAlumno.get(i).getDni() + " " + vAlumno.get(i).getCorreo_E());
            }
        }
        bw.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ///Creamos un nuevo Alumno
        Alumno nuevo = new Alumno();
        
        ///Creamos un nuevo Alumno_IA
        Alumno_IA notas = new Alumno_IA();
        
        ///Creamos un nuevo vector de Alumnos
        Vector<Alumno> vAlumnos = new Vector<>();
        
        ///Llamamos a la funcion crearAlumno para crear uno nuevo.
        nuevo.crearAlumno(nuevo);
        System.out.println("----------------------------------------------------");
        
        ///Llamamos a la funcion mostrarAlumno para mostrar los datos del Alumno creado.
        nuevo.mostrarAlumno(nuevo);
        System.out.println("----------------------------------------------------");

        ///Llamamos a la funcion notaMedia para calcular la media de 4 notas del Alumno.
        notas.notaMedia(notas);
        System.out.println("----------------------------------------------------");
        
        ///Creamos dos nuevas variables tipo String para guardar la ruta del primer fichero y del fichero de destino.
        String ruta = "/home/miriam/Documentos/Java/Practica0_IA/src/practica0_ia/datos.txt";
        String rutaD = "/home/miriam/Documentos/Java/Practica0_IA/src/practica0_ia/pares.txt";
        
        Practica0_IA a = new Practica0_IA();
        
        ///Llamamos a la funcion leerFichero para leer los datos del fichero "datos.txt"
        a.leerFichero(ruta);
        System.out.println("----------------------------------------------------");

        ///Llamamos a la funcion pasarFichero para pasar los datos de "datos.txt" a un vector.
        a.pasarFichero(ruta, vAlumnos);
        System.out.println("----------------------------------------------------");

        ///Llamamos a la funcion crearPares para pasar los datos de las personas cullo dni sea par al fichero "pares.txt"
        a.crearPares(rutaD, vAlumnos);
    }

    
}
