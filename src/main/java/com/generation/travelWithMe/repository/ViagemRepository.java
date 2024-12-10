package com.generation.travelWithMe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.travelWithMe.model.ViagemModel;

@Repository
public interface ViagemRepository extends JpaRepository<ViagemModel, Long> {

	public List<ViagemModel> findAllByDestinoContainingIgnoreCase(@Param("destino") String destino);

}
  