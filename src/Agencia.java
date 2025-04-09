import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private int numero;
    private String nome;
    private Banco banco;
    protected List<Conta> contas;
    private List<Cliente> clientes;

    public Agencia(int numero, String nome, Banco banco) {
        this.numero = numero;
        this.nome = nome;
        this.banco = banco;
        banco.adicionarAgencia(this);
        this.clientes = new ArrayList<>();
    }
    
    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }
    
    // Métodos

    // Metodo para adicionar conta
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // Método para remover conta
    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }

    // Método para buscar conta
    public Conta buscarConta(int numeroConta) {
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    // Método para listar contas
    public void listarContas() {
        System.out.println("Contas da agência " + this.nome + ":");
        for (Conta conta : this.contas) {
            System.out.println("Número: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }
}
