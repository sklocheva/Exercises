package main.behavioral.interpreter.romannumbers;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestInterpreterRomanNumbers {
	
	List<Expression> list;
	Context context;
	
	@SuppressWarnings("serial")
	@Before
	public void before() {
		list = new ArrayList<Expression>(){{
			add(new ThousandExpression());
			add(new HundredExpression());
			add(new TenExpression());
			add(new OneExpression());
		}};
	}

	@Test
	public void testNumerials() {
		context = new Context("MCMXXVIII");
		for(Expression x : list){
			x.interpret(context);
		}
		System.out.println(context.getOutput());
	}
}
