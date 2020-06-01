You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]


public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;
        
        int N = matrix.length;
        
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0; i < N; i++){
            int j = 0;
            int k = matrix[i].length - 1;
            while(j < k){
                int temp = matrix[i][j];
                matrix[i][j++] = matrix[i][k];
                matrix[i][k--] = temp;
            }
        }
    }
