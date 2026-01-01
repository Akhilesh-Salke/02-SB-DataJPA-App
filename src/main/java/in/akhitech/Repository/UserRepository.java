package in.akhitech.Repository;

import org.springframework.data.repository.CrudRepository;

import in.akhitech.entity.UserInfo;

public interface UserRepository extends CrudRepository<UserInfo, Integer>{
	
}
