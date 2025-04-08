public class ContaCorrente extends Conta {
    private double limite;
    
    // Métodos
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosDaConta();
    }


}
