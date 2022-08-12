/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author Juank
 */
public class InformeProyectoVo {
    
    private int idProyecto;
    private String constructora;
    private int numeroHabitaciones;
    private String ciudad;
    
    

    public InformeProyectoVo(int idProyecto, String constructora, int numeroHabitaciones, String ciudad) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
    }

    
    
    /**
     * @return the idProyecto
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * @param idProyecto the idProyecto to set
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numeroHabitaciones
     */
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /**
     * @param numeroHabitaciones the numeroHabitaciones to set
     */
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
