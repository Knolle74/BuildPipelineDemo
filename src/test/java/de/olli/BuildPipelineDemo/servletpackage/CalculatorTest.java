package de.olli.BuildPipelineDemo.servletpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculate() {
		assertEquals(4, Calculator.calculate(2,2));;
	}

}
