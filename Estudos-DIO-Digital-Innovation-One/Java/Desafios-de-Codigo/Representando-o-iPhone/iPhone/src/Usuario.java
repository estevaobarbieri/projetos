public class Usuario {
    public static void main(String[] args) {
        
        String marca = "iPhone";
        String cor = "Preto";
        String sistema = "IOS";

        Celular iphone = new Celular(marca, cor, sistema);

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
