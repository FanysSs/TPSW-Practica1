package org.uv.tpcsw.practica01.inyeccion;

public class MensajeController {
    public void mostrar(IMensajeID mensaje){
        mensaje.imprimir();
    }
}
