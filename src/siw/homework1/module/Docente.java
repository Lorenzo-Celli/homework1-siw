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
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String  luogoNascita;
	private String partitaIva;
	@OneToMany
	@JoinColumn(name = "docente_id")
	private List<Corso> corsi;
	
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
	public String getPartitaIva() {
		return partitaIva;
	}
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	
	
	
}
