package com.wellsfargo.counselor.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.counselor.entity.Advisor;

@Repository
public interface AdvisorRepository extends CrudRepository<Advisor, Long> {

  List<Advisor> findByLastName(String lastName);

  Advisor findById(long id);
}