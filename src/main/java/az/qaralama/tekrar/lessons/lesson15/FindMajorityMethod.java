package az.qaralama.tekrar.lessons.lesson15;

public class FindMajorityMethod {
    public static int findMajorityElement(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if(count >= arr.length/2)
                return arr[i];
        }
        return 0;
    }
}
