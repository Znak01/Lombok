package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter @Setter
@NoArgsConstructor
public class Category extends BaseEntity {

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", getId()=" + getId() + "]";
	}



	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
}
