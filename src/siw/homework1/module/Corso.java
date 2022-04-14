package siw.homework1.module;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/*Per la strategia di fetch con il docente lascio EAGER ovvero quella di default
 * poiché ha senso cercare le informazioni del decente associato ad un corso
 * quando si analizza il corso stesso*/

/*Lo stesso per la strategia di fetch con  allievo lascio quella di deafault dato che 
 * è impensabile caricare tutti i dati di tutti gli allievi assocati ogni volta che 
 * si accede ad un corso*/
@Entity
public class Corso {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private Date dataInizio;
	@Column 
	private int durataCorso;
	@ManyToOne
	private Docente docente;
	@ManyToMany(mappedBy = "corso")	
	private List<Allievo> allievo;
	
}
