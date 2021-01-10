package iprep;

public class FirstDuplicate {
    
    static int  firstDuplicate(int[] a) {
    
        int[] checkDuplicate = new int[100001];
        
        for(int i = 0 ; i < a.length ; i++){
            checkDuplicate[a[i]]++;
            if(checkDuplicate[a[i]] > 1){
                return a[i];
            }
        } 
        return -1;
    }
    
    public static void main(String[] args) {
    
    int[] numbers = {2, 1, 3, 5, 3, 2};    
    
    int firstDuplicate = firstDuplicate(numbers);
    
        System.out.println(firstDuplicate);
    }
    
}
