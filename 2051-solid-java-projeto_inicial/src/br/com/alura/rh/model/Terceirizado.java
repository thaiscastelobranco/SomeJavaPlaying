package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {
	
	private DadosPessoais dadosPessoais;
	private String empresa;
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void promover(Cargo novoCargo) {
	}
	
	public void atualizarSalario(BigDecimal novoSalario) {
	}
		
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
