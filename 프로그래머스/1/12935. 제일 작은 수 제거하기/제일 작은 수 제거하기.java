class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            answer = new int[arr.length - 1];
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    continue;
                }
                answer[j] = arr[i];
                j++;
            }

        }
        return answer;
    }
}