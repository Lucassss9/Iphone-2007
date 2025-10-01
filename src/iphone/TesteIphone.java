package iphone;

public class TesteIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando o reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("See you Again");
        meuIphone.pausar();

        System.out.println("=====================================");

        // Testando o aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("=====================================");

        // Testando o navegador
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
