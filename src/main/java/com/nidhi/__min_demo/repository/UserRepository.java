package com.nidhi.__min_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidhi.__min_demo.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{



}
