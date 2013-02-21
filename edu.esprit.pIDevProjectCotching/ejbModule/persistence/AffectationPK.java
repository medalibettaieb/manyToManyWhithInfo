package persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

// TODO: Auto-generated Javadoc
/**
 * The Class AffectationPK.
 */
@Embeddable
public class AffectationPK implements Serializable {
	
	/** The id emp. */
	private int idEmp;
	
	/** The id proj. */
	private int idProj;

	/**
	 * Gets the id emp.
	 *
	 * @return the id emp
	 */
	public int getIdEmp() {
		return idEmp;
	}

	/**
	 * Sets the id emp.
	 *
	 * @param idEmp the new id emp
	 */
	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	/**
	 * Gets the id proj.
	 *
	 * @return the id proj
	 */
	public int getIdProj() {
		return idProj;
	}

	/**
	 * Sets the id proj.
	 *
	 * @param idProj the new id proj
	 */
	public void setIdProj(int idProj) {
		this.idProj = idProj;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmp;
		result = prime * result + idProj;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AffectationPK other = (AffectationPK) obj;
		if (idEmp != other.idEmp)
			return false;
		if (idProj != other.idProj)
			return false;
		return true;
	}

	/**
	 * Instantiates a new affectation pk.
	 */
	public AffectationPK() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new affectation pk.
	 *
	 * @param idEmp the id emp
	 * @param idProj the id proj
	 */
	public AffectationPK(int idEmp, int idProj) {
		super();
		this.idEmp = idEmp;
		this.idProj = idProj;
	}

}
