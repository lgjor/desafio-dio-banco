
import java.util.List;

public class Banco {

    // Atributos
    private String nome;
    private List<Conta> contas;

    // Getters

    public String getNome() {
        return this.nome;
    }

    // Setters
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
