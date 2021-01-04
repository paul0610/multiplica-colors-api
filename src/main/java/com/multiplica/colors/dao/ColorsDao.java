package com.multiplica.colors.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.multiplica.colors.entidad.Colors;

public interface ColorsDao extends PagingAndSortingRepository<Colors,Integer> {

}
