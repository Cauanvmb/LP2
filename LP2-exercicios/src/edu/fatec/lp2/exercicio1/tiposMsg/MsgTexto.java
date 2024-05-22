package edu.fatec.lp2.exercicio1.tiposMsg;

import edu.fatec.lp2.exercicio1.contatos.Contatinho;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, int numChar) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    @Override
    public String toString() {
        return "MsgTexto{" + "numChar=" + numChar + ", conteudo='" + getConteudo() + '\'' + '}';
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgTexto(getDestinatario(), getHoraEnvio(), conteudo, conteudo.length());
    }
}