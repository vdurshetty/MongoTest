package venu.test.pojo;

import java.io.Serializable;

/**
 * @author ybangamuwage
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * user id.
	 */
	private int _id;
	/**
	 * user first name.
	 */
	private String firstName;
	/**
	 * user last name.
	 */
	private String lastName;

	/**
	 * user email address.
	 */
	private String email;

	/**
	 * default constructor.
	 */
	public User() {
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}