package br.com.rkz98.ilustrandoUFM.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "destinacao")
public class Destinacao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "valorSaida")
	private float valorSaida;

	@ManyToOne
	@JoinColumn(name="categoria")
	private Categoria categoria;

	@Column(name = "comentario")
	private String comentario;

	@Column(name = "dataDestinacao")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataDestinacao;

	@Column(name = "dashboard_id")
	private long dashboard_id;

	public Destinacao() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getValorSaida() {
		return valorSaida;
	}

	public void setValorSaida(float valorSaida) {
		this.valorSaida = valorSaida;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Date getDataDestinacao() {
		return dataDestinacao;
	}

	public void setDataDestinacao(Date dataDestinacao) {
		this.dataDestinacao = dataDestinacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
