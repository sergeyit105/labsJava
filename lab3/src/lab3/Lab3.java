package lab3;
public class Lab3 {
    public static void main(String[] args) {
        int arr[] = {-5, 10, -20, 30, -10, -87, -96, -9};
        int j = 0;
        for (int i = 0; i < arr.length; i++){
        if (arr[i] < 0){
        j++;
        }
        }
        System.out.println(j);
    }
    
}
