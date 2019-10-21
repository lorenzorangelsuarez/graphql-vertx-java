package com.mx.lorenzo.training.models;

public class Concepto {
	
	private final int idConcepto;
	private final String concepto;
	private final Materia materia;
	
	public Concepto(int idConcepto, String concepto, Materia materia) {
		super();
		this.idConcepto = idConcepto;
		this.concepto = concepto;
		this.materia = materia;
	}

	public int getIdConcepto() {
		return idConcepto;
	}

	public String getConcepto() {
		return concepto;
	}

	public Materia getMateria() {
		return materia;
	}
	
	

}
