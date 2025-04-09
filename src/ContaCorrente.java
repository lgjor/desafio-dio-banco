public class ContaCorrente extends Conta {
    
    // Construtor
    public ContaCorrente(Cliente cliente, Agencia agencia) {
        super(cliente, agencia);
    }
    
    // Métodos
    @Override
    public void imprimirExtrato() {
        System.out.println("==================================="); 
        System.out.println("===== Extrato Conta Corrente =====");
        System.out.println("==================================="); 
        super.imprimirInfosDaConta();
        System.out.println("==================================="); 
        System.out.println("========= Fim do Extrato =========");
        System.out.println("==================================="); 
        System.out.println();
    }
}
