package models;

import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Texto extends Model {
	// a herança do Model permite q todos os atributos sejam automaticamente persistidos.
	// tambem providencia um atributo id para a interação com o BD.
	public String titulo;
	@Lob // diz a JPA q deve usar uma grande base de dados para esse atributo
	public String conteudo;
	public String autor;
	//public Long id;
	
	public Texto(String titulo, String conteudo, String autor) {
		super();
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void addTexto( String titulo, String conteudo, String autor ) {
	    
	}
	
}
