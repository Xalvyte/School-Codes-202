package PastCodes;
import java.util.*;

public class Pay_devera2 {
    double workHr, grossPay, otPay, regPay, skillRt, netPay, double withhold;
    int skillLvl;

    public static double grossPayComp(double workHr, double grossPay, double skillLvl){
        grossPay = skillLvl * workHr;
        System.out.println(grossPay);
        return grossPay;
    }

    public static double otPayComp(double workHr, double skillLvl, double otPay){
        otPay = workHr * (skillLvl * 1.5);
        System.out.println(otPay);
        return otPay;
    }

    public static double deductionComp(double withhold, double netPay, double workHr, double skillLvl, double otPay){
        double totalGrosspay = otPay * 12;
        if (totalGrosspay >= 250000 || totalGrosspay <= 400000){
            withhold = (totalGrosspay - 250000) * .2;
        }
        else if (totalGrosspay > 400000 || totalGrosspay <= 800000){
            withhold = ((totalGrosspay - 400000) * .25) + 30000;
        }
        else if (totalGrosspay > 800000 || totalGrosspay <= 2000000){
            withhold = ((totalGrosspay - 800000) * .3) + 130000;
        }
        else if (totalGrosspay > 2000000 || totalGrosspay <= 8000000){
            withhold = ((totalGrosspay - 2000000) * .32) + 490000;
        }
        else if (totalGrosspay > 8000000){
            withhold = ((totalGrosspay - 8000000) * .32) + 2410000;
        }
        netPay = totalGrosspay - withhold;
        System.out.println(netPay);
        return netPay;
    }

    public static void display(){
        System.out.print
        deductionComp(0, 0, 0, 0);
        otPayComp(0, 0, 0);
        grossPayComp(0, 0, 0);
    }
}

