package com.arithmetic.multiplication;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arithmetic.addition.Addition;

@Path("/multiplication")
public class MultiplicationResource {
	
	@Inject
	private MultiplicationBLogic blogic;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Multiplication ProcessMultiplication(Multiplication request) {
		Multiplication response = new Multiplication();
		response.setNum1(request.getNum1());
		response.setNum2(request.getNum2());
		//System.out.println("the number is ");
		
			response.setResult(blogic.execute(request.getNum1(), request.getNum2()));

		return response;
	}

}
