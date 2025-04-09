public interface IConta {

     // Métodos
     void depositar(double valor);
     void sacar(double valor);
     void transferir(double valor, Conta contaDestino);
     void imprimirExtrato();
     int getNumero();
     double getSaldo();
     Cliente getCliente();
}
