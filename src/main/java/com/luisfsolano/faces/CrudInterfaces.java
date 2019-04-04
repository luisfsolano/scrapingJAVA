/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisfsolano.faces;

import java.util.List;

/**
 *
 * @author lsolano
 */
public interface CrudInterfaces<T> {
	T insert(T obj);
        T findById(Integer id);
	void delete(T obj);
	T update(T obj);
	List<T> listAll();
}