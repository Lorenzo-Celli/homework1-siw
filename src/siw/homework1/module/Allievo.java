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
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String luogoNascita;
	private String email;
	@ManyToMany
	private List<Corso> corso;
	@ManyToOne
	private Societa società;
	public String getNome() {
		return nome;
		
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
