package com.plb.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plb.mediatheque.entity.Cd;


public interface CdRepository extends JpaRepository<Cd, Long> {

}
