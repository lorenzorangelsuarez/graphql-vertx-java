package com.mx.lorenzo.training.repositories;

import java.util.ArrayList;
import java.util.List;

import com.mx.lorenzo.training.models.Concepto;
import com.mx.lorenzo.training.models.Materia;

public class ConceptoRepository {
	
	private final List <Concepto> listaConceptos;

	public ConceptoRepository(List<Concepto> listaConceptos) {
		super();
		this.listaConceptos = new ArrayList<>();
	}
	
	public List<Concepto> getAllConceptos (){
		listaConceptos.add(new Concepto(1, "Concepto 1", new Materia(1,"Materia 1")));
		listaConceptos.add(new Concepto(2, "Concepto 2", new Materia(2,"Materia 2")));
		return this.listaConceptos;
	}
	
	public void addConcepto(Concepto concepto){
		this.listaConceptos.add(concepto);
	}
	
	
}
