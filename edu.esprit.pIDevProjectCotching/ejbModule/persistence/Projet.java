package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Projet
 * 
 */
@Entity
public class Projet implements Serializable {

	private int idProjet;
	private String nameProjet;

	private List<Affectation> affectations;
	private static final long serialVersionUID = 1L;

	public Projet() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}

	public String getNameProjet() {
		return this.nameProjet;
	}

	public void setNameProjet(String nameProjet) {
		this.nameProjet = nameProjet;
	}

	@OneToMany(mappedBy = "projet")
	public List<Affectation> getAffectations() {
		return affectations;
	}

	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}

}
