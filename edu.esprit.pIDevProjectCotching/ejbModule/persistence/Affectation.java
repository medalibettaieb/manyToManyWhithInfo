package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * Entity implementation class for Entity: Affectation.
 */
@Entity

public class Affectation implements Serializable {


	/** The affectation pk. */
	private AffectationPK affectationPK;
	
	/** The role. */
	private String role;
	
	/** The employee. */
	private Employee employee;
	
	/** The projet. */
	private Projet projet;
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new affectation.
	 */
	public Affectation() {
		super();
	}   
	
	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * Gets the affectation pk.
	 *
	 * @return the affectation pk
	 */
	@EmbeddedId
	public AffectationPK getAffectationPK() {
		return affectationPK;
	}
	
	/**
	 * Sets the affectation pk.
	 *
	 * @param affectationPK the new affectation pk
	 */
	public void setAffectationPK(AffectationPK affectationPK) {
		this.affectationPK = affectationPK;
	}
	
	/**
	 * Gets the employee.
	 *
	 * @return the employee
	 */
	@ManyToOne
	@JoinColumn(name="idEmp" ,referencedColumnName="idEmployee",insertable=false,updatable=false)
	public Employee getEmployee() {
		return employee;
	}
	
	/**
	 * Sets the employee.
	 *
	 * @param employee the new employee
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * Gets the projet.
	 *
	 * @return the projet
	 */
	@ManyToOne
	@JoinColumn(name="idProj" ,referencedColumnName="idProjet",insertable=false,updatable=false)
	public Projet getProjet() {
		return projet;
	}
	
	/**
	 * Sets the projet.
	 *
	 * @param projet the new projet
	 */
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	/**
	 * Instantiates a new affectation.
	 *
	 * @param role the role
	 * @param employee the employee
	 * @param projet the projet
	 */
	public Affectation(String role, Employee employee, Projet projet) {
		
		this.role = role;
		this.employee = employee;
		this.projet = projet;
		this.affectationPK= new AffectationPK(employee.getIdEmployee(), projet.getIdProjet());
	}
	
   
}
