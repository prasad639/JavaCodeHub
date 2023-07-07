// first occurance and last occurance of a key in given array using recursion

public class first_occ {
    public static int f_occurance(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
         
        if(arr[i] == key){
            return i;
        }

        return f_occurance(arr, key, i+1);
    }
    public static int last_occurance(int arr[],int key, int i){
        if(i==arr.length-1){
            return -1;
        }

int isfound = last_occurance(arr,key,i+1);
if(isfound != -1){
    return isfound;
}



// 
if(arr[i] == key){
    return i;

}
        return isfound;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,6,3,9};
        int key = 3;
        if(f_occurance(arr, key,0)!= -1)
       System.out.print("The key is present at lastindex :"+ last_occurance(arr, key,0));
       else{
        System.out.print("The key is not present in given array");
       }
    }
}
