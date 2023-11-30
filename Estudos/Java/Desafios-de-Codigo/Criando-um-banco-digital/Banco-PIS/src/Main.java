public class Main {
    public static void main(String[] args) throws Exception {

        Cliente Lucas = new Cliente("Lucas", "lucas@hotmail.com", 18);

        Conta cc = new ContaCorrente(Lucas);
        Conta cp = new ContaPoupanca(Lucas);
        Conta ci = new ContaInvestimento(Lucas);

        cc.depositar(100);
        cc.transferir(100, ci);
        cc.transferir(50, cp);

        cc.sacar(50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        ci.imprimirExtrato();

    }
}
