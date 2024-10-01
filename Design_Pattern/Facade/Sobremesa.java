package main;
public class Sobremesa {
    private String tipo;
    
    public Sobremesa(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Sobremesa: " + tipo;
    }
}
