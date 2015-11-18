
public class GrenzwertReihe {
	
	public static void main(String[] Args)
	{
		//Definieren der Genauigkeitsgrenze
		double genauigkeit= 0.01;
		//Aufrufen der berechnung mit dem Grenzwert
		double ergebniss = berechneGrenzwert(genauigkeit);
		System.out.println("Die Summe beim erreichen der Genaugigkeitsgrenze ist: "+ergebniss);
	}

	public static double berechneGrenzwert(double genauigkeit) 
	{
		double vWert = 1;
		double aWert;	
	//Starten einer Endlosschleife.
	//i ist so gewählt das es für die Erste Division passend gesetzt ist 
	//Die schleife darf solange laufen bis die interne if Bedingung greift
	for (double i =2; ;i= i*2)
		{
			//Berechnung Wert der letzten Berechnung + 1/ Aktuellen i Wert. 
			aWert = vWert +(1/i);
			if (aWert-vWert < genauigkeit) // Vergleicht ob der unterschied zwischen der alten und der neuen Zahl kleiner ist als die gesetzte Grenze der Genauigkeit. 
				{	//Setzt das ergebniss der Berechnung auf v und und gibt v an den Aufruf retour 
					vWert=aWert;
					return vWert;
				}
			else //Setzen des neuen Wertes für v
				{
					vWert=aWert;
				}
		}
	}
}


