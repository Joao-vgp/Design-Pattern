package main;
public class Bebida {
    private String tipo;
    
    public Bebida(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Bebida: " + tipo;
    }
}
