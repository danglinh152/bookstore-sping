package com.danglinh.project_bookstore.repository;

import com.danglinh.project_bookstore.domain.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "deliveries")
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

}
