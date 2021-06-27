package com.escalab.recipebook.service;

import com.escalab.recipebook.model.Menu;
import com.escalab.recipebook.repositories.MenuRepository;

import java.util.Optional;

public interface MenuService extends MenuRepository {
    Optional<Menu> findById(Long id);
}
