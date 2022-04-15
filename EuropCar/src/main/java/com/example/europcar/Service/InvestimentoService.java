package com.example.europcar.Service;


import com.example.europcar.Entity.Investimento;

import java.util.List;

public interface InvestimentoService {
    Investimento findById(Integer id);

    List<Investimento> findAll();

    Investimento delete(Integer id);

    Investimento save(Investimento investimento);
}
