package com.example.europcar.ControllerREST;

import com.example.europcar.Entity.Investimento;
import com.example.europcar.Service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investimento")
public class RestInvestimentoController {

    @Autowired
    InvestimentoService investimentoService;

    @GetMapping(value = "/{id}")
    public Investimento getById(@PathVariable("id") Integer id) {
        return investimentoService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Investimento> getAll() {
        return investimentoService.findAll();
    }

    @PostMapping(value = "/newInvestimento")
    public void newInvestimento(@RequestBody Investimento investimento) {
        investimentoService.save(investimento);
    }

    @DeleteMapping(value = "/deleteInvestimento/{id}")
    public void deleteInvestimentoPerId(@PathVariable("id") Integer id) {
        investimentoService.delete(id);
    }

}