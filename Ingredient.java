package milktea;
import java.util.Calendar

public class Ingredient{
	protected String name;//������
	protected int guarantee;//������
	protected Calendar builddate;//��������
	public Ingredient(String name,int guarantee,Calendar builddate){
		this.name = name;
		this.guarantee = guarantee;
		this.builddate=builddate;
	}
	@Override
	public String toString(){
		return "Ingredient:"+name+"\n�������ڣ�"+builddate.get(Calendar.YEAR)+"-"+builddate.get((Calendar.MONTH)+1)+"-""builddate.get(Calendar.DAY_OF_MONTH)+"\n�����ڣ�"+guarentee;

	}
	
}
