package com.src;

public class ImageFliipInvert {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int n = image.length;
        int m = image[0].length;
//        int[][] flippedImage = new int[n][m];
//        int[][] invertedImage = new int[n][m];

        System.out.println("Original matrix");
        for (int[] ints : image) {
            for (int num :ints) {
                System.out.print(num);
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            int left=0;
            int right=m-1;
            while(left<=right){
                int temp=image[i][left];
                image[i][left]=1-image[i][right];
                image[i][right]=1-temp;
                left++;
                right--;
            }
        }
//        for (int i = 0; i < n; i++) {
//            int l = 0;
//            for (int j = m - 1; j >= 0; j--) {
//                if (image[i][j] == 0)
//                    invertedImage[i][l] = 1;
//                else {
//                    invertedImage[i][l] = 0;
//                }
//                l++;
//            }
//
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//               if(flippedImage[i][j]==0){
//                   invertedImage[i][j]=1;
//               }
//
//            }
//
//        }

        System.out.println("Inverted matrix");
        for (int[] ints : image) {
            for (int num :ints) {
                System.out.print(num);
            }
            System.out.println();
        }

//        System.out.println("Inverted matrix");
//        for (int[] ints : invertedImage) {
//            for (int num :ints) {
//                System.out.print(num);
//            }
//            System.out.println();
//        }
    }
}
