package com.siva.ordermanagement.springbootjpacrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siva.ordermanagement.springbootjpacrud.model.ItemInfo;

@Repository
public interface ItemInfoRepository extends JpaRepository<ItemInfo, Long>{

}
