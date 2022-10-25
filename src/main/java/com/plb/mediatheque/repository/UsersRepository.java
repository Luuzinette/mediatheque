package com.plb.mediatheque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plb.mediatheque.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
	@Query("from Users u where u.id = :id")
	public List<Users> findOneUser(Long id);

}
