package com.app.integracion.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Transactional;

import com.app.integracion.model.TablaModulos;


public interface ModuloMapper {

	public int modificarRegistroDeLaTablaModulos(@Param("modulo")TablaModulos registro);	
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();

	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(@Param("idModulo")Integer idModulo) ;

}
