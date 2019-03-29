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
	void insert(T obj);
	void delete(T obj);
	void update(T obj);
	List<T> listAll();
}