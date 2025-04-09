public class Main {
    public static void main(String[] args) throws Exception {
        Banco bancoImperatriz = new Banco("Banco Java");
        Agencia agencia = new Agencia(1, "Agência Central", bancoImperatriz);
        Agencia agencia2 = new Agencia(2, "Agência Pagará", bancoImperatriz);
        Cliente cliente0 = new Cliente("João da Silva", "123.456.789-00", agencia, bancoImperatriz);
        Cliente cliente1 = new Cliente("Pedro da Silva", "123.456.789-00", agencia, bancoImperatriz);
        Cliente cliente2 = new Cliente("Maria da Silva", "987.654.321-00", agencia2, bancoImperatriz);
        Conta cc = new ContaCorrente(cliente0, agencia);
        Conta cp = new ContaPoupanca(cliente0, agencia);
        cc.depositar(1000);
        cc.transferir(250, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cp.sacar(200);
        cp.imprimirExtrato();
        bancoImperatriz.listarAgencias();
        bancoImperatriz.listarClientes();
    }
}