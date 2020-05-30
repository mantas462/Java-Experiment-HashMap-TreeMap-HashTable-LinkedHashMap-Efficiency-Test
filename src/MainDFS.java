import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MainDFS {

    public static void main(String [] args) {

        long startTime=System.nanoTime();

        LinkedHashMap<String, String> linkedHashMap=new LinkedHashMap<String, String>();

        String first="m";
        String second="n";

        for(int i=0; i<2000; i++) {
            first=first+"ms";
            second=second+"n";
            linkedHashMap.put(first,second);
        }

        long endTime=System.nanoTime();
        long timeElapsed=endTime-startTime;
        System.out.println(timeElapsed);

    }
    }