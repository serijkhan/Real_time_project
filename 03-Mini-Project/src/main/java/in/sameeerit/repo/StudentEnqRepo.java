package in.sameeerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameeerit.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer>{

}
