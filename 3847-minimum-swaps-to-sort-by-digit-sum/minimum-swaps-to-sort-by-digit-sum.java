class Solution {
    class Pair{
        int value;
        int index;
        int digitSum;
        Pair(int value,int index,int digitSum){
            this.value = value;
            this.index = index;
            this.digitSum = digitSum;
        }
    }
    public void swap(int i,int j,Pair []arr){
        Pair temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            int last = n%10;
            sum+=last;
            n=n/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        Pair []arr = new Pair[nums.length];
        for(int i=0;i<arr.length;i++){
            int sum = digitSum(nums[i]);
            arr[i]= new Pair(nums[i],i,sum);
        }

        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                if(a.digitSum == b.digitSum){
                    return a.value-b.value;
                }else{
                    return a.digitSum-b.digitSum;
                }
                
            }
        });
        int count=0;
        for(int i=0;i<nums.length;i++){
            int idx = arr[i].index;
            if(i!=idx){
                count++;
                swap(i,idx,arr);
                i--;
            }
        }
        return count;
    }
}