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
import model.vo.InformeProyectoVo;
import util.JDBCUtilities;

/**
 *
 * @author Juank
 */
public class InformeProyectoDao {

    public List<InformeProyectoVo> informeProyectoPorCiudad() {

        List<InformeProyectoVo> lista = new ArrayList<>();
        InformeProyectoVo informeProyectoVo = null;
        try {

            Connection conn = JDBCUtilities.getConnection();

            String consulta = "SELECT p.ID_Proyecto, p.Constructora, P.Numero_Habitaciones, P.Ciudad "
                    + "FROM Proyecto AS P "
                    + "WHERE P.Clasificacion = 'Casa Campestre' "
                    + "AND P.Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla') "
                    + "ORDER BY P.Ciudad";

            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idProyecto = result.getInt(1);
                String constructora = result.getString(2);
                int numeroHabitaciones = result.getInt(3);
                String ciudad = result.getString(4);

                informeProyectoVo = new InformeProyectoVo(idProyecto, constructora, numeroHabitaciones, ciudad);
                lista.add(informeProyectoVo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InformeLiderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
