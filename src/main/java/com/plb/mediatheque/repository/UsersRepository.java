package com.plb.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plb.mediatheque.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
