package com.github.etm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.etm.model.Peixe;

@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Long>{

}
