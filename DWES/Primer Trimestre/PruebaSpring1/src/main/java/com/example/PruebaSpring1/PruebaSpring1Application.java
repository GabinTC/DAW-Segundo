package com.example.PruebaSpring1;

import com.example.PruebaSpring1.clases.Post;
import com.example.PruebaSpring1.clases.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaSpring1Application {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSpring1Application.class, args);

		Usuario u1 = new Usuario("1111", "yiyo1");
		Post p1 = new Post("g8h04g", "Post uno");

		u1.addPost(p1);

		System.out.println(p1.getTexto());
		System.out.println(u1.getAlias());
		System.out.print(u1.getPosts().getFirst().getTexto());
	}

}
