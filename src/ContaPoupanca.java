public class ContaPoupanca extends Conta {

    // Métodos
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosDaConta();
    }
}
