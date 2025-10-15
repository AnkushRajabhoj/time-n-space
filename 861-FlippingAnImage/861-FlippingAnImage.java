// Last updated: 15/10/2025, 05:57:54
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int l = 0;
        int h = image[0].length-1;
        while(l<=h) {
            for(int i=0; i<image.length; i++) {
                int temp = (image[i][l]+1)%2;
                image[i][l] = (image[i][h]+1)%2;
                image[i][h] = temp;
            }
            l++;
            h--;
        }
        return image;
        
    }
}