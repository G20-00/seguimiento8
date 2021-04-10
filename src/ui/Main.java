package ui;

import java.util.Scanner;

import exceptions.DayIncorrect;
import exceptions.IdException;
import model.MiniMarket;

public class Main {
	private Scanner sc  = new Scanner(System.in);
	private MiniMarket miniMarket;
	private	Scanner numScan = new Scanner(System.in);
	public Main() {
		miniMarket = new MiniMarket();
		numScan = new Scanner(System.in);
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		 Main m =  new  Main ();
		 m . menu();
		}
		public void menu(){
			System.out.println("Bienvenido al Mini Market");
			boolean run = true;
			while(run){
			System.out.println("¿Que desea hacer?"+"\n 1. Registrar persona"+"\n 2. Cantidad de persona que intentaron ingresar"+"\n 3. Salir");
			int eleccion = numScan.nextInt();
				switch(eleccion){
					case 1:
						creatPeople();
					break;
					case 2:
						System.out.println("El numero de intentos son : "+miniMarket.getCountain());
						break;
					case 3 :
						run=false;
						System.out.println("BYE");
					break;
				}
			}
	}
				public void creatPeople() {
				    
				    System.out.print("Tipo de documento\n");
				    String typeId = "";
				    boolean run = true;
					while(run){
					System.out.println("\n 1. Tarjeta de identidad "+"\n 2. Cedula"+"\n 3. Pasaporte"+"\n 4. Cedula Extranjera");
					int eleccion = numScan.nextInt();
						switch(eleccion){
							case 1:
								typeId = "TI";
								run = false;
							break;
							case 2:
								typeId = "CC";
								run = false;
							break;
							case 3 :
								typeId = "PP";
								run = false;
							break;
							case 4 :
								typeId = "CE";
								run = false;
							break;
						}
					}
				    
				    System.out.print("Digite el numero de documento \n ");
				    String id = sc.nextLine();
				try {
					miniMarket.creatPerson(typeId,id);
				} catch (DayIncorrect e) {
				      System.err.println("Hoy no puedes entrar, dia incorrecto");
				    
				} catch (IdException e) {
					
				      System.err.println("Tipo de documento no aceptado");
				     
				}
	
				}
}
