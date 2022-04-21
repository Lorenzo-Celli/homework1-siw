package siw.homework1.module;

import java.util.List;

import javax.persistence.*;


/*per la strategia di fetch lascerei quella di default dato che è troppo costoso 
 * e soprattutto non necessario caricare tutte le informazioni di tutti gli allievi della società 
 * quando si accede alle informazioni di essa*/

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ragioneSociale;
	private String telefono;
	@OneToMany
	@JoinColumn(name = "società_id")
	private List<Allievo> allievo;
	@OneToOne
	private Indirizzo indirizzo;
	
	
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
