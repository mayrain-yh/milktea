package milktea;

import java.util.Calendar;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        shop teashop = new teashop();//new teashop
        Random r = new Random();

        Calendar c1 = Calendar.getInstance();//获取时间
        c1.setTime(new Date(System.currentTimeMillis()-r.nextInt(15*24*3600*1000)));
	TeaShop.addown(new Bubble("香草波波",c1));
        System.out.println(c1.get(Calendar.YEAR)+"-"+(c1.get(Calendar.MONTH)+1)+"-"+c1.get(Calendar.DAY_OF_MONTH));
        

        Calendar c2 = Calendar.getInstance();//获取时间
        c2.setTime(new Date(System.currentTimeMillis()-r.nextInt(7*24*3600*1000)));
	TeaShop.addown(new Coconut("芒果椰椰",c2));
        System.out.println(c2.get(Calendar.YEAR)+"-"+(c2.get(Calendar.MONTH)+1)+"-"+c2.get(Calendar.DAY_OF_MONTH));
 
        try {
            milktea tea = TeaShop.sellmilktea("珍珠奶茶","Bubble");
            System.out.println(tea.toString());

            tea = TeaShop.sellMilkTea("椰果奶茶",Coconut");
            System.out.println(tea.toString());

        } catch (SellOutException sell) {//抛出异常类
            sell.SellOut();
        }
        try {
            milktea tea = TeaShop.sellmilktea("Coco奶茶","Coconut");
            System.out.println(tea.toString());

            tea = TeaShop.sellmilktea("Bubb奶茶","Bubble");
            System.out.println(tea.toString());

        } catch (SellOutException sell) {
                sell.SellOut();
        }
    }
}
