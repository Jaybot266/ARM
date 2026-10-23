public class subprogram {

    static final int iterations = 10000;

    static int result = 0;
    
    static int shortParm(int a){
        return a + 1;
    }

    static int longParm(
        int q, int w, int e, int r, int t, int y, int u, 
        int i, int o, int p, int s, int d,int f, int g, 
        int h, int j, int k, int l, int z, int x){

        return  q + w +  e +  r +  t +  y + u + 
         i +  o +  p +  s + d + f + g + 
         h +  j +  k + l +  z +  x;
    }
    
    
    public static void main(String[] args){

        long start = System.nanoTime();

        for (int i = 0 ; i < iterations; i++){
            result += shortParm(i);
        }

        long finalTime = System.nanoTime() - start;

        long start2 = System.nanoTime();

        for (int i = 0 ; i < iterations; i++){
            result += longParm(i, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        }

        long longTime = System.nanoTime() - start2;

        System.out.println("The time required to to run the subprogram with one parameter is: " + finalTime);
        System.out.println("The time required to to run the subprogram with twenty parameter is: " + longTime);
        System.out.println("The ratio of the two times are: " + (double) longTime/finalTime);
    }

}
