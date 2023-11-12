class Main{
    static void MatrixPrint(int[][] array,int row,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]);
            }
        }
    }
    public static void main(String [] args){
      int [][] array={{1,2,3},{4,5,6},{7,8,9}};
        MatrixPrint(array,3,3);
    }
}
