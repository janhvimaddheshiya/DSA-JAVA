import java.util.*;
public class SmallestNumber {
  public static int getSmallest(int numbers[]){
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
      if(smallest > numbers[i]){
        smallest = numbers[i];
      }
    }
    return smallest;
  }
  public static void main(String[] args){
    int numbers[] = {2,5,7,1,9,12};
    System.out.println("Smallest number is: "+getSmallest(numbers));

  }
  
}
