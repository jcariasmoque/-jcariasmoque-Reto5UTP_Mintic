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
import model.vo.InformeCompraVo;
import util.JDBCUtilities;

/**
 *
 * @author Juank
 */
public class InformeCompraDao {

    public List<InformeCompraVo> informeCompra() {

        List<InformeCompraVo> lista = new ArrayList<>();
        InformeCompraVo informeCompraVo = null;
        try {

            Connection conn = JDBCUtilities.getConnection();

            String consulta = "SELECT c.ID_Compra, P.Constructora, P.Banco_Vinculado "
                    + "FROM Proyecto AS P "
                    + "JOIN Compra AS c ON (P.ID_Proyecto = c.ID_proyecto) "
                    + "WHERE c.Proveedor = 'Homecenter' "
                    + "AND p.Ciudad = 'Salento'";

            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idCompra = result.getInt(1);
                String constructora = result.getString(2);
                String banco = result.getString(3);

                informeCompraVo = new InformeCompraVo(idCompra, constructora, banco);
                lista.add(informeCompraVo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InformeLiderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
