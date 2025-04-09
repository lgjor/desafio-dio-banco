public abstract class Conta implements IConta {

    // Atributos
    private static int SEQUENCIAL = 1;
    protected Agencia agencia;
    protected Cliente cliente;
    protected int numero;
    protected double saldo;

    // Construtor
    public Conta(Cliente cliente, Agencia agencia) {
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    // Métodos
    @Override
    public void depositar(double valor){
        saldo += valor;
    };
    
    @Override
    public void sacar(double valor ){
        saldo -= valor;
    };
    
    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    };

    // Getters
    public Agencia getAgencia() {
        return this.agencia;
    }

    @Override
    public int getNumero() {
        return this.numero;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public Cliente getCliente() {
        return this.cliente;
    }

    // Métodos

    protected void imprimirInfosDaConta(){
        System.out.print(String.format("Agência: %04d", this.agencia.getNumero()));
        System.out.println(String.format(" - %s", this.agencia.getNome()));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Número: %04d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
