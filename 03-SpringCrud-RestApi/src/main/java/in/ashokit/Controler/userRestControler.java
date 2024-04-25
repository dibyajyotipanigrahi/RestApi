package in.ashokit.Controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Entity.UserEntity;
import in.ashokit.Entity.UserRepo;

@RestController
public class userRestControler {
	@Autowired
	private UserRepo userRepo;

	@PostMapping("/save")
	public ResponseEntity<String> userSave(@RequestBody UserEntity userEntity) {
		userRepo.save(userEntity);
		return new ResponseEntity<>("Record save successy fully", HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<String> delete(@PathVariable("Id") Integer Id) {

		userRepo.deleteById(Id);
		return new ResponseEntity<>("Record successfully deleted", HttpStatus.OK);

	}

	@PutMapping("/upsert")
	public ResponseEntity<String> upsert(@RequestBody UserEntity userEntity) {
		userRepo.save(userEntity);
		return new ResponseEntity<>("Updated", HttpStatus.OK);

	}

	@GetMapping("/find/{Id}")
	public ResponseEntity<UserEntity> find(@PathVariable("Id") Integer Id) {
		Optional<UserEntity> byId = userRepo.findById(Id);

		if (byId.isPresent()) {
			UserEntity userEntity = byId.get();
			return new ResponseEntity<>(userEntity, HttpStatus.OK);
		}
		return null;
	}

}
