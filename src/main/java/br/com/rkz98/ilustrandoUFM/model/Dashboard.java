package br.com.rkz98.ilustrandoUFM.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dashboard")
public class Dashboard implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "dataMesAno")
	private Date dataMesAno;
	
	@Column(name = "valorTotalArrecadado")
	private float valorTotalArrecadado;
	
	@Column(name = "valorTotalDestinado")
	private float valorTotalDestinado;

	public Dashboard() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataMesAno() {
		return dataMesAno;
	}

	public void setDataMesAno(Date dataMesAno) {
		this.dataMesAno = dataMesAno;
	}

	public float getValorTotalArrecadado() {
		return valorTotalArrecadado;
	}

	public void setValorTotalArrecadado(float valorTotalArrecadado) {
		this.valorTotalArrecadado = valorTotalArrecadado;
	}

	public float getValorTotalDestinado() {
		return valorTotalDestinado;
	}

	public void setValorTotalDestinado(float valorTotalDestinado) {
		this.valorTotalDestinado = valorTotalDestinado;
	}
}
