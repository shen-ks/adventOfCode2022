import java.util.Scanner;

public class CampCleanup {
    static int pairCounter = 0;
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            while(sc.hasNextLine()){
                String elveCampIDRange[]=sc.next().split(",");
                System.out.println(elveCampIDRange[0] + "," + elveCampIDRange[1]);
                String fullyFormedCampIDElf1= formedCampID(elveCampIDRange[0]);
                String fullyFormedCampIDElf2=formedCampID(elveCampIDRange[1]);

                System.out.println(fullyFormedCampIDElf1+ "," + fullyFormedCampIDElf2);
                if( isSubString(fullyFormedCampIDElf1,fullyFormedCampIDElf2)){
                    pairCounter +=1;
                }
                System.out.println(pairCounter);
            }
        }


    }

    private static boolean isSubString(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();
        if (M > N) {
            for (int i = 0; i <= M - N; i++) {
                int j;
                /* For current index i, check for pattern match */
                for (j = 0; j < M; j++) {
                    if (s1.charAt(i + j) != s2.charAt(j))
                        break;

                }
                if (j == M)
                    return true;

            }
        }
        if (N > M) {
            for (int i = 0; i <= N - M; i++) {
                int j;
                /* For current index i, check for pattern match */
                for (j = 0; j < M; j++) {
                    if (s2.charAt(i + j) != s1.charAt(j))
                        break;

                }
                if (j == M)
                    return true;
            }

        }return false;
    }

    private static String formedCampID(String s) {
        String[] arr=s.split("-");
        String formedCampID = new String();
        for(int i = Integer.parseInt(arr[0]); i<= Integer.parseInt(arr[1]);i++){
            formedCampID= formedCampID + i;
        }
        return formedCampID;
    }
}
