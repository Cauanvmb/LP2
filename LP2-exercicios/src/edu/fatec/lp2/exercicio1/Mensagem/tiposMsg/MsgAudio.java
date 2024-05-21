package Mensagem.tiposMsg;
import Mensagem.Contatinho;
import Mensagem.Mensagem;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "MsgAudio{" + "duracao=" + duracao + ", conteudo='" + getConteudo() + '\'' + '}';
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgAudio(getDestinatario(), getHoraEnvio(), conteudo, this.duracao);
    }
}