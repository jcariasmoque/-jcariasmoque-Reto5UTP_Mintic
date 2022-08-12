/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author Juank
 */
public class InformeLiderVo {
    
    private int idLider;
    private String nombre;
    private String primerApellido;
    private String ciudad;

    
    public InformeLiderVo(int idLider, String nombre, String primerApellido, String ciudad) {
        this.idLider = idLider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.ciudad = ciudad;
    }

    
    /**
     * @return the idLider
     */
    public int getIdLider() {
        return idLider;
    }

    /**
     * @param idLider the idLider to set
     */
    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }

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
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
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
