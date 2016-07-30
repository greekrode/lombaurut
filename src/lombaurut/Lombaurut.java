package lombaurut;

import com.mkdika.Xutil;
import java.io.IOException;

public class Lombaurut {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {

        // Baca text file, masukan isi text file kedalam variable array.       
        int[] x = Xutil.readTxtFileToArray("random.dat");
        if (x == null || x.length <= 0) {
            System.out.println("Error read text file. try again.");
            return;
        }else {
            System.out.println("Array Length: " + x.length);
        }
        
        long start = Xutil.getTime();
        // BEGIN - YOUR CODE HERE
        // =====================================================================
        //
          // InsertionSort
        int i,j,k,temp,l;
      Boolean asdf = true;
        temp = 0;
       l = x.length;
            for(j = 1; j <x.length-1;j++){
                k = x[j];
               for(i = j-1;i>=0&&(x[i]<k); i --){
                   x[i+1] = x[i];
            }
               x[i+1] = k;
            }
        // =====================================================================
        // END
        
        
        long end = Xutil.getTime();

        System.out.println("Total execution time (nano sec): " + Xutil.executionTime(start, end));       
        Xutil.writeTxtFileFromArray(x, "sorted.dat");
    }

}
