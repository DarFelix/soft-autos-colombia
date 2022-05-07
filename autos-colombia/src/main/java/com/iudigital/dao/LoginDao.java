/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iudigital.dao;

import com.iudigital.clase.Persona;
import com.iudigital.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LenovoZ470
 */
public class LoginDao {

   
    public Persona logueo(String numeroDoc, String pass) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        Persona persona = new Persona();

        String sql = "SELECT * FROM personas WHERE numero_documento= " + "'" + numeroDoc + "'" + "and " + "pass= "+"'"+pass+"'"+";";

        try {
            co = ConnectionUtil.getConnection();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {

                persona.setId(rs.getInt(1));
                persona.setTipoDoc(rs.getString(2));
                persona.setNumeroDoc(rs.getString(3));
                persona.setNombres(rs.getString(4));
                persona.setApellidos(rs.getString(5));
                persona.setTelefonoFijo(rs.getString(6));
                persona.setDireccion(rs.getString(7));
                persona.setEmail(rs.getString(8));
                persona.setPass(rs.getString(9));
                persona.setIdRol(rs.getString(10));

            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error al ingresar");
            e.printStackTrace();
        }

        
        System.out.println(persona);
        return persona;

        
    }

}
