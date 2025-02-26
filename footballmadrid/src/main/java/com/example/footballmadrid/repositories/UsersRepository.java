package com.example.footballmadrid.repositories;

import com.example.footballmadrid.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Long> {
}
