
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

interface Constants {
     int Constants_A = 1;
     int Constants_B = 12;
    void nn();
}
public class BMIexponent implements Constants{
    enum Constants2 {
        Constants_A, Constants_B
    }
//    使用接口定义常量
    public void nn(){
        System.out.println("Constants.Constants_A");
    }
    public static void doit(int c) {
        switch(c) {
            case Constants.Constants_A:
                System.out.println(Constants.Constants_A);
                break;
            case Constants.Constants_B:
                System.out.println(Constants.Constants_B);
                break;
        }
    }
    public static void doit2(Constants2 c) {
        switch (c) {
            case Constants_A:
                System.out.println(Constants2.Constants_A);
                break;
            case Constants_B:
                System.out.println(Constants2.Constants_B);
                break;

        }
    }
    public static void main(String[] args) {
        BMIexponent.doit(12);
    }
}
