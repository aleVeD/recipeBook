package com.escalab.recipebook.service.impl;

import com.escalab.recipebook.exception.NotFoundMenuException;
import com.escalab.recipebook.model.Menu;
import com.escalab.recipebook.repositories.MenuRepository;
import com.escalab.recipebook.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;


    @Override
    public Optional<Menu> findById(Long id) {
        Optional<Menu> menu = menuRepository.findById(id);
        if (menu.isPresent()) {
            return menu;
        } else {
            throw new NotFoundMenuException("Menu no encontrado");
        }
    }
    @Override
    public List<Menu> findAll() {
        List<Menu> menus = menuRepository.findAll();
        return menus;
    }

}


