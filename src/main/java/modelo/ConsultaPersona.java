package modelo;

import com.mysql.jdbc.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaPersona extends Conexion{
    private PreparedStatement ps = null;

    public boolean registrarPersona(Persona persona){
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("insert into persona (clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) values (?,?,?,?,?,?,?)");
            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreoElectronico());
            ps.setString(6, persona.getFechaNacimiento());
            ps.setString(7, persona.getGenero());
            ps.execute();
            return true;
        } catch (SQLException e){
            return false;
        }finally {
            try {
                conexion.close();
            }catch (SQLException e){
                return false;
            }
        }
    }

    public boolean modificarRegistro(Persona persona){
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("UPDATE persona SET nombre=?, domicilio=?, celular=?, correo_electronico=?, fecha_nacimiento=?, genero=? WHERE clave=?");
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getDomicilio());
            ps.setString(3, persona.getCelular());
            ps.setString(4, persona.getCorreoElectronico());
            ps.setString(5, persona.getFechaNacimiento());
            ps.setString(6, persona.getGenero());
            ps.setString(7, persona.getClave());
            ps.execute();
            return true;
        } catch (SQLException e){
            System.err.println(e.getMessage());
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e){
                return false;
            }
        }
    }

    public boolean eliminarRegistro(Persona persona){
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("DELETE FROM persona WHERE clave=?");
            ps.setString(1, persona.getClave());
            ps.execute();
            return true;
        } catch (SQLException e){
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e){
                return false;
            }
        }
    }

    public boolean buscarRegistro(Persona persona){
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("SELECT * FROM persona WHERE clave=?");
            ps.setString(1, persona.getClave());
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                persona.setPersonaId(rs.getString("idPersona"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setClave(rs.getString("clave"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreoElectronico(rs.getString("correo_electronico"));
                persona.setFechaNacimiento(rs.getString(("fecha_nacimiento")));
                persona.setGenero(rs.getString("genero"));
                return true;
            }
            return false;
        } catch (SQLException e){
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                return false;
            }
        }
    }


}
