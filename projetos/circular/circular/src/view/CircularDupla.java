package view;

import controller.CircularDuplaController;

public class CircularDupla{
	public static void main(String[] argas) {
		try{
			CircularDuplaController obj = new CircularDuplaController();
			System.out.println(obj.teste());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}