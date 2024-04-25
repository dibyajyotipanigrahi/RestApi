package in.ashokit.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping(value = "/hello", produces = "Application/json")
	public ResponseEntity<Student> get() {
		Student s = new Student("Dibya", 1, "dibyajyoti.panigrahi.dipu@gmail.com");
		return new ResponseEntity<>(s, HttpStatus.OK);
	}

	@GetMapping(value = "/hellos", produces = "Application/json")
	public ResponseEntity<List<Student>> gets() {
		Student s = new Student("Dibya", 1, "dibyajyoti.panigrahi.dipu@gmail.com");

		Student s2 = new Student("Diby", 1, "dibyajyoti.panigrahi.dipu@gmail.com");
		Student s3 = new Student("Dibya", 1, "dibyajyoti.panigrahi.dipu@gmail.com");
		List<Student> asList = Arrays.asList(s, s2, s3);
		return new ResponseEntity<>(asList, HttpStatus.OK);
	}

	@GetMapping("/welcome")
	public String getWelcome() {
		String msg = "welcome to Ashokit";
		return msg;
	}

	@GetMapping("/greet")
	public String getDate() {
		LocalDate now = LocalDate.now();
		return String.valueOf(now);
	}

	@GetMapping("/greets/{name}")
	public String getGreetmsg(@PathVariable("name") String name) {
		String msg = name + " " + "good morning !!";
		return msg;
	}

	@GetMapping("/welcomes")
	public String getwelcome(@RequestParam("name") String name) {
		String msg = name + " " + "hello welcome";
		return msg;
	}
}
