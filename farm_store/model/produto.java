package com.generation.farm_store.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(max = 255, message = "Este atributo tem que ter no máximo 255 caracteres")
	private String nome;

	@Digits(integer = 10, fraction = 2)
	@NotNull(message = "Este atributo é de preenchimento obrigatório")
	private BigDecimal valor;

	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(max = 500, message = "Este atributo tem que ter no máximo 500 caracteres")
	private String descricao;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private categoria categoria;

	public categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}