package com.example.europcar.ControllerREST;

import com.example.europcar.Entity.Area;
import com.example.europcar.Service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/area")
    public class RestAreaController {

        @Autowired
        AreaService AreaService;

        @GetMapping(value = "/{id}")
        public Area getById(@PathVariable("id") Integer id) {
            return AreaService.findById(id);
        }

        @GetMapping(value = "/lista")
        public List<Area> getAll() {
            return AreaService.findAll();
        }

        @PostMapping(value = "/newArea")
        public void newArea(@RequestBody Area area) {
            AreaService.save(area);
        }

        @DeleteMapping(value = "/deleteArea/{id}")
        public void deleteAreaPerId(@PathVariable("id") Integer id) {
            AreaService.delete(id);
        }

    }

