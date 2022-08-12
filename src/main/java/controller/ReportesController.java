/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.dao.InformeCompraDao;
import model.dao.InformeLiderDao;
import model.dao.InformeProyectoDao;
import model.vo.InformeCompraVo;
import model.vo.InformeLiderVo;
import model.vo.InformeProyectoVo;


/**
 *
 * @author Juank
 */
public class ReportesController {
    
   InformeLiderDao informeLiderDao;
   InformeProyectoDao informeProyectoDao;
   InformeCompraDao informeCompraDao;
    
    
    

    public ReportesController() {
        this.informeLiderDao = new InformeLiderDao();
        this.informeProyectoDao = new InformeProyectoDao();
        this.informeCompraDao = new InformeCompraDao();
    }
    
    
    public List<InformeLiderVo> informeLiderPorCiudad(){
    
        List<InformeLiderVo> informeLiderVoList;
        informeLiderVoList = informeLiderDao.informeLiderPorCiudad();
        return informeLiderVoList;
    
    }
    
    
    public List<InformeProyectoVo> informeProyectoPorCiudad(){
    
        List<InformeProyectoVo> informeProyectoVoList;
        informeProyectoVoList = informeProyectoDao.informeProyectoPorCiudad();
        return informeProyectoVoList;
    
    }
    
    
    public List<InformeCompraVo> informeCompra(){
    
        List<InformeCompraVo> informeCompraVoList;
        informeCompraVoList = informeCompraDao.informeCompra();
        return informeCompraVoList;
    
    }
    
}
