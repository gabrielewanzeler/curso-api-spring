package com.algaworks.testepag.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.testepag.domain.model.Parcelamento;

@Repository
public interface ParcelamentoRepository extends JpaRepository<Parcelamento, Long> {

}