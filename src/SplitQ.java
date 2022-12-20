import java.util.Scanner;

public class SplitQ {
    public static void main(String[] args) {

            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan=new Scanner(System.in);
            String s=scan.nextLine();
            s=s.trim();
            if(s.length()>400000){
                System.out.println();
            }else if(s.length()==0||s.isBlank()){
                System.out.println(0);
            }else{
                String[]arr=s.split("[!,?.*_'@\\ ]+");
                System.out.println(arr.length);
                for(String w: arr){
                    System.out.println(w);
                }
            }
        }
    }

