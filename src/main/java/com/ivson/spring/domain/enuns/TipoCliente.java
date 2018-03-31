package com.ivson.spring.domain.enuns;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int codigo;
	private String descricao;
	
	public static TipoCliente toEnum(Integer codigo) {
		
		if (codigo == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			
			if (codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido: " + codigo);
	}
	
	private TipoCliente(int codigo, String descricao) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}