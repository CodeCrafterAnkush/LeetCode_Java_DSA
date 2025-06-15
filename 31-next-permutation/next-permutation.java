class Solution {
    public void nextPermutation(int[] A) {
        int pivot=-1,n=A.length;
        // System.out.println(n);
        // find pivot 
        for(int i=n-2;i>=0;i--){
            if(A[i]<A[i+1]){
                // System.out.println(A[i]);
                pivot=i;
                break;
            }
        }
        // if there is no pivot means pivote =-1
        if(pivot == -1){
            //reverse array
            for(int i=0,j=n-1;i<=j;i++,j--){
                //Swap
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
            return;
        }

        //Find next largest element
        for(int i=n-1 ; i>pivot;i--){
            if(A[i]>A[pivot]){
                // swap
                int temp = A[pivot];
                A[pivot]=A[i];
                A[i]=temp;

                break;
            }
        }

        // reverse array (From pivot+1 to n-1)
        int i=pivot+1;
        int j=n-1;
        while(i<=j){
            int tem=A[i];
            A[i]=A[j];
            A[j]=tem;
            i++;
            j--;
        }
    }
}