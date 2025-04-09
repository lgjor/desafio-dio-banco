public class Cliente {

    // Atributos
    private String nome;
    private String cpf;
    private Agencia agencia;

    // Getter
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Construtor
    public Cliente(String nome, String cpf, Agencia agencia, Banco banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        agencia.adicionarCliente(this);
    }
}
