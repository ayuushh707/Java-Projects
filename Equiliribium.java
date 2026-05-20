import java.util.*;

public class EquilibriumPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        long totalSum = 0;
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        long leftSum = 0;
        boolean found = false;

        for(int i = 0; i < n; i++) {
            // rightSum = totalSum - leftSum - currentElement
            long rightSum = totalSum - leftSum - arr[i];
            
            if(leftSum == rightSum) {
                System.out.println("Equilibrium point found at index: " + i);
                found = true;
                break;
            }
            leftSum += arr[i];
        }

        if(!found) {
            System.out.println("No equilibrium point found.");
        }
    }
}
