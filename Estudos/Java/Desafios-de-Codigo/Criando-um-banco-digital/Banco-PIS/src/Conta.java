public abstract class Conta implements Iconta {

    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    
    public int getAgencia() {
        return agencia;
    }



    public int getNumero() {
        return numero;
    }



    public double getSaldo() {
        return saldo;
    }



    public Cliente getCliente() {
        return cliente;
    }



    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("Você não possui saldo para sacar!");
            System.out.println("Saldo: " + this.saldo);
            System.out.println("=================================");            
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo>=valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
        }else{
            System.out.println("Você não possui saldo para transferir!");
            System.out.println("Saldo: " + this.saldo);
            System.out.println("=================================");
        }
    }

    
    protected void imprimirInfos() {

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

        if(saldo<0) System.out.println("SALDO NEGATIVO, TAXA DE JUROS : 15%/mes");

    }
    
}
