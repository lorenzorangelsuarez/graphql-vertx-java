package com.mx.lorenzo.training.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.mx.lorenzo.training.models.Concepto;
import com.mx.lorenzo.training.repositories.ConceptoRepository;

public class Query implements GraphQLRootResolver {
	
	private final ConceptoRepository conceptoRepository;
	
	public Query (ConceptoRepository conceptoRepository) {
		this.conceptoRepository = conceptoRepository;
	}
	
	public List<Concepto> getAllConceptos (){
		return conceptoRepository.getAllConceptos();
	}
}
