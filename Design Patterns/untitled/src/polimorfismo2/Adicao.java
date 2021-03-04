package polimorfismo2;

public class Adicao implements Calculo{
    @Override
    public void calcular(int x, int y) {
        System.out.println(x+y);
    }
}
