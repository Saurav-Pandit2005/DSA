public class LinearSearch {
    
    public static int l_Search(int[] numbers, int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        int key = 8;

        int index = l_Search(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index : " + index);
        }
    }
}
