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
@Table(name = "arrecadacao")
public class Arrecadacao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "valorEntrada")
	private float valorEntrada;
	
	@ManyToOne
	@JoinColumn(name="fonte")
	private Fonte fonte;

	@Column(name = "dataArrecadacao")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataArrecadacao;

	@Column(name = "dashboardId")
	private long dashboardId;

	public Arrecadacao() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(float valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public Fonte getFonte() {
		return fonte;
	}

	public void setFonte(Fonte fonte) {
		this.fonte = fonte;
	}

	public Date getDataArrecadacao() {
		return dataArrecadacao;
	}

	public void setDataArrecadacao(Date dataArrecadacao) {
		this.dataArrecadacao = dataArrecadacao;
	}

	public long getDashboardId() {
		return dashboardId;
	}

	public void setDashboardId(long dashboardId) {
		this.dashboardId = dashboardId;
	}

}
