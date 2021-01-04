package com.multiplica.colors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.multiplica.colors.entidad.Colors;
import com.multiplica.colors.response.RespBase;
import com.multiplica.colors.response.RespObtieneLista;
import com.multiplica.colors.service.ColorService;

@RestController
@RequestMapping("/colors")
public class ColorsController {
	
	@Autowired
	private ColorService colorService;
	
	@GetMapping("/getAllColorsAvaible")
	public RespBase<RespObtieneLista<Colors>> getAllColorsAvaible(
			@RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "3") int size) {
		return colorService.obtenerTodosLosColores(page, size);
	}

}
