package RegistroAluno;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class CadastroAluno {
	
	public static void main(String[] args) throws ParseException{
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	Date dataDeNascimento1 = formato.parse("07/10/1999");
	Aluno aluno1 = new Aluno("Arthur",123456789,dataDeNascimento1,"email@email.com");
	Date dataDeNascimento2 = formato.parse("12/08/2000");
	Aluno aluno2 = new Aluno("Igor",987654321,dataDeNascimento2,"email@email.com");
	Date dataDeNascimento3 = formato.parse("28/01/1970");
	Aluno aluno3 = new Aluno("Luiz",111222333,dataDeNascimento3,"email@email.com");
	
	System.out.println("InformaÃ§Ãµes do Aluno1: ");
	System.out.println("Nome: " + aluno1.getNome());
	System.out.println("CPF: " + aluno1.getCpf());
	System.out.println("Data de Nascimento: " +aluno1.getDataDeNascimento());
	System.out.println("Email: " + aluno1.getEmail() +"\n");
	
	System.out.println("InformaÃ§Ãµes do Aluno2: ");
	System.out.println("Nome: " + aluno2.getNome());
	System.out.println("CPF: " + aluno2.getCpf());
	System.out.println("Data de Nascimento: " + aluno2.getDataDeNascimento());
	System.out.println("Email: " + aluno2.getEmail() +"\n");
	
	System.out.println("InformaÃ§Ãµes do Aluno3: ");
	System.out.println("Nome: " + aluno3.getNome());
	System.out.println("CPF: " + aluno3.getCpf());
	System.out.println("Data de Nascimento: " + aluno3.getDataDeNascimento());
	System.out.println("Email: " + aluno3.getEmail() );
	
	System.out.println("\n" + "O Aluno mais velho Ã© o Luiz com 53 anos.");
	
	}
}
