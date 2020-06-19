package com.kita.Object;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car1 = new Car("소나타","흰색",2500); // 생성자 만든것 
		
		car.introduceMyCar();
		System.out.println("---");
		car1.introduceMyCar();
		
		
		
		

	}

}
