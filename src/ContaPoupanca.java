public class ContaPoupanca extends Conta {

    // Construtor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Métodos
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosDaConta();
    }
}
