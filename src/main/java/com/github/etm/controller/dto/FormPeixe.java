package com.github.etm.controller.dto;

import java.time.LocalDate;

import com.github.etm.model.Peixe;

public class FormPeixe {
	
	private String nome; 
	private String descricao;
	private double pesoMaximo;
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
	
	public FormPeixe toForm(Peixe peixe) {
		this.nome = peixe.getNome();
		this.descricao = peixe.getDescricao();
		this.pesoMaximo = peixe.getPesoMaximo();
		this.dataCatalogacao = peixe.getDataCatalogacao();
		return this;
	}

	public Peixe toModel() {
		Peixe peixe = new Peixe();
		peixe.setNome(this.getNome());
		peixe.setDescricao(this.getDescricao());
		peixe.setPesoMaximo(this.getPesoMaximo());
		peixe.setDataCatalogacao(this.getDataCatalogacao());
		return peixe;
	}
}
