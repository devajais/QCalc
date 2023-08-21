package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Simple Calculator\n");
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 2);
		calc.printResult();

		ScientificCalculator calc1 = new ScientificCalculator();
		calc1.tan(10);
		calc1.printResult();
		
		LogicCalculator calc2 = new LogicCalculator();
		calc2.OR(8, 6);
		calc2.printResult();

		System.out.println("Result: "+calc.getResult());

	}


}
