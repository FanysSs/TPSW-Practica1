package org.uv.tpcsw.practica01.dao;

import java.util.List;

//CRUD
public class DAOEmpleado {
    public boolean guardar(EmpleadoPojo pojo){
        ConexionBD con = ConexionBD.getInstance();
        String sql = "instert into empleado (clave, nombre, direccion, telefono) values "
                + " ('"+pojo.getClave() + "','"+ pojo.getNombre() + " , " + pojo.getDireccion() + ""
                + " , " + pojo.getTelefono() + ")";
        return con.execute(sql);
    }
    public boolean eliminar(EmpleadoPojo pojo){
        ConexionBD con = ConexionBD.getInstance();
        String sql = "delete"
                + " ('"+pojo.getClave() + "','"+ pojo.getNombre() + " , " + pojo.getDireccion() + ""
                + " , " + pojo.getTelefono() + ")";
        return con.execute(sql);
    }
    public boolean modificar(EmpleadoPojo pojo){
        ConexionBD con = ConexionBD.getInstance();
        String sql = "update"
                + " ('"+pojo.getClave() + "','"+ pojo.getNombre() + " , " + pojo.getDireccion() + ""
                + " , " + pojo.getTelefono() + ")";
        return con.execute(sql);
    }
    public List<EmpleadoPojo> buscarAll(){
        String sql = "select";
        return null;
    }
    public EmpleadoPojo buscarById(EmpleadoPojo pojo){
        ConexionBD con = ConexionBD.getInstance();
        String sql = "select by id"+pojo;
        return null;
    }
}
