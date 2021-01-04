package com.multiplica.colors.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.multiplica.colors.dao.ColorsDao;
import com.multiplica.colors.entidad.Colors;
import com.multiplica.colors.response.RespBase;
import com.multiplica.colors.response.RespObtieneLista;
import com.multiplica.colors.service.ColorService;

@Service
public class ColorServiceImpl implements ColorService{
	
	@Autowired
	private ColorsDao colorsDao;

	@Override
	public void registrarNuevoColor(Colors colors) {
		colorsDao.save(colors);
	}

	@Override
	public RespBase<RespObtieneLista<Colors>> obtenerTodosLosColores(int page, int size) {
		RespBase<RespObtieneLista<Colors>> response =  new RespBase<>();
		try {
			List<Colors> items = new ArrayList<>();
			Pageable paging = PageRequest.of(page, size);
			Page<Colors> pageColors = colorsDao.findAll(paging);
			items = pageColors.getContent();
			
			RespObtieneLista<Colors> respPayload = new RespObtieneLista<>();
			respPayload.setCount(items.size());
			respPayload.setItems(items);
			respPayload.setPaginaActual(pageColors.getNumber());
			respPayload.setTotalpaginas(pageColors.getTotalPages());
			respPayload.setTotalElementos(pageColors.getTotalElements());
			
			response.setPayload(respPayload);
			response.getStatus().setSuccess(Boolean.TRUE);
		} catch (Exception e) {
			response.getStatus().setSuccess(false);
			response.getStatus().getError().setHttpCode("500");
		}
		
		return response;
	}

}
