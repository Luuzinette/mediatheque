package com.plb.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plb.mediatheque.entity.Dvd;


public interface DvdRepository extends JpaRepository<Dvd, Long> {

}
