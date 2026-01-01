package in.akhitech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.akhitech.Repository.UserRepository;
import in.akhitech.entity.UserInfo;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public void saveUserFun() {
		UserInfo u = new UserInfo();

		u.setUserId(707);
		u.setName("Ram");
		u.setCity("PUN");
		u.setUserAge(21);

		UserInfo save = userRepo.save(u);
		System.out.println("One User saved !!!");
		System.out.println("Saved User is :: " + save);
		
		System.out.println("---------------------------------------------------");
	}

	public void saveAllUserFun() {
		UserInfo u1 = new UserInfo();

		u1.setUserId(909);
		u1.setName("Shyam");
		u1.setCity("HYD");
		u1.setUserAge(31);

		UserInfo u2 = new UserInfo();

		u2.setUserId(303);
		u2.setName("Hari");
		u2.setCity("BLU");
		u2.setUserAge(24);

		UserInfo u3 = new UserInfo();

		u3.setUserId(202);
		u3.setName("Shiva");
		u3.setCity("BOM");
		u3.setUserAge(34);
		
		List<UserInfo> l = new ArrayList<>(); 
		l.add(u1);
		l.add(u2);
		l.add(u3);
		
		Iterable<UserInfo> saveAll = userRepo.saveAll(l);
		System.out.println("All Users saved !!!");
		System.out.println("Saved Users are :: ");
		saveAll.forEach(System.out::println);
	
		System.out.println("---------------------------------------------------");

	}
	
	public void findUserFun() {
//		Optional<UserInfo> byId = userRepo.findById(909);
		
		System.out.println(userRepo.findById(909));
	}
	
	public void findAllUserFun() {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(101);
		l.add(303);
		l.add(303);
		Iterable<UserInfo> allById = userRepo.findAllById(l);
		System.out.println(allById);
	}

}
