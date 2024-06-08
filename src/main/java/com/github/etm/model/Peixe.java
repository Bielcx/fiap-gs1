package com.github.etm.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "peixes")
public class Peixe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(length = 300)
	private String descricao;
	
	@Column(nullable = false)
	private double pesoMaximo;
	
	@Column(nullable = false)
	private LocalDate dataCatalogacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public LocalDate getDataCatalogacao() {
		return dataCatalogacao;
	}

	public void setDataCatalogacao(LocalDate dataCatalogacao) {
		this.dataCatalogacao = dataCatalogacao;
	}

}
