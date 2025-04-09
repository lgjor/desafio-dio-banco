public class ContaPoupanca extends Conta {

    // Construtor
    public ContaPoupanca(Cliente cliente, Agencia agencia) {
        super(cliente, agencia);
    }

    // Métodos
    @Override
    public void imprimirExtrato() {
        System.out.println("==================================="); 
        System.out.println("===== Extrato Conta Poupança =====");
        System.out.println("==================================="); 
        super.imprimirInfosDaConta();
        System.out.println("===================================");  
        System.out.println("========= Fim do Extrato =========");
        System.out.println("===================================");
        System.out.println();
    }
}
