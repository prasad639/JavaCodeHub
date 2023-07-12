public class String_compare {
    public static void main(String args[]){
        String a = "pra";
        String b = "pra";
        String c = new String("pra");
        if(a==c){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        
        
        if(a.equals(c)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        
    }
}
