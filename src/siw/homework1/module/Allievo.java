package siw.homework1.module;

import java.util.Date;

import javax.persistence.*;

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

}
