package com.example.bootbasic.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootbasic.model.User;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

	public UserResource() {
		// TODO Auto-generated constructor stub
	}

	
	
	@GetMapping("/all")
	public List<User> getAll()
	{
		User user = new User("Immanuel",2000L);
		
		User user2 = new User("MaihiPingliu",4000L);
		
		
		return Arrays.asList(user,user2);
		
	}
	
	

	@GetMapping(value="/hateos/all",produces=MediaTypes.HAL_JSON_VALUE)
	public List<User> getHateosAll()
	{
		User user = new User("Immanuel",2000L);
		
		User user2 = new User("ImmaNU",4000L);
		
		//addLink
		Link link=  ControllerLinkBuilder.linkTo(UserResource.class)
		            .slash(user.getName()).withSelfRel();
		
		user.add(link);
		
		user2.add(link);
		
		return Arrays.asList(user,user2);
		
	}
	
	
	
}
