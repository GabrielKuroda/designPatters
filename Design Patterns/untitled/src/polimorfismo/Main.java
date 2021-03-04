package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Bebidaa bebida = new Bebidaa();
        Cha cha = new Cha();
        Cafe cafe = new Cafe();

        bebida.preparar(10);
        cha.preparar(10);
        cafe.preparar(10);

    }
}
