package in.ashokit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {

	
}
