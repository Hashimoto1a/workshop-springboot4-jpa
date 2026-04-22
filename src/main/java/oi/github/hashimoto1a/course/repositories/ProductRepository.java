package oi.github.hashimoto1a.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.github.hashimoto1a.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
