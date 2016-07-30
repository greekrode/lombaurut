package lombaurut;

import com.mkdika.Xutil;
import java.io.IOException;

public class Lombaurut1 {

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
          //radix sorting used
//        int i, m = x[0], exp = 1, n = x.length;
//        int[] b = new int[10]; //bucket
//        for (i = 1; i < n; i++)
//            if (x[i] > m){
//                m = x[i]; }		   //getmax
//				
//        while (m / exp > 0){                   //max didiv pangkat 10 diatas 0, bucket dibuat lagi
//            int[] bucket = new int[10];        //initialisasi bucket
//            for (i = 0; i < n; i++){
//                bucket[(x[i] / exp) % 10]++;   //dimasukkan ke bucket 
//			}
//            for (i = 1; i < 10; i++){       //bucket dituang ke bucket paling atas
//                bucket[i] += bucket[i - 1];
//			}
//            for (i = n - 1; i >= 0; i--){   //sorting ascending
//                b[--bucket[(x[i] / exp) % 10]] = x[i];
//			}
//            for (i = 0; i < n; i++){
//                x[i] = b[i];
//                }
//            exp *= 10;        
//
//        }
	
 //         InsertionSort
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
            //flipping
         Xutil.writeTxtFileFromArray(x, "sorted.dat");      
         int[] y = Xutil.readTxtFileToArray("sorted.dat");
         
            for(j = (x.length)-1;j > x.length/2;j--){ // 99 999 to 50 000 
                
                y[j] = temp; // value of 99999 to hold
                y[j] = y[(l-j)-1]; // 100000-99999 (?) l-j-1 = 100000 - 99999 - 1
                y[(l-j)-1] = temp; // 100000 - 99999(looped)  
                }
             Xutil.writeTxtFileFromArray(y, "sorted.dat");
            // 0 to 49 999

//shift f6 = result from descending
            //SelectionSort
//            int i, j, minIndex, tmp;
//            int n = x.length;
//                for (i = 0; i < n - 1; i++) {
//                   minIndex = i; 
//                   for (j = i + 1; j < n; j++){
//                     if (x[j] < x[minIndex])
//                     minIndex = j;
//                     if (minIndex != i) {
//                        tmp = x[i];
//                        x[i] = x[minIndex];
//                        x[minIndex] = tmp;
//                     }
//                }
//            }
//        
        // =====================================================================
        // END
        
        
        long end = Xutil.getTime();

        System.out.println("Total execution time (nano sec): " + Xutil.executionTime(start, end));       
       
    }

}
