/**
 * Materia de cada uno de los conceptos
 */
package com.mx.lorenzo.training.models;

/**
 * @author lorenzorangelsuarez
 *
 */
public class Materia {
	
	private final int idMateria;
	private final String materia;
	
	public Materia(int idMateria, String materia) {
		super();
		this.idMateria = idMateria;
		this.materia = materia;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public String getMateria() {
		return materia;
	}
	
	
	
}
