package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    public String etqV;
    public String etqF;
    public int tipo;

    public NodoC3D(String cad, int tipo) {
        this.cad = cad;
        this.etqF = "";
        this.etqV = "";
        this.tipo = tipo;
    }
    
    public NodoC3D(String cad, String etqV, String etqF) {
        this.cad = cad;
        this.etqV = etqV;
        this.etqF = etqF;
    }
    
    public NodoC3D(String etqV, String etqF, int tipo) {
        
        this.etqV = etqV;
        this.etqF = etqF;
        this.tipo = tipo;
    }
    
    public String getCad(){
        return cad;
    }
        
}
