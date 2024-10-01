package main;
public class Sanduiche {
    private String tipo;
    
    public Sanduiche(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Sanduíche: " + tipo;
    }
}
