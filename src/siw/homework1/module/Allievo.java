package siw.homework1.module;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/*per la strategia di fetch rispetto a società si potrebbe pensare di non utilizzare EAGER
 * ma piuttosto LAZY dato che probabilmente non ci interessano le informazioni riguardanti la società 
 * se necessitiamo delle informazioni di un allievo*/

/*Lo stesso per la strategia di fetch con  corso lascio quella di deafault dato che 
 * è impensabile caricare tutti i dati di tutti i corsi assocati ogni volta che 
 * si accede alle informazioni di un allievo*/

@Entity
public class Allievo {
	
	@Id 
	private String matricola;
	@Column 
	private String nome;
	@Column 
	private String cognome;
	@Column 
	private Date dataNascita;
	@Column 
	private String luogoNascita;
	@Column
	private String email;
	@ManyToMany
	private List<Corso> corso;
	@ManyToOne
	private Societa società;
	

}
