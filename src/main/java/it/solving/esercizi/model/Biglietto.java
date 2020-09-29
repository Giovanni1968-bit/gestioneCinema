package it.solving.esercizi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biglietto")
public class Biglietto {
	@Id
	@Column(name="idbiglietto")
	int idbiglietto;
	public int getIdbiglietto() {
		return idbiglietto;
	}

	public void setIdbiglietto(int idbiglietto) {
		this.idbiglietto = idbiglietto;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDataora() {
		return dataora;
	}

	public void setDataora(String dataora) {
		this.dataora = dataora;
	}

	String nomecliente;
	String titolo;
	String dataora;
	
	// costruttore vuoto
	public Biglietto() {
		super();
	}
	

}
