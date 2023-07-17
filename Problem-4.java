import java.util.*;

public class NumberMultiplesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();
        
        String[] numbers = input.split(",");
        List<Integer> numberList = new ArrayList<>();
        for (String number : numbers) {
            numberList.add(Integer.parseInt(number.trim()));
        }
        
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int multiple : multiples) {
            int count = 0;
            
            for (int number : numberList) {
                if (number % multiple == 0) {
                    count++;
                }
            }
            
            countMap.put(multiple, count);
        }
        
        System.out.println("Output: " + countMap);
    }
}
