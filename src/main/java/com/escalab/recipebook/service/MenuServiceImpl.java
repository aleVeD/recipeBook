package com.escalab.recipebook.service;

import com.escalab.recipebook.exception.NotFoundMenuException;
import com.escalab.recipebook.model.Menu;
import com.escalab.recipebook.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl  implements MenuService{

    @Autowired
    private MenuRepository menuRepository;


    @Override
    public Optional<Menu> findById(Long id) {
        Optional<Menu> menu = menuRepository.findById(id);
        if(menu.isPresent()) {
            return menu;
        }else{
            throw new NotFoundMenuException("Menu no encontrado");
        }
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Menu> findAll() {
        List<Menu> menus = menuRepository.findAll();
        return menus;
    }

    @Override
    public List<Menu> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Menu> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Menu> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Menu menu) {

    }

    @Override
    public void deleteAll(Iterable<? extends Menu> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Menu> S save(S s) {
        return null;
    }

    @Override
    public <S extends Menu> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Menu> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Menu> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Menu getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Menu> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Menu> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Menu> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Menu> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Menu> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Menu> boolean exists(Example<S> example) {
        return false;
    }
}
