package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * Entity implementation class for Entity: Employee.
 */
@Entity
public class Employee implements Serializable {

	/** The id employee. */
	private int idEmployee;
	
	/** The name employee. */
	private String nameEmployee;
	
	/** The last name. */
	private String lastName;
	
	/** The affectations. */
	private List<Affectation> affectations;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {
		super();
	}

	/**
	 * Gets the id employee.
	 *
	 * @return the id employee
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEmployee() {
		return this.idEmployee;
	}

	/**
	 * Sets the id employee.
	 *
	 * @param idEmployee the new id employee
	 */
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	/**
	 * Gets the name employee.
	 *
	 * @return the name employee
	 */
	public String getNameEmployee() {
		return this.nameEmployee;
	}

	/**
	 * Sets the name employee.
	 *
	 * @param nameEmployee the new name employee
	 */
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Instantiates a new employee.
	 *
	 * @param nameEmployee the name employee
	 * @param lastName the last name
	 */
	public Employee(String nameEmployee, String lastName) {

		this.nameEmployee = nameEmployee;
		this.lastName = lastName;
	}
	
	/**
	 * Gets the affectations.
	 *
	 * @return the affectations
	 */
	@OneToMany(mappedBy="employee")
	public List<Affectation> getAffectations() {
		return affectations;
	}

	/**
	 * Sets the affectations.
	 *
	 * @param affectations the new affectations
	 */
	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}

}
