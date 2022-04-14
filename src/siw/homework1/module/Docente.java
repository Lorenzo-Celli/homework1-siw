package siw.homework1.module;

import java.util.Date;

import javax.persistence.*;

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
	
	
}
