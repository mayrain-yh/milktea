package milktea;
import java.util.Calendar

public class Ingredient{
	protected String name;//配料名
	protected int guarantee;//保质期
	protected Calendar builddate;//生产日期
	public Ingredient(String name,int guarantee,Calendar builddate){
		this.name = name;
		this.guarantee = guarantee;
		this.builddate=builddate;
	}
	@Override
	public String toString(){
		return "Ingredient:"+name+"\n生产日期："+builddate.get(Calendar.YEAR)+"-"+builddate.get((Calendar.MONTH)+1)+"-""builddate.get(Calendar.DAY_OF_MONTH)+"\n保质期："+guarentee;

	}
	
}
