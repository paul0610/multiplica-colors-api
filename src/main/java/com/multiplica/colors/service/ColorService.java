package com.multiplica.colors.service;

import com.multiplica.colors.entidad.Colors;
import com.multiplica.colors.response.RespBase;
import com.multiplica.colors.response.RespObtieneLista;

public interface ColorService {
		
	RespBase<RespObtieneLista<Colors>>obtenerTodosLosColores(int page,int size);
	void registrarNuevoColor(Colors colors);
	
}
