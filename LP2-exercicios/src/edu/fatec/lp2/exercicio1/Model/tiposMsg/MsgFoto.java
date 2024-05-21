package edu.fatec.lp2.exercicio1.Model.tiposMsg;

import edu.fatec.lp2.exercicio1.Model.Contatinho;
import edu.fatec.lp2.exercicio1.Model.Mensagem;

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