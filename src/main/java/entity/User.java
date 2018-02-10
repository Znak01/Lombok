package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user") 
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

	public User(String firstName, String lastName, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", getId()=" + getId()
				+ "]";
	}
	
	
	
}
