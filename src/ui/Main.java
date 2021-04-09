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
			boolean run = true;
			while(run){
			System.out.println("¿Que desea hacer?"+"\n 1. Registrar persona"+"\n 2. Crear equipo"+"\n 3. Salir");
			int eleccion = numScan.nextInt();
				switch(eleccion){
					case 1:
						creatPeople();
					break;
					case 2:
					break;
					case 3 :
						run=false;
					break;
				}
			}
	}
				public void creatPeople() {
				    System.out.println("Bienvenido a la Tienda Don Pedro");
				    System.out.print("Tipo de documento\n");
				    String typeId = "";
				    boolean run = true;
					while(run){
					System.out.println("\n 1. Tarjeta de propiedad "+"\n 2. Cedula"+"\n 3. Pasaporte"+"\n 4. Cedula Extranjera");
					int eleccion = numScan.nextInt();
						switch(eleccion){
							case 1:
								typeId = "TI";
							break;
							case 2:
								typeId = "CC";
							break;
							case 3 :
								typeId = "PP";
							break;
							case 4 :
								typeId = "CE";
							break;
						}
					}
				    
				    System.out.print("Digite el numero de documento \n ");
				    String id = sc.nextLine();
				try {
					miniMarket.creatPerson(typeId,id);
				} catch (DayIncorrect e) {
				      System.err.println(e.getMessage());
				      e.printStackTrace();
				} catch (IdException e) {
					System.out.println("El tipo de documento ("+e.getId()+") no se acepta por norma");
				      System.err.println(e.getMessage());
				      e.printStackTrace();
				}
	
				}
}
