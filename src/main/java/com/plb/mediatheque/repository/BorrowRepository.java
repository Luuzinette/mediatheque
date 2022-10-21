package com.plb.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plb.mediatheque.entity.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

}
