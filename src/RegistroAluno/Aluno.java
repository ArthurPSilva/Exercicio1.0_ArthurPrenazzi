package RegistroAluno;

import java.util.Date;

public class Aluno {

		private String nome;
		private Integer cpf;
		private Date dataDeNascimento;
		private String email;
		
		public Aluno() {
			super();
		}
		
		public Aluno(String nome, Integer cpf, Date dataDeNascimento, String email) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.dataDeNascimento = dataDeNascimento;
			this.email = email;
		}
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getCpf() {
			return cpf;
		}
		public void setCpf(Integer cpf) {
			this.cpf = cpf;
		}
		public Date getDataDeNascimento() {
			return dataDeNascimento;
		}
		public void setDataDeNascimento(Date dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
	}
