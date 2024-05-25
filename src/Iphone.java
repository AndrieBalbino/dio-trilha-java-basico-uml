import com.estudos.dio.uml.AparelhoTelefonico;
import com.estudos.dio.uml.NavegadorInternet;
import com.estudos.dio.uml.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica+ "selecionada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionado nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("página atualizada");
    }
}
