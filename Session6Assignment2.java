
public class Session6Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar eg=new ElectricGuitar();
		ElectricBassGuitar ebg=new ElectricBassGuitar();
		StringedInstrument si=new StringedInstrument();
		
		eg.play();
		ebg.play();
		si.play();
		
	}

}

abstract class Instrument
{
	String name="Guitar";
	public void play()
	{
		System.out.println("Abstract Instrument Class:: Name of Instrument is :-> "+name );
	}
	}

class StringedInstrument extends Instrument
{
	int numberofstring=3;
	public void play()
	{
		System.out.println("StringedInstrument Class:: Name of Instrument is :-> "+name+" and has "+ numberofstring+" Strings" );
	}
	
	}

class ElectricGuitar extends StringedInstrument
{
	StringedInstrument si=new StringedInstrument(); 
			
	public void play()
	{
		System.out.println("Electric Guitar Class:: Name of Instrument is :-> "+si.name+" and has "+ si.numberofstring+" Strings" );
	}
	}

class ElectricBassGuitar extends StringedInstrument
{
	StringedInstrument si=new StringedInstrument(); 
			
	public void play()
	{
		System.out.println("Electric Base Guitar Class:: Name of Instrument is :-> "+si.name+" and has "+ si.numberofstring+" Strings" );
	}
	}