package it.solving.esercizi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.solving.esercizi.model.Spettacolo;
import it.solving.esercizi.service.SpettacoloService;



@Controller
public class MainController implements ErrorController {
   
    private static String dataStatica;
   
    @Autowired
    SpettacoloService ss;

    @GetMapping(value = "/homePage")
    public String getIndex() {
	return "index";
    }
         
    @GetMapping(value = "/updateSpettacolo")
    public String updateSpettacolo() {
    	return "updateSpettacolo";
    }
      
    @GetMapping("/allSpettacoli")
    public String cercaAll(Model m) {
 
	ArrayList<Spettacolo> spe = (ArrayList) ss.findAll();

	m.addAttribute("lista", spe);
	return "allSpettacoli";}
   
    @GetMapping("/nuovoSpettacolo")
    public String nuovoSpe(Model m, @RequestParam(name = "nome") String nome,
	    @RequestParam(name = "titolo") String cognome, @RequestParam(name = "stipendio") Double stipendio) {
    
    // da passare i valori della jsp
	Spettacolo s = new Spettacolo(idspettacolo, titolo,  dataora,  sala,  prezzobiglietto, bigliettivenduti);

	ss.saveAndFlush(s);
	
	return "confermaAggiunta";
	
   
    @GetMapping("/eliminaSpettacolo")
    public String eliminaSpe(Model m, @RequestParam(name = "idspettacolo") Integer idspettacolo)
    		 {
    	
    	Spettacolo s ;
    	String eliminazione;
    	
    	s = ss.findByIdSpettacolo(idspettacolo);
		if(s != null) {
			// implementare service get by id
			ss.deleteById(s.getIdSpettacolo());
			eliminazione = "confermaEliminazione";
			return eliminazione;
		}
		else {
			eliminazione = "spettacoloNo";
			return eliminazione;
		}
    }

    @GetMapping("/modificaspettacolo")
    public String modificaDip(Model m, @RequestParam(name = "idspettacolo") Integer idspettacolo,
	    @RequestParam(name = "nome") String nome, @RequestParam(name = "cognome") String cognome,
	    @RequestParam(name = "stipendio") Double stipendio) {
    	 
	Spettacolo d = ss.findByIdSpettacolo(idspettacolo);
	String controllo;
	if (d != null) {
		
		if(!titolo.equals(""))
			d.setTitolo(titolo);
		if(!dataora.equals(""))
			d.setDataora(dataora);
		if(sala!=null)
			d.setSalao(sala);
		if(!prezzobiglietto.equals(""))
			d.setPrezzobiglietto(prezzobiglietto);
		if(!bigliettivenduti.equals(""))
			d.setBigliettivenduti(bigliettivenduti);
			
	    ss.saveAndFlush(d);
	    controllo = "confermaModifica";
	    return controllo;
	} else {
		controllo = "spettacoloNo";
    return controllo;
    	}
        	
    }

    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "error";
    }
 
    @Override
    public String getErrorPath() {
        return "error";
    }

}
