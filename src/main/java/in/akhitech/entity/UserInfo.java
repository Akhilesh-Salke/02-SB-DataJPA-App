package in.akhitech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="UserData")

public class UserInfo {
	@Id
	private Integer userId;
	private String name;
	private String city;
	private Integer userAge;

}
