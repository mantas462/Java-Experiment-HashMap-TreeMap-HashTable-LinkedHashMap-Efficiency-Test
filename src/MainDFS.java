public class MainDFS {

    public static void main(String [] args) {

        long startTime=System.nanoTime();

        System.out.println("eesse");

        String first="m";
        String second="n";

        for(int i=0; i<2000; i++) {
            first=first+"ms";
            second=second+"n";

        }

        long endTime=System.nanoTime();
        long timeElapsed=endTime-startTime;
        System.out.println(timeElapsed);

    }