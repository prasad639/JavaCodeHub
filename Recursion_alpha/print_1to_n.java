// Print numbers from 1 to n in increasing order.

public class print_1to_n{
    public static void print(int n){
if(n==1){  // this is the base case....
System.out.print(n + "  ");
return;
   
}
print(n-1);
System.out.print(n + "  ");

    }
public static void main(String args []){
System.out.println("sequence :");
print(10);

}
}