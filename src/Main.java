public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Criando uma conta corrente
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        Conta cp = new ContaPoupanca();
        cc.transferir(cp, 25);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
