package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.Seller;


@Repository
public interface SellerRepo extends JpaRepository<Seller, Long>{

}
