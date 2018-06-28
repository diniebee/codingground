import java.util.Scanner;  
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);  
     
       System.out.println("Enter num: ");  
       int no=sc.nextInt();  
       long[] arr =new long [no+1];
       long ans = 0;
         
       for(int i = 1; i<arr.length ;i++)
        {
            if(i%2==0)
            {
                arr[i] = i * arr[i-1];
            }
            else
            {
                arr[i] = i + arr[i-1];
            }
            ans = arr[i];
        }
  
       System.out.println(no + "th :" + ans );  
       sc.close();  
     }
}
