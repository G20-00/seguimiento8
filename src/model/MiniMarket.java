package model;
import exceptions.DayIncorrect;
import exceptions.IdException;
import java.util.ArrayList;
import java.util.Calendar;

public class MiniMarket {
	private ArrayList<Person>person;
	private int countain;
	public MiniMarket() {
		person = new ArrayList<>();
		
	}
	public void creatPerson(String typeId,String id) throws DayIncorrect,IdException{
		boolean dayPar = false;
		boolean typePar = false;
		if(typeId== "TI") {
			throw new IdException(typeId);
		}/*else {
		Calendar c1 = Calendar.getInstance();
			int dia = c1.get(Calendar.DATE);
				if(dia%2==0) {
				dayPar = true;
				}
				char num = id.charAt(id.length()-2);
				if(num%2 == 0) {	
					typePar = true;
				}
				if(dayPar == true && typePar == true) {
					
				}else { if(dayPar == false && typePar == false) {
					
					}else {
					throw new DayIncorrect();
					}
				}
		}*/
	}
	public ArrayList<Person> getPerson() {
		return person;
	}
	public int getCountain() {
		return countain;
	}
}
