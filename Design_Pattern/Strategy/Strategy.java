package strategy;

public class Strategy {
    public static void main(String[] args) {
        CalculoMedia calculo = new Aritmetica();
        Disciplina disciplina = new Disciplina(calculo);
        disciplina.setNome("Padrões de Desenvolvimento");
        disciplina.setP1(10);
        disciplina.setP2(5);
        disciplina.CalcularMedia();
        
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situação: %s", 
            disciplina.getP1(), disciplina.getP2(), disciplina.getMedia(), disciplina.getSituacao()));
        
        calculo = new Geometrica();
        disciplina = new Disciplina(calculo);
        disciplina.setP1(10);
        disciplina.setP2(5);
        disciplina.CalcularMedia();
        
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situação: %s", 
            disciplina.getP1(), disciplina.getP2(), disciplina.getMedia(), disciplina.getSituacao()));
    }
}
