package PastCodes;
public class Pay2_constructor_DeVera{
    double workHr, rateHr, withholdRate, grossPay, netPay;
    
    public void setWork(double hour){
        workHr = hour;
    }

    public void setRate(double pay){
        rateHr = pay;
    }
    
    public void setWithhold(double withhold){
        withholdRate = withhold;
    }

    public double computeNetPay(double hours, double pay, double withhold){
        grossPay = hours * pay;
        netPay = grossPay - (grossPay*withhold);
        
        return netPay;
    }

    public double computeNetPay(double hours, double pay){
        grossPay = hours * pay;
        netPay = grossPay - (grossPay * .15);
        
        return netPay;
    }

    public double computeNetPay(double hours){
        grossPay = hours * 585;
        netPay = grossPay - (grossPay* .15);
        
        return netPay;
    }
}