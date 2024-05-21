package Mensagem.tiposMsg;
import Mensagem.Contatinho;
import Mensagem.Mensagem;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "MsgFoto{" + "tamanho=" + tamanho + ", conteudo='" + getConteudo() + '\'' + '}';
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgFoto(getDestinatario(), getHoraEnvio(), conteudo, this.tamanho);
    }
}