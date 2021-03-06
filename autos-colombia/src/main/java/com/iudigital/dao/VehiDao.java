package com.iudigital.dao;

import com.iudigital.clase.Vehiculo;
import com.iudigital.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Darwin Felix
 */
public class VehiDao {

    public void registrarVehi(Vehiculo vehiculo) {

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO vehiculos (tipo_vehiculo, marca, modelo, color, placa, observaciones) values "
                + "(" + "'" + vehiculo.getTipoVehi() + "'" + "," + "'" + vehiculo.getMarca() + "'" + "," + "'" + 
                vehiculo.getModelo() + "'" + "," + "'" + vehiculo.getColor() + "'" + "," + "'" + 
                vehiculo.getPlaca() + "'" + "," + "'" + vehiculo.getObservaciones() + "'" + ");";

        try {
            con = ConnectionUtil.getConnection();
            stm = con.createStatement();
            stm.execute(sql);
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar vehiculo");
            e.printStackTrace();
        }

    }
}
