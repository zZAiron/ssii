package com.example.footballmadrid.repositories;

import com.example.footballmadrid.models.PitchModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PitchRepository extends JpaRepository<PitchModel, Long> {
}
