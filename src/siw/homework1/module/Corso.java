package siw.homework1.module;

import java.util.Date;

import javax.persistence.*;

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
	
}
