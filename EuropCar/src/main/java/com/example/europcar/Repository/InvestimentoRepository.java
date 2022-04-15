package com.example.europcar.Repository;


import com.example.europcar.Entity.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimento, Integer> {
}
