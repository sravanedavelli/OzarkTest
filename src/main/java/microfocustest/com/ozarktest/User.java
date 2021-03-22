
package microfocustest.com.ozarktest;

/**
 *
 * @author @GET
 */
//@RequestScoped
//@Named("user")

public class User {

	public User() {
	}

	public User(String firstname, String lastname, String userid) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.userid = userid;
	}

	private String firstname;
	private String lastname;
	private String userid;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
