package org.uv.tpcsw.practica01.inyeccion;

public class SaludoConcreto implements IMensajeID{

    @Override
    public void imprimir() {
        System.out.println("Hola mundo ID");
    }
}
