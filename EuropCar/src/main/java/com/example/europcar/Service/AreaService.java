package com.example.europcar.Service;


import com.example.europcar.Entity.Area;

import java.util.List;

public interface AreaService {
    Area findById(Integer id);

    List<Area> findAll();

    Area delete(Integer id);

    Area save(Area area);
}
