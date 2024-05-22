package edu.fatec.lp2.exercicio1.whatsapp;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.lp2.exercicio1.contatos.Contatinho;
import edu.fatec.lp2.exercicio1.tiposMsg.Mensagem;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void listarContatos() {
        for (Contatinho contato : contatos) {
            System.out.println(contato);
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }

    public void addContato(Contatinho contato) {
        contatos.add(contato);
    }

    public void addMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }
}