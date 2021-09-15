
public class TwoGreaterElements {
  public static int[] solve(int[] A) {
        int[] B = A.clone();
        Arrays.sort(A);
        int largestNumber = A[A.length-1];
        int secondLargest = 0;
        int temp=0;
        for(int currIndex=A.length-1; currIndex>0; currIndex--){
            if(A[currIndex]<largestNumber){
                secondLargest = A[currIndex];
                temp = A.length - (A.length -currIndex);
                break;
            }
        }

        int[] out = new int[temp];
        int i =0;
        for (int currIndex=0; currIndex<A.length; currIndex++){
            if(B[currIndex] < secondLargest){
                out[i] = B[currIndex];
                i +=1;
            }
        }
        return out;
    }
  }
