package io.github.aerphanas.hellowolrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

  // mapping rute index.html untuk menampilkan hello world
	@GetMapping("/")
	public String index(){
		return "Hello world";
	}

  //mapping rute /hello untuk menampilkan hello 'name', bila
  // tidak ada name berarti menggunakan default = "wolrd"
	@GetMapping("/hello")
	public String hello(@RequestParam( value = "name", defaultValue = "world" ) String name){
		return String.format("Hello %s", name);
	}

}
