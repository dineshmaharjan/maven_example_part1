/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.mavenprogram.dao;

import java.util.List;

/**
 *
 * @author Alucard
 */
public interface GenericDAO<T> {

    int insert(T t) throws Exception;

    int update(T t) throws Exception;

    int delete(int id) throws Exception;

    T getById(int id) throws Exception;

    List<T> getAll() throws Exception;

}
