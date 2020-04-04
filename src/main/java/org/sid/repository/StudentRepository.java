package org.sid.repository;

import org.sid.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource // Toutes les méthodes de cette interface on les exposes dans une API REST
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@RestResource(path="byLastName")
	public Page<Student> findByLastNameContains(@Param("nc") String nc, Pageable pageable);

}
