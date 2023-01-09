public class App {
    public static void main(String[] args) throws Exception {
        
        String mensagem = Mensagens.getMensagem(0);

        System.out.println(mensagem);

        Double area = Quadrilatero.area(4, 2);

        System.out.println(area);

    }
}
