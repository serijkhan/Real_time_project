package in.sameeerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameeerit.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer>{
	
	

}
