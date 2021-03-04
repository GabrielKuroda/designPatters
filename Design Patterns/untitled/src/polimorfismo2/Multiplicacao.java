package polimorfismo2;

public class Multiplicacao implements Calculo{
    @Override
    public void calcular(int x, int y) {
        System.out.println(x*y);
    }
}
