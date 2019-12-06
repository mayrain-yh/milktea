package milktea;

import java.util.Calendar
import java.util.ArrayList
import java.util.List
public class teashop implements shop{

	pubilc List<Bubble> bubbles;
	public Lise<Coconut> coconuts;
	public teashop(){
		bubbles= new ArrayList<>();
		coconuts = new ArrayList<>();
	}
	private void addown(Bubble bubble){
		bubbles.add(bubble);
	}
	private void addown (Coconut coconut){
		coconuts.add(coconut);
	}
	@Override
	public void addown(Ingredient ingredient){
		if (ingredient instanceof Bubble) addown((Bubble)ingredient);
		else if (ingredient instanceof Coconut) addown((Coconut)ingredient);

	}
	@Override 
	public milktea sellmilktea(String name,String own) throws SellOutException{
		if(own.equals("Bubble")){
            List<Bubble> overdueBubbles = new ArrayList<>();
            for(Bubble bubble:bubbles){
                if(bubble.isOverdue()){
                    overdueBubbles.add(bubble);
                }else {
		MilkTea milktea = new milktea(name,bubble);
                    bubbles.removeAll(overdueBubbles);
                    bubbles.remove(bubble);
                    return milktea;
		}
            }
            throw new  SellOutException();
        }else if(own.equals("Coconut")){
            List<Coconut> overdueCoconuts = new ArrayList<>();
            for(Coconut coconut:coconuts){
                if(coconut.isOverdue()){
                  overdueCoconuts.add(coconut);  
                }else{
		MilkTea milktea = new milktea(name,coconut);
                    coconuts.removeAll(overdueCoconuts);
                    coconuts.remove(coconut);
                    return milktea;
		} 
            }
            throw new  SellOutException();
        }else return null;
	}
}
