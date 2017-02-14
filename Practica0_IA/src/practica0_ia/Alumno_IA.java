/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @file Alumno_IA.java
 * @author Miriam Colomo Gil <mcg00098@red.ujaen.es>
 * @brief Fichero Alumno_IA.java subclase de Alumno.java
 * Created on 14 de febrero de 2017, 10:39
 */

package practica0_ia;

public class Alumno_IA extends Alumno{
    /**
     * @brief Grupo de Practicas
     */
    private String grupoP;
    
    /**
     * @brief Nota de Practicas
     */
    private double notaP;
    
    /**
     * @brieg Constructor por defecto
     */
    public Alumno_IA(){
        grupoP = " ";
        notaP = 0;
    }
    
    /**
     * @brief Constructor parametrizado
     * @param _gP grupo Practicas
     * @param _nP nota Practicas
     */
    public Alumno_IA(String _gP, int _nP){
        grupoP = _gP;
        notaP = _nP;
    }
    
    /// Metodos set y get
    /**
     * @return the grupoP
     */
    public String getGrupoP() {
        return grupoP;
    }

    /**
     * @param grupoP the grupoP to set
     */
    public void setGrupoP(String grupoP) {
        this.grupoP = grupoP;
    }

    /**
     * @return the notaP
     */
    public double getNotaP() {
        return notaP;
    }

    /**
     * @param notaP the notaP to set
     */
    public void setNotaP(double notaP) {
        this.notaP = notaP;
    }
    
    ///Funciones de la clase
    
    /**
     * @brief Funcion notaMedia, pedir 4 notas de un alumno y calcular la media de ellas
     * @param a Alumno_IA
     */
    public void notaMedia(Alumno_IA a){
        double total = 0;
        for(int i = 0; i < 4; i++){
            System.out.println("Introduce una nota: ");
            setNotaP(sc.nextDouble());
            total += getNotaP();
        }
        total = total / 4;
        System.out.println("La media es: "+ total);
    }
}    

