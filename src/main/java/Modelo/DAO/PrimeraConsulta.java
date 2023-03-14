/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.VO.Lider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PrimeraConsulta {

    public void primeraconsulta(DefaultTableModel Modelo) {

        Lider lider = new Lider();

        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia");

            while (rs.next()) {
                lider.setId_lider(rs.getInt(1));
                lider.setNombre(rs.getString(2));
                lider.setPrimer_apellido(rs.getString(3));
                lider.setCiudad_residencia(rs.getString(4));

                Modelo.addRow(new Object[]{
                    lider.getId_lider(), lider.getNombre(), lider.getPrimer_apellido(), lider.getCiudad_residencia()
                });
            }

            rs.close();
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PrimeraConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
