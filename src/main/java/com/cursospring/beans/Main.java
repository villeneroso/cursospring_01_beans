package com.cursospring.beans;

import org.springframework.context.ApplicationContext;

public class Main 
{

	public static void main( String[] args ){
      ApplicationContext factory = ContextFactory.getInstance();

      // Mostramos un ejemplo de la instancia de un bean de tipo alumno
      System.out.println("Alumno 1: "+ factory.getBean("alumno"));
      
      // Declaramos un bean de tipo alumno
      Alumno alumno1 = (Alumno) factory.getBean("alumno");
      
      // Mostramos el saludo de alumno 1
      System.out.println("Saluda alumno 1: " + alumno1.getSaludo().saluda());
      
      // TODO (Descomentar) Mostramos un ejemplo de la instancia de un bean de tipo alumno
      // System.out.println("Alumno 2: "+ factory.getBean("alumno"));
      
      // TODO (Descomentar) Declarar nuevo bean de tipo alumno 
      // Alumno alumno2 = (Alumno) factory.getBean("alumno");
      
      // TODO (Descomentar) Mostrar saludo Alumno 2 por consola 
      // System.out.println("Saluda alumno 2: " + alumno2.getSaludo().saluda());
      
      // TODO Declarar nuevo profesor bean y mostrar su instancia por consola
      
    }
}
