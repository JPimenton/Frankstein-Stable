package com.app.negocio.modulo;

import java.util.List;

import com.app.integracion.model.TablaModulos;


public interface  ServicioModulos {

	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);

}
