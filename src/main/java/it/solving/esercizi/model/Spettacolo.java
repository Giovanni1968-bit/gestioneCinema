package it.solving.esercizi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spettacolo")
public class Spettacolo {
	
	@Id
	@Column(name="idspettacolo")
	
	int idspettacolo;
	
	String titolo;
	
	String dataora;
	
	String sala;
	
	double prezzobiglietto;
	
	int bigliettivenduti;
	
	public int getIdspettacolo() {
		return idspettacolo;
	}
	
	// Full constructor
	public Spettacolo(int idspettacolo, String titolo, String dataora, String sala, double prezzobiglietto,
			int bigliettivenduti) {
		super();
		this.idspettacolo = idspettacolo;
		this.titolo = titolo;
		this.dataora = dataora;
		this.sala = sala;
		this.prezzobiglietto = prezzobiglietto;
		this.bigliettivenduti = bigliettivenduti;
	}


	public void setIdspettacolo(int idspettacolo) {
		this.idspettacolo = idspettacolo;
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

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public double getPrezzobiglietto() {
		return prezzobiglietto;
	}

	public void setPrezzobiglietto(double prezzobiglietto) {
		this.prezzobiglietto = prezzobiglietto;
	}

	public int getBigliettivenduti() {
		return bigliettivenduti;
	}

	public void setBigliettivenduti(int bigliettivenduti) {
		this.bigliettivenduti = bigliettivenduti;
	}

	// costruttore vuoto
	public Spettacolo() {
		super();
	}
	

}
