/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author Juank
 */
public class InformeCompraVo {

    private int idCompra;
    private String Constructora;
    private String BancoVinculado;
    

    public InformeCompraVo(int idCompra, String Constructora, String BancoVinculado) {
        this.idCompra = idCompra;
        this.Constructora = Constructora;
        this.BancoVinculado = BancoVinculado;
    }
   

    /**
     * @return the idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * @return the Constructora
     */
    public String getConstructora() {
        return Constructora;
    }

    /**
     * @param Constructora the Constructora to set
     */
    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    /**
     * @return the BancoVinculado
     */
    public String getBancoVinculado() {
        return BancoVinculado;
    }

    /**
     * @param BancoVinculado the BancoVinculado to set
     */
    public void setBancoVinculado(String BancoVinculado) {
        this.BancoVinculado = BancoVinculado;
    }

}
