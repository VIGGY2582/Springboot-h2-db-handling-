package com.example.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FunRepository extends JpaRepository<Fun,Long> {
}