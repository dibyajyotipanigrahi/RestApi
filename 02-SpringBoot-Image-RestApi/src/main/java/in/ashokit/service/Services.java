package in.ashokit.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.Entity.ImageEntity;
import in.ashokit.Repository.ImageRepository;

@Service
public class Services {

	@Autowired
	private ImageRepository imagerepo;

	public void saveImage(MultipartFile file) throws IOException {
		ImageEntity imageEntity = new ImageEntity();
		imageEntity.setImagedata(file.getBytes());
		imagerepo.save(imageEntity);
	}

	public ImageEntity getImage(Integer id) {
		Optional<ImageEntity> byId = imagerepo.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		}
		return null;

	}
}
