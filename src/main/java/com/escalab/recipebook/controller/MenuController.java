package com.escalab.recipebook.controller;

import com.escalab.recipebook.model.Menu;
import com.escalab.recipebook.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuService menuService;
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Menu>> getMenuById(@PathVariable("id") Long id){
        Optional<Menu> menu = menuService.findById(id);
        return new ResponseEntity<>(menu, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Menu>> getAllMenu(){
        List<Menu> menus = menuService.findAll();
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }

}
