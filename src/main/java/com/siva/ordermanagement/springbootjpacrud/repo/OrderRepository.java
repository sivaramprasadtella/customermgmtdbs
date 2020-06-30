package com.siva.ordermanagement.springbootjpacrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siva.ordermanagement.springbootjpacrud.model.OrderInfo;

@Repository
public interface OrderRepository extends JpaRepository<OrderInfo, Long>{

}
