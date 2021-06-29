package com.escalab.recipebook.service;

import com.escalab.recipebook.model.Menu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MenuService{
    Optional<Menu> findById(Long id);
    List<Menu> findAll();
}
