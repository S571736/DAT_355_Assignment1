/**
 */
package bowling;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Player#getName <em>Name</em>}</li>
 *   <li>{@link bowling.Player#getDateofBirth <em>Dateof Birth</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bowling.BowlingPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bowling.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dateof Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dateof Birth</em>' attribute.
	 * @see #setDateofBirth(Date)
	 * @see bowling.BowlingPackage#getPlayer_DateofBirth()
	 * @model
	 * @generated
	 */
	Date getDateofBirth();

	/**
	 * Sets the value of the '{@link bowling.Player#getDateofBirth <em>Dateof Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateof Birth</em>' attribute.
	 * @see #getDateofBirth()
	 * @generated
	 */
	void setDateofBirth(Date value);

} // Player
