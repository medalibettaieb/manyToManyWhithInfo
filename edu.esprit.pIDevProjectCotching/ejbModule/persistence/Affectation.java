package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Affectation
 *
 */
@Entity

public class Affectation implements Serializable {


	private AffectationPK affectationPK;
	private String role;
	
	private Employee employee;
	private Projet projet;
	
	private static final long serialVersionUID = 1L;

	public Affectation() {
		super();
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@EmbeddedId
	public AffectationPK getAffectationPK() {
		return affectationPK;
	}
	public void setAffectationPK(AffectationPK affectationPK) {
		this.affectationPK = affectationPK;
	}
	@ManyToOne
	@JoinColumn(name="idEmp" ,referencedColumnName="idEmployee",insertable=false,updatable=false)
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@ManyToOne
	@JoinColumn(name="idProj" ,referencedColumnName="idProjet",insertable=false,updatable=false)
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public Affectation(String role, Employee employee, Projet projet) {
		
		this.role = role;
		this.employee = employee;
		this.projet = projet;
		this.affectationPK= new AffectationPK(employee.getIdEmployee(), projet.getIdProjet());
	}
	
   
}
