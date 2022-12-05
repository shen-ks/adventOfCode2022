import java.util.Scanner;

public class CampCleanup {
    static int pairCounter = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String[] elvesCampIDRange = sc.next().split(",");
                System.out.println(elvesCampIDRange[0] + "," + elvesCampIDRange[1]);
                if (isSubStringUsingEndpoints(elvesCampIDRange[0], elvesCampIDRange[1])) {
                    pairCounter += 1;
                }
                System.out.println(pairCounter);
            }
        }

        System.out.println("Final" + pairCounter);
    }

    private static boolean isSubStringUsingEndpoints(String s, String s1) {
        String[] x1y1 = s.split("-");
        String[] x2y2 = s1.split("-");
        int x1 = Integer.parseInt(x1y1[0]);
        int y1 = Integer.parseInt(x1y1[1]);
        int x2 = Integer.parseInt(x2y2[0]);
        int y2 = Integer.parseInt(x2y2[1]);
        if ((x1 <= x2 && x2 <= y1)) {
            //if(y2<=y1)
            return true;
        }
        if (x1 >= x2 && x1 <= y2) {
            return true;
        }
        if ((y2 <= y1 && y2 >= x1)) {
            // if(y1<=y2)
            return true;
        }
        return y1 >= x2 && y1 <= y2;
    }
}




