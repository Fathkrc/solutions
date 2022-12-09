import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            long l = input.nextLong();
            if (l > Long.MAX_VALUE && l < Long.MIN_VALUE) {
                System.out.println("n can't be fitted anywhere.");
            } else {
                while (true) {
                    //System.out.println(l+" can be fitted in:"+"\n* long ");
                    if (l < Byte.MAX_VALUE && l > Byte.MIN_VALUE) {
                        System.out.println(l + " can be fitted in:" + "\n* long" + "\n* int" + "\n* short" + "\n* byte ");
                        break;
                    }else if(l < Short.MAX_VALUE && l > Short.MIN_VALUE){
                        System.out.println(l + " can be fitted in:" +"\n* long" + "\n* int" + "\n* short" );
                        break;
                    }else if (l < Integer.MAX_VALUE && l > Integer.MIN_VALUE) {
                        System.out.println(l + " can be fitted in:"+"\n* long" + "\n* int");
                        break;
                    } else {
                        System.out.println(l + " can be fitted in:" +"\n* long");
                        break;
                    }
                }
                //Long.MIN_VALUE
            }
        } catch (Exception e) {
            System.out.println("n can't be fitted anywhere.\n");
        }
    }
}