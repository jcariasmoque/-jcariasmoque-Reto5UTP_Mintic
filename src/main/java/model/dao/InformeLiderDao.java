/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.vo.InformeLiderVo;
import util.JDBCUtilities;

/**
 *
 * @author Juank
 */
public class InformeLiderDao {

    public List<InformeLiderVo> informeLiderPorCiudad() {

        List<InformeLiderVo> lista = new ArrayList<>();
        InformeLiderVo informeLiderVo = null;
        try {

            Connection conn = JDBCUtilities.getConnection();

            String consulta = "SELECT L.ID_Lider, L.Nombre, L.Primer_Apellido, L.Ciudad_Residencia "
                    + "FROM Lider AS L "
                    + "ORDER BY L.Ciudad_Residencia ASC ";

            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idLider = result.getInt(1);
                String nombre = result.getString(2);
                String primerApellido = result.getString(3);
                String ciudad = result.getString(4);
                
                informeLiderVo = new InformeLiderVo(idLider, nombre, primerApellido, ciudad);
                lista.add(informeLiderVo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InformeLiderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}