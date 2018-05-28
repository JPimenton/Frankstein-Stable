package com.app.presentacion;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.integracion.model.TablaModulos;
import com.app.negocio.modulo.ServicioModulos;

@ManagedBean
@SessionScoped
public class TablaModulosVista implements Serializable {
	

	public ServicioModulos servicio;
	
	private List<TablaModulos> list;

		 
	@PostConstruct
	public void init(){
		ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		servicio = (ServicioModulos)context.getBean("servicioModulos");
		list = servicio.consultarTodosLosRegistrosDeLaTablaModulos();

	}


	public List<TablaModulos> getModulos() {
		return list;
	}




}