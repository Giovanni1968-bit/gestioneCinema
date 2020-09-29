package it.solving.esercizi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getTitolospettacolo() {
		return titolospettacolo;
	}

	public void setTitolospettacolo(String titolospettacolo) {
		this.titolospettacolo = titolospettacolo;
	}

	@Id
	@Column(name="idcliente")
	int idcliente;
	
	String nomecliente;
	
	String titolospettacolo;
	
	//
	public Cliente() {
		super();
	}
	
}
