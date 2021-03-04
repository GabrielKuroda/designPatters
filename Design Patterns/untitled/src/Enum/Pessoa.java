package Enum;

import java.util.Arrays;

public class Pessoa {

    private String nome;
    private TipoPessoa[] tipo;
    private Estado estado;

    @Override
    public String toString() {
        return "Enum.Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipo=" + Arrays.toString(tipo) +
                ", estado=" + estado +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoa[] getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa[] tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
