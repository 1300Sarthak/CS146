package Homework.HW11;

public class HW11 {
    public void floodFillJava(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor == newColor)
            return;

        floodFill(image, sr, sc, originalColor, newColor);
    }

    private void floodFill(int[][] image, int sr, int sc, int originalColor, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }

        image[sr][sc] = newColor;
        floodFill(image, sr + 1, sc, originalColor, newColor);
        floodFill(image, sr - 1, sc, originalColor, newColor);
        floodFill(image, sr, sc + 1, originalColor, newColor);
        floodFill(image, sr, sc - 1, originalColor, newColor);
    }

}
