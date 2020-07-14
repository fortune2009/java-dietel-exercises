import java.security.SecureRandom;
import java.util.Arrays;

public class SalesPeoplePay{
    private final int WAGE = 200;
    private final SecureRandom randomNumber = new SecureRandom();
    private final int[] grossSale = new int[100];
    private final int[] frequency = new int[9];

    public int getWAGE() {
        return WAGE;
    }

    public int weeklyCommission(int gross){
        return (int) (WAGE + (gross * 0.09));
    }

    public void setGrossSale() {
        for(int i=0; i<grossSale.length; i++) {
            int grossPay = 100 + randomNumber.nextInt(10000);
            grossSale[i] = weeklyCommission(grossPay);
        }
        Arrays.sort(grossSale);
    }

    public int[] getGrossSale() {
        return grossSale;
    }

    public void range(){
        int[] array = getGrossSale();
        int total = 0;
        System.out.println("Sales Range\t\t\tSalespeople salary");
        for(int i=0; i<frequency.length; i++){
            int earningMin = (i+2)*100;
            int earningMax = earningMin + 99;
            if(i==8) {
                System.out.printf("$%d and over:   |", earningMin);
            }else {
                System.out.printf("$%d-%d:\t\t  |", earningMin, earningMax);
            }

            for(int val : array) {
                    if (earningMax==299 && val<=earningMax) {
                        System.out.printf(" %d ", val);
                        total += 1;
                    }
                    else if (earningMax==399 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMax==499 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMax==599 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMax==699 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMax==799 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMax==899 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMax==999 && (val<=earningMax & val>=earningMin)) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
                    else if (earningMin==1000 && val>=earningMin) {
                        System.out.printf(" %d ", val);
                        total +=1;
                    }
            }
            System.out.printf("\t(total:%d)", total);
            total = 0;
            System.out.println();
        }
    }
}
