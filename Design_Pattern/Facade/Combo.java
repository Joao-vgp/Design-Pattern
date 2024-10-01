package main;
public class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;
    

    public void CriarCombo(int tipo) {
        if (tipo == 1) {
            sanduiche = new Sanduiche("Hamburgão");
            sobremesa = new Sobremesa("Pudim");
            bebida = new Bebida("Refrigerante");
        } else if (tipo == 2) {
            sanduiche = new Sanduiche("Super Burguer");
            sobremesa = new Sobremesa("Chocolate");
            bebida = new Bebida("Suco de Laranja");
        }
    }
    @Override
    public String toString() {
        return sanduiche + "\n" + sobremesa + "\n" + bebida;
    }
}
