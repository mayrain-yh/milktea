package milktea;

import java.util.Calendar;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        shop teashop = new teashop();//new teashop
        Random r = new Random();

        Calendar c1 = Calendar.getInstance();//��ȡʱ��
        c1.setTime(new Date(System.currentTimeMillis()-r.nextInt(15*24*3600*1000)));
	TeaShop.addown(new Bubble("��ݲ���",c1));
        System.out.println(c1.get(Calendar.YEAR)+"-"+(c1.get(Calendar.MONTH)+1)+"-"+c1.get(Calendar.DAY_OF_MONTH));
        

        Calendar c2 = Calendar.getInstance();//��ȡʱ��
        c2.setTime(new Date(System.currentTimeMillis()-r.nextInt(7*24*3600*1000)));
	TeaShop.addown(new Coconut("â��ҬҬ",c2));
        System.out.println(c2.get(Calendar.YEAR)+"-"+(c2.get(Calendar.MONTH)+1)+"-"+c2.get(Calendar.DAY_OF_MONTH));
 
        try {
            milktea tea = TeaShop.sellmilktea("�����̲�","Bubble");
            System.out.println(tea.toString());

            tea = TeaShop.sellMilkTea("Ҭ���̲�",Coconut");
            System.out.println(tea.toString());

        } catch (SellOutException sell) {//�׳��쳣��
            sell.SellOut();
        }
        try {
            milktea tea = TeaShop.sellmilktea("Coco�̲�","Coconut");
            System.out.println(tea.toString());

            tea = TeaShop.sellmilktea("Bubb�̲�","Bubble");
            System.out.println(tea.toString());

        } catch (SellOutException sell) {
                sell.SellOut();
        }
    }
}
