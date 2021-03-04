package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        Multiplicacao multiplicacao = new Multiplicacao();

        adicao.calcular(2,5);
        multiplicacao.calcular(2,5);
    }
}
