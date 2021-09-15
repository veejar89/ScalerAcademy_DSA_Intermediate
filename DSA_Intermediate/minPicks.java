public class minimumPicks {
private static int solve(int[] A){
        int maxEven = 0;
        int minOdd = 0;

        Arrays.sort(A);
        for (int currIndex=A.length-1; currIndex>=0; currIndex--){
            if(A[currIndex]%2==0){
                maxEven=A[currIndex];
                break;
            }
        }
        for (int currIndex=0; currIndex<A.length; currIndex++){
            if(A[currIndex]%2!=0){
                minOdd = A[currIndex];
                break;
            }
        }
        return maxEven-minOdd;
    }
    }
