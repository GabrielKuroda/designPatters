package Enum;

public class Teste
{
    public static void main(String[] args) {
        TipoPessoa[] array = new TipoPessoa[]{TipoPessoa.PESSOA_FISICA,TipoPessoa.PESSOA_JURIDICA};
        Pessoa rebeka = new Pessoa();
        rebeka.setNome("123");
        rebeka.setTipo(new TipoPessoa[]{TipoPessoa.PESSOA_FISICA,TipoPessoa.PESSOA_JURIDICA});
        rebeka.setEstado(Estado.SP);

        System.out.println(rebeka.toString());

    }
}