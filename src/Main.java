public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente01 = new Cliente();
        cliente01.setNome("Lucas Godoy");

        System.out.println("Hello, World!");
        // Criando uma conta corrente
        Conta cc = new ContaCorrente(cliente01);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(cliente01);
        cc.transferir(cp, 25);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
