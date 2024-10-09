
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();;
        while(true){
            Integer value = Integer.valueOf(scanner.nextLine());

            if(value<0){
                break;
            }
            List.add(value);
        }
        System.out.println(sum(List));

    }

    public static int sum(ArrayList<Integer> numbers){
        Integer sum = 0;
        for(int i : numbers){
            sum = sum+i;
        }
        return sum;

    }
}
