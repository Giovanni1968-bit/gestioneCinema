package it.solving.esercizi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import it.solving.esercizi.model.Spettacolo;

public interface SpettacoloService extends JpaRepository<Spettacolo, Integer> {
	
	public Spettacolo findByIdSpettacolo(Integer idspettacolo);
	
	public void deleteById(Integer idspettacolo);
	
	
	@Query(value = "SELECT s.idspettacolo, S.titolo, S.dataora FROM spettacolo S WHERE"
			+ "S.dataora < now() ORDER BY S.IDSPETTACOLO, S.DATAORA " 
			, nativeQuery = true)
	Integer findAll (int idspettacolo );
	
	
//	@Query(value = "DELETE FROM spettacolo S, WHERE  S.titolo = '" + titolo + "'"			
//			, nativeQuery = true)
//	Integer deleteSpe (int idspettacolo );
//	
//	
//	@Query(value = "INSERT INTO spettacolo (idspettacolo, titolo, dataora, sala,  prezzobiglietto "
//			+ "bigliettivenduti) value ( " + idspettacolo + ",' " + titolo + "', ' " + dataora + "', '" + sala + "'  prezzobiglietto  " ), nativeQuery = true)
//	Integer InsertSpettacolo (int idspettacolo );
//	
	
	
	
	
}
