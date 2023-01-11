/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacionamento;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Contato contato = new Contato();
                Contato contato2 = new Contato();
                    contato.setNome("Tyrion");
                    contato2.setNome("David");
		
                                    // ******** relacionamento tem-um endereco ******** //
		Endereco end = new Endereco();
                    end.setNomeRua("Rua Game of Thrones");
                    end.setNumero("n/a");
                    end.setComplemento("-");
                    end.setCidade("Kings Landing");
                    end.setEstado("Westeros");
                    end.setCep("9999999");
                
		Endereco end2 = new Endereco();
                    end2.setNomeRua("Breaking bad");
                    end2.setNumero("n/a");
                    end2.setComplemento("-");
                    end2.setCidade("Reino Alfeu");
                    end2.setEstado("Nordeste");
                    end2.setCep("5848135");
                
                                    contato.setEndereco(end);
                                    contato2.setEndereco(end2);
		
                                    // ******** relacionamento tem-um telefone ******** //
		Telefone telefone = new Telefone();
                    telefone.setTipo("celular");
                    telefone.setDdd("11");
                    telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
                    telefone2.setTipo("casa");
                    telefone2.setDdd("11");
                    telefone2.setNumero("88888-8888");
		
                Telefone telefone3 = new Telefone();
                    telefone2.setTipo("Casa");
                    telefone2.setDdd("71");
                    telefone2.setNumero("9863-7815");
                
                Telefone telefone4 = new Telefone();
                    telefone2.setTipo("Trabalho");
                    telefone2.setDdd("85");
                    telefone2.setNumero("5948-1597");
                
		Telefone[] telefones = new Telefone[2];
                    telefones[0] = telefone;
                    telefones[1] = telefone2;
		
                Telefone[] telefones2 = new Telefone[2];
                    telefones2[0] = telefone3;
                    telefones2[1] = telefone4;
                    
                                    contato.setTelefones(telefones);
                                    contato2.setTelefones(telefones2);
		
                // ******** Uma agenda tem muitos contatos ******** //
                Agenda agenda = new Agenda();     
                Contato[] contatos = new Contato[3];
                contatos[0] = contato;
                contatos[1] = contato2;
                    System.out.println("Bem vindo! Por favor, diga o nome da agenda: ");
                    agenda.setNome(scan.nextLine());                           
                    agenda.imprimirNome();
                 
                    
		if (contato2 != null && contato2.getEndereco() != null){
			System.out.println(contato2.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato2 != null && contato2.getTelefones() != null){
			for (Telefone t : contato2.getTelefones()){
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
