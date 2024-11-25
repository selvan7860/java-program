import java.util.Arrays;

public class GraphOverlap {

    public static int ArrayChallenge(String[] strArr) {
        // __define-ocg__ Parse input and extract coordinates
        int[][] rect1 = new int[4][2];
        int[][] rect2 = new int[4][2];
        String[] points = strArr[0].split("\\),\\(");

        for (int i = 0; i < points.length; i++) {
            points[i] = points[i].replace("(", "").replace(")", "");
            int[] varOcg = Arrays.stream(points[i].split(",")).mapToInt(Integer::parseInt).toArray();
            if (i < 4) {
                rect1[i] = varOcg;
            } else {
                rect2[i - 4] = varOcg;
            }
        }

        // Get the bounding box for the first rectangle
        int rect1Left = Math.min(rect1[0][0], rect1[1][0]);
        int rect1Right = Math.max(rect1[2][0], rect1[3][0]);
        int rect1Bottom = Math.min(rect1[0][1], rect1[2][1]);
        int rect1Top = Math.max(rect1[1][1], rect1[3][1]);

        // Get the bounding box for the second rectangle
        int rect2Left = Math.min(rect2[0][0], rect2[1][0]);
        int rect2Right = Math.max(rect2[2][0], rect2[3][0]);
        int rect2Bottom = Math.min(rect2[0][1], rect2[2][1]);
        int rect2Top = Math.max(rect2[1][1], rect2[3][1]);

        // Calculate overlap bounds
        int overlapLeft = Math.max(rect1Left, rect2Left);
        int overlapRight = Math.min(rect1Right, rect2Right);
        int overlapBottom = Math.max(rect1Bottom, rect2Bottom);
        int overlapTop = Math.min(rect1Top, rect2Top);

        // Check for overlap
        if (overlapLeft >= overlapRight || overlapBottom >= overlapTop) {
            return 0; // No overlap
        }

        // Calculate areas
        int overlapArea = (overlapRight - overlapLeft) * (overlapTop - overlapBottom);
        int rect1Area = (rect1Right - rect1Left) * (rect1Top - rect1Bottom);

        // Calculate how many times overlap fits into rectangle 1
        return rect1Area / overlapArea;
    }

     public static void main(String[] args) {
        String[] input1 = {"(0,0),(0,-2),(3,0),(3,-2),(2,-1),(3,-1),(2,3),(3,3)"};
        System.out.println(ArrayChallenge(input1)); // Output: 6

        String[] input2 = {"(0,0),(5,0),(0,2),(5,2),(2,1),(5,1),(2,-1),(5,-1)"};
        System.out.println(ArrayChallenge(input2)); // Output: 0
    }
}
