package com.cursospring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextFactory {
	
private static ApplicationContext respuesta;
    
	public static ApplicationContext getInstance() {
        if (respuesta != null) {
            return respuesta;
        }
        respuesta = new FileSystemXmlApplicationContext("classpath*:SpringBeansConfig.xml");
        return respuesta;
	}	

}
