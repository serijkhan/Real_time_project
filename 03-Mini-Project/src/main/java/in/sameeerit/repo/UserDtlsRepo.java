package in.sameeerit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sameeerit.entity.UserDtlsEntity;

public interface UserDtlsRepo  extends JpaRepository<UserDtlsEntity, Integer>{

}
