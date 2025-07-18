package com.accenture;
import java.util.Scanner;

public class Maximum_Element_Array {
  public static int findMax(int[] arr) {
      int max_elem = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max_elem) {
              max_elem = arr[i];
          }
      }
      return max_elem;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of elements in the array: ");
      int n = sc.nextInt();
      
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }
      
      System.out.println("The maximum element is: " + findMax(arr));
  }
}
