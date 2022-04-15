package com.example.europcar.Repository;

import com.example.europcar.Entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository<Area, Integer> {
}