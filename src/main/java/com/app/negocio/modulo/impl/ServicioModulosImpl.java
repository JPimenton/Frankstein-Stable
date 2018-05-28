package com.app.negocio.modulo.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.integracion.mapper.ModuloMapper;
import com.app.integracion.model.TablaModulos;
import com.app.negocio.modulo.ServicioModulos;



@Service("servicioModulos")
public class ServicioModulosImpl implements ServicioModulos {
	
	@Autowired
	private ModuloMapper mapper;
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
		return mapper.consultarTodosLosRegistrosDeLaTablaModulos();
	}

	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}
	
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		this.mapper.modificarRegistroDeLaTablaModulos(registro);;		
	}



	

}
