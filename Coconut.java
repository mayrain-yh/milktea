package milktea;
import java.util.Calendar;
//五天过期 Coconut
public class Coconut extends Ingredient{
	public Coconut (String name,Calendar builddate){
		super (name,builddate,5);
	}

	public Coconut (String name,Calendar builddate,int guarentee){
		super (name,builddate,guarentee);
	}
	
	@Override 
	public String toString(){
		return "Ingredient:Coconut"+super.toString();
	}
}
