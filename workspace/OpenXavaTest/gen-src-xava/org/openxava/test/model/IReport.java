

// File generated by OpenXava: Thu Dec 05 11:50:01 CET 2019
// Archivo generado por OpenXava: Thu Dec 05 11:50:01 CET 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Report		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IReport  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_name = "name"; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException;		

	// References/Referencias 

	// Ranges : Reference/Referencia
	
	org.openxava.test.model.IRanges getRanges() throws RemoteException;
	void setRanges(org.openxava.test.model.IRanges newRanges) throws RemoteException;

	// Methods 


}