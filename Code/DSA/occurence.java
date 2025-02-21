import java.util.*;
public class Occurence {
    public static int findFirstOccurance(int arr[], int target, int index) {
        if (arr[index] == target) return index;
        return findFirstOccurance(arr, target, index + 1);
    }

    public static int findLastOccurance(int arr[], int target, int index) {
        if (index < 0) return -1;
        if (arr[index] == target) return index;
        return findLastOccurance(arr, target, index - 1);
    }

    public static int findnewlastOccurance(int arr[], int target, int index) {
        if (index == arr.length) return -2;
        int ans = findnewlastOccurance(arr, target, index + 1);
        if (arr[index] == target && ans==-2) return index;
        return ans;
    }

    public static List<Integer> findAllOccurrences(int arr[], int target, int index) {
        List<Integer> res = new ArrayList<>();
        if (index == arr.length) {
            return res;
        }
        if (arr[index] == target) {
            res.add(index);
        }
        res.addAll(findAllOccurrences(arr, target, index + 1));
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 10};
        int target = 5;
        System.out.println("First occurence of " + target + " is at index " + findFirstOccurance(arr, target, 0));
        System.out.println("Last occurence of " + target + " is at index " + findLastOccurance(arr, target, arr.length - 1));
        System.out.println("New last occurence of " + target + " is at index " + findnewlastOccurance(arr, target, 0));
        System.out.println("All occurences of " + target + " are " + findAllOccurrences(arr, target, 0));
    }
}