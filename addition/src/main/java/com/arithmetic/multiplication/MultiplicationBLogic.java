package com.arithmetic.multiplication;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MultiplicationBLogic {

public Integer execute(Integer a, Integer b) {
		
		System.out.println("we multiply "+ a  +" and "+ b);
		return a*b;
		
	}
}
