package com.jetbrains.marco.photoz.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhotozCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotozCloneApplication.class, args);
		Photo photo = new Photo();
		photo.setId(" 32 watts aligners ");
		System.out.println("my company product id=" + photo.getId());
	}

	public static String setId1() {



		return null;
	}
}
