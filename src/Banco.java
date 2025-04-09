
import java.util.ArrayList;
import java.util.List;

public class Banco {

    // Atributos
    private String nome;
    protected List<Agencia> agencias;
    protected List<Cliente> clientes;

    // Construtor
    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.agencias = new ArrayList<>();
    }

    // Getters

    public String getNome() {
        return this.nome;
    }

    // Métodos

    // Método para adicionar uma agência ao banco
    public void adicionarAgencia(Agencia agencia) {
        this.agencias.add(agencia);
    }

    // Método para remover uma agência do banco
    public void removerAgencia(Agencia agencia) {
        this.agencias.remove(agencia);
    }

    // Método para buscar agência no banco
    public Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia agencia : this.agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                return agencia;
            }
        }
        return null;
    }

    // Método para listar agências do banco
    public void listarAgencias() {
        System.out.println("================================");
        System.out.println("Agências do banco " + this.nome + ":");
        for (Agencia agencia : this.agencias) {
            System.out.print("Número: " + agencia.getNumero());
            System.out.println(" - Nome: " + agencia.getNome());
        }
        System.out.println("================================");
        System.out.println("Total de agências: " + this.agencias.size());
        System.out.println("================================");
        System.out.println();
    }

    // Método para adicionar cliente ao banco
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // Método para remover cliente do banco
    public void removerCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    // Método para buscar cliente no banco
    public Cliente buscarCliente(String nomeCliente) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }

    // Método para listar clientes do banco
    public void listarClientes() {
        System.out.println("================================");
        System.out.println("================================");
        System.out.println("Clientes do banco " + nome + ":");
        for (Agencia agencia : agencias) {
            System.out.println("Clientes da agência " + agencia.getNome() + ":");
            for (Cliente cliente : agencia.getClientes()) {
                System.out.println(cliente.getNome());
            }
            System.out.println("Total de clientes: " + agencia.getClientes().size());
            System.out.println("================================");
        }
        System.out.println("================================");
        System.out.println();
    }
}
