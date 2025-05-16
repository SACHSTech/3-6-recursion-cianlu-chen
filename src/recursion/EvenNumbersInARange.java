package recursion;

public class EvenNumbersInARange {
    public static void printsEven(int start, int end){
        if(start <= end){
            if(start % 2 != 0){
                start++;
            }

            System.out.println(start);
            printsEven(start + 2, end);
        }
    }

    public static void main(String[] args) {
        printsEven(5, 10);
    }
}
