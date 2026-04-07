class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //rute force approach
        // for(int i=0;  i < matrix.length; i++){
        //     for(int j=0;  j<matrix[0].length; j++){
        //         if (matrix[i][j]==target)
        //             return true;
        //     }
        // }
        // return false;


        int m= matrix.length;
        int n= matrix[0].length;

        int low=0;
        int high= m * n - 1;

        while(low<= high){
            int mid= low + ( high- low)/2;
      //formula to convert the 1D TO 2d array
            int row= mid /n;
            int col= mid % n;

            int val=matrix[row][col];
            if(val== target)
              return true;
            else if(val<target)
              low= mid+1;
            else 
               high= mid-1;
        }
        return false;
    }
}
