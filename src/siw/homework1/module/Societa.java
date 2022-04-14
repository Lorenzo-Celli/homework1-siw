package siw.homework1.module;

import javax.persistence.*;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column 
	private String ragioneSociale;
	@Column 
	private String indirizzo;
	@Column 
	private String telefono;
	
	
}
