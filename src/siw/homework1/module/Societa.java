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
	@Column 
	private String ragioneSociale;
	@Column 
	private String indirizzo;
	@Column 
	private String telefono;
	@OneToMany
	@JoinColumn(name = "società_id")
	private List<Allievo> allievo;
	
	
}
