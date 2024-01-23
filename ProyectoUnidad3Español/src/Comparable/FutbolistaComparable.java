package Comparable;

import java.util.Comparator;

public class FutbolistaComparable implements Comparator<Futbolista>{
	
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		// TODO Auto-generated method stub
		 return (o1.getCalidad() > o2.getCalidad())  ? 1 : ((o1.getCalidad() == o2.getCalidad()) ? 0: -1 );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FutbolistaComparable futComp = new FutbolistaComparable();
		Futbolista f1 = new Futbolista("Peri", "Delantero", 8);
		Futbolista f2 = new Futbolista("Jari", "Defensa", 6);
		
		futComp.compare(f1, f2);

		
		

	}



}
