public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    // Métodos
    @Override
    public void sacar(double valor ){
        saldo -= valor;
    };
    
    @Override
    public void depositar(double valor){
        saldo += valor;
    };
    
    @Override
    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    };

    // Getters
    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Métodos

    protected void imprimirInfosDaConta(){
        System.out.println(String.format("Agência: %04d", this.getAgencia()));
        System.out.println(String.format("Número: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
