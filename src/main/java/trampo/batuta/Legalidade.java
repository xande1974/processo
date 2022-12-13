package trampo.batuta;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Legalidade {
    private String nome;
    private String tipo;
    private int qtd;

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", qtd=" + qtd +
                '}';
    }
}
