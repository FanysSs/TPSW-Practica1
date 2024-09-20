package org.uv.tpcsw.practica01;

public abstract class Mensaje {
    
    protected abstract void msg();
    
    public void imprimir(){
        msg();
    }
}
