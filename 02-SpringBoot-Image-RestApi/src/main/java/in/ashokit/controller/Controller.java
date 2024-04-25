package in.ashokit.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.Entity.ImageEntity;
import in.ashokit.service.Services;

@RestController
public class Controller {

	@Autowired
	private Services service;

	@PostMapping("/upload")
	public void uploadImage(@RequestParam("file") MultipartFile file) throws IOException {
		service.saveImage(file);
	}

	@GetMapping("/{id}")
	public ImageEntity getImage(@PathVariable Integer id) {
		return service.getImage(id);

	}

}
