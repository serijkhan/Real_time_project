package in.sameeerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameeerit.entity.EnqStatusEntity;

public interface EnqStatusRepo extends JpaRepository<EnqStatusEntity, Integer> {

}
