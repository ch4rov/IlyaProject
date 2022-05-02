package YouTubeLessons;

public class MultiArrays {
    public static void main (String [] args){
        int[][] matrices =  {{1,2,3},       // [0][0] [0][1] [0][2]
                            {4,5,6},       // [1][0] [1][1] [1][2]
                            {7,8,8}};      // [2][0] [2][1] [2][2]
        System.out.println(matrices[0][0]+","+matrices[0][1]+","+matrices[0][2]);
        System.out.println(matrices[1][0]+","+matrices[1][1]+","+matrices[1][2]);
        System.out.println(matrices[2][0]+","+matrices[2][1]+","+matrices[2][2]);
        System.out.println();
        // Вывод двойным циклом
        for(int i = 0; i<matrices.length; i++){
            for(int j = 0; j < matrices[i].length; j++){
                System.out.print(matrices[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
