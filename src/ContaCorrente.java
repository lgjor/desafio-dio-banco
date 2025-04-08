public class ContaCorrente extends Conta {
    
    // Métodos
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosDaConta();
    }


}
