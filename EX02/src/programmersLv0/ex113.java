package programmersLv0;

public class ex113 {
    public static void main(String[] args) {
        int[] arr1 = {49,13,100,17,84,1};
        int[] arr2 = {70,11,2,55,12,65,36};
        System.out.println(solution(arr1,arr2));
    }

    private static int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int num : arr1){
            sum1 +=num;
        }
        for(int num : arr2){
            sum2 +=num;
        }
        if(arr1.length > arr2.length ||(arr1.length == arr2.length&&sum1>sum2)){
            return 1;
        }
        else if(arr1.length < arr2.length ||(arr1.length == arr2.length&&sum1<sum2)){
            return -1;
        }
        else{
            return 0;
        }
    }
}
