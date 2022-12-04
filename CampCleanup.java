import java.util.Scanner;

public class CampCleanup {
    static int pairCounter = 0;
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            while(sc.hasNextLine()){
                String elveCampIDRange[]=sc.next().split(",");
                System.out.println(elveCampIDRange[0] + "," + elveCampIDRange[1]);
                if (isSubStringUsingEndpoints(elveCampIDRange[0],elveCampIDRange[1])) {
                    pairCounter += 1;
                }
               /* String fullyFormedCampIDElf1= formedCampID(elveCampIDRange[0]);
                String fullyFormedCampIDElf2=formedCampID(elveCampIDRange[1]);

                System.out.println(fullyFormedCampIDElf1+ "," + fullyFormedCampIDElf2);
                if(fullyFormedCampIDElf1.length() > fullyFormedCampIDElf2.length()) {
                    if (isSubString(fullyFormedCampIDElf1, fullyFormedCampIDElf2)) {
                        pairCounter = pairCounter+ 1;
                    }
                }
                else {
                    if (isSubString(fullyFormedCampIDElf2, fullyFormedCampIDElf1)) {
                        pairCounter += 1;
                    }
                }*/
                System.out.println(pairCounter);
            }
        }

        System.out.println("Final"+ pairCounter);
    }

    private static boolean isSubStringUsingEndpoints(String s, String s1) {
        String[] x1y1=s.split("-");
        String[] x2y2=s1.split("-");
        int x1 = Integer.parseInt(x1y1[0]);
        int y1 = Integer.parseInt(x1y1[1]);
        int x2 = Integer.parseInt(x2y2[0]);
        int y2 = Integer.parseInt(x2y2[1]);
        if((x1<=x2 && x2<=y1))
        {
            //if(y2<=y1)
            return true;
        }
        if(x1>=x2 && x1<=y2){
            return true;
        }
        if((y2<=y1 && y2>=x1))
        {
           // if(y1<=y2)
                return true;
        }
        if((y1>=x2 && y1<=y2)){
            return true;
        }


        return false;
    }

    private static boolean isSubString(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();
            for (int i = 0; i <= M - N; i++) {
                int j;
                /* For current index i, check for pattern match */
                for (j = 0; j < N; j++) {
                    if (s1.charAt(i + j) != s2.charAt(j))
                        break;

                }
                if (j == N)
                    return true;

            }
            return false;
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
