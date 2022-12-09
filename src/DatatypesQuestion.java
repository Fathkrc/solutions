import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DatatypesQuestion {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();
        List<String>list=new ArrayList<String>();
        for(int i=0;i<count;i++){
            list.add(input.next());

        }
        // list.sort(Comparator.comparing(String::valueOf));
        for(String w:list){

            try{

                if(Long.valueOf(w)<Byte.MAX_VALUE && Long.valueOf(w)>Byte.MIN_VALUE){
                    System.out.println(w+" can be fitted in:"+"\n* byte "+"\n* short"+"\n* int"+"\n* long ");
                }else if(Long.valueOf(w)<Short.MAX_VALUE && Long.valueOf(w)>Short.MIN_VALUE){
                    System.out.println(w+" can be fitted in:"+"\n* short "+"\n* int"+"\n* long");
                }else if(Long.valueOf(w)<Integer.MAX_VALUE && Long.valueOf(w)>Integer.MIN_VALUE){
                    System.out.println(w+" can be fitted in:"+"\n* int "+"\n* long");
                }else if (Long.valueOf(w)<Long.MAX_VALUE && Long.valueOf(w)>Long.MIN_VALUE){
                    System.out.println(w+" can be fitted in:"+"\n* long ");
                }else {
                    System.out.println(w+"can't be fitted anywhere.");
                }
            } catch(Exception k){

                System.out.println(w+" can't be fitted anywhere.");
            }


        }


    }

    }

