package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {
	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	
	void adicionarNome (String nome) {
		this.nome = nome;
	}
	
	void adicionarCpf (String cpf) {
		this.cpf = cpf;
	}
	
}
