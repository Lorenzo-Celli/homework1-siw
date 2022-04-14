package siw.homework1.module;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

//Per la strategia di fetch lascio quella di default
//poichè probabilmente non si ha bisogno di avere informazioni su 
//tutti i corsi di un docente quando si richiedono i suoi dati. 
//Lo stesso vale per cascade
@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private Date dataNascita;
	@Column 
	private String  luogoNascita;
	@Column 
	private String partitaIva;
	@OneToMany
	@JoinColumn(name = "docente_id")
	private List<Corso> corsi;
	
	
}
