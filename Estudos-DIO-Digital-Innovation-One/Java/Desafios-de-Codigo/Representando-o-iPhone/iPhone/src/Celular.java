import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    //Atributos
    private String marca;
    private String cor;
    private String sistema;

    //Construtor
    public Celular(String marca, String cor, String sistema) {
        this.marca = marca;
        this.cor = cor;
        this.sistema = sistema;
    }

    //Gets and Sets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    //Metodos
    @Override
    public void tocar() {
        
        System.out.println("Tocando Música no seu " + marca);

    }

    @Override
    public void pausar() {

        System.out.println("Música pausada no seu " + marca);

    }

    @Override
    public void selecionarMusica() {

        System.out.println("Selecionando Música no seu " + marca);

    }

    @Override
    public void ligar() {

        System.out.println("Ligando do seu " + marca + cor);

    }

    @Override
    public void atender() {

        System.out.println("Atendendo no seu " + marca + " que tem o sistema " + sistema);

    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Iniciando Correio de Voz no seu sistema " + sistema );

    }

    @Override
    public void exibirPagina() {

        System.out.println("Exibindo Pagina WEB no seu " + marca + cor);

    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Nova Aba adicionada....");

    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando Pagina....");

    }

    
}
