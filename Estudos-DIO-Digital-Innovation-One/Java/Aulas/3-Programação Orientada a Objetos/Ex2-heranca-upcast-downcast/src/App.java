public class App {



    //
    //Usando Upcast, Downcast
    //

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(); //Não teve upcast nem downcast

        // Upcast (TUdo que está em Funcionario estará nos Gerentes, Vendedores e Faxineiros)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast (Tomar cuidado, nem tudo que está em Vendedor estará em Funcionário)
        Vendedor vendedor_ = (Vendedor) new Funcionario();

;
    }
}
