package ozkan.volkan.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "volkan_ozkan_obss")
public class Users implements Serializable {

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
	private Authorities authorities;

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "birthday")
	private Date birthday;

	@Column(name = "sex")
	private Short sex;

	@Column(name = "enabled")
	private Boolean enabled;

	public Users() {
	}

	public Users(String username) {
		this.username = username;
	}

	public Users(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Short getSex() {
		return sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Authorities getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Authorities authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "Users [authorities=" + authorities + ", username=" + username + ", password=" + password + ", email="
				+ email + ", birthday=" + birthday + ", sex=" + sex + ", enabled=" + enabled + "]";
	}

}
