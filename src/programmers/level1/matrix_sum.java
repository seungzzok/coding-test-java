package programmers.level1;

public class matrix_sum {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr1.length; i++){
            int[] inner = new int[arr1[i].length];
            for (int j = 0; j < arr1[i].length; j++){
                inner[j] = arr1[i][j] + arr2[i][j];
            }
            answer[i] = inner;
        }
        
        return answer;
    }
    
}
