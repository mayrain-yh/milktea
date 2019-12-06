package milktea;
import java.util.Calendar;

public class MilkTea{
	private String name;
	private Ingredient own;
	public MilkTea(String name,String own){
		this.name=name;
		this.own=own;

	}

	@Override
	public String toString(){
		return "milktea:"+name+"\nIngedient:"+own;
	}
}