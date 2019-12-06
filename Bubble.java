package milktea;
import java.util.Calendar;
//7Ìì¹ıÆÚ Bubble
public class Bubble extends Ingredient{

	public Bubble (String name,Calendar builddate){
		super (name,builddate,7);
	}

	public Bubble (String name,Calendar builddate,int guarentee){
		super (name,builddate,guarentee);
	}

	@Override 
	public String toString(){
		return "Ingredient:Bubble"+super.toString();
	}
}