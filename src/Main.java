public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Criando uma conta corrente
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
