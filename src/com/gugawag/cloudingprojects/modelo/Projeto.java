package com.gugawag.cloudingprojects.modelo;

/**
 * Classe que representa um projeto no sistema Clouding Projects.
 * @author gugawag, gugawag@gmail.com
 *
 */
public class Projeto {

	private String nome;
	private String url;
	
	public Projeto() {
		this(null, null);
	}

	public Projeto(String nome, String url) {
		super();
		this.nome = nome;
		this.url = url;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
