package com.java.zumair.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import com.java.zumair.demo.entities.ToDo;
import com.java.zumair.demo.entities.User;
import com.java.zumair.demo.repository.UserRepository;

@SpringBootApplication
public class FullStackRestApiApplication implements CommandLineRunner {
	@Autowired
	UserRepository userrepo;

	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(FullStackRestApiApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
//		 TODO Auto-generated method stub
//		User u1=new User(1,"Shakib","shakib@gmail.com",22,"787887332","123",);
//		User u2 = new User(2 , "nitin" , "nitin@gmail.com" , 21 , "598435","abcd");
//        User u3 = new User(3 , "vishal" , "vishal@gmail.com" , 23 , "6473825","ghde");
//        User u4 = new User(4 , "jatin" , "jatin@gmail.com" , 30 , "43652148721","3456");
//        User u5 = new User(5 , "neha" , "neha@gmail.com" , 25 , "6487324","hjkl");
//        User u6 = new User(6 , "amit" , "amit@gmail.com" , 18 , "648732","joor");
//        User u7 = new User(7 , "vaibhav" , "vaibhav@gmail.com" , 21 , "8793232s","3445");
//		List<User> users=Arrays.asList(u1,u2,u3,u4,u5,u6,u7);
//		users.stream().forEach(u->userrepo.save(u));
//		userrepo.findByAgeGreaterthan(23).stream().forEach(System.out::println);
//		userrepo.findNameStartWith("n").stream().forEach(System.out::println);;

		List<ToDo> todos = new ArrayList<ToDo>();
		ToDo t1 = new ToDo("learn react ", "learning react for developements", new Date(), false);
		ToDo t2 = new ToDo("learn data science ", "learning data science for developements", new Date(), false);
		ToDo t3 = new ToDo("learn angular ", "learning angular for developements", new Date(), false);
		todos.add(t1);
		todos.add(t2);
		todos.add(t3);
		User user = userrepo.findById(1).get();
		t1.setUser(user);
		t2.setUser(user);
		t3.setUser(user);
		System.out.println(user);
		user.setTodos(todos);
		userrepo.save(user);

	}

}
