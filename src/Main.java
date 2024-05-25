//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Executar métodos do Reprodutor Musical
        iphone.selecionarMusica("Nome da Música");
        iphone.tocar();
        iphone.pausar();

        // Executar métodos do Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Executar métodos do Navegador na Internet
        iphone.exibirPagina("https://www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}