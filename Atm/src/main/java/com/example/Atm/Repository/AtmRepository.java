package com.example.Atm.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Atm.Entity.AtmDetailsEntity;

@Repository
public interface AtmRepository extends JpaRepository<AtmDetailsEntity, Integer> {

	@Query(nativeQuery = true, value="SELECT * FROM atmmachine order by username asc")
	Optional<AtmDetailsEntity> findUserName();


}
