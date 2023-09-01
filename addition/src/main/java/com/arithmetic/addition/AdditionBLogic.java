package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdditionBLogic {

	public Integer execute(Integer a, Integer b) {
		
		System.out.println("we added "+ a  +" and "+ b);
		return a+b;
		
	}
	public Integer execute (Integer a, Integer b, Integer c) {
		System.out.println("we added "+ a  +" , "+ b + " and " + c);
		return a+b+c;
	}
}
