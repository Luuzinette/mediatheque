package com.plb.mediatheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plb.mediatheque.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
