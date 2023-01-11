/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacionamento;

/**
 *
 * @author David
 */
public class Agenda {
        private String nome;
	private Contato[] contatos;
     
        
    public void imprimirNome()
    {
        System.out.println("Nome da agenda: " + nome);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getConcatos() {
        return contatos;
    }

    public void setConcatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
