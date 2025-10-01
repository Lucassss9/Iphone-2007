package iphone;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    public void tocar() {
        System.out.println("Tocando musica...");
    }
    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
