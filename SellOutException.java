package milktea;
import milktea.baseexcption;

public class SellOutException extends BaseExcption{
	@Override;
	public void SellOut(){
	System.out.println("非常抱歉，你所需要的配料已售光！")
	}
}