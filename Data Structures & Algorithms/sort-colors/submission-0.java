class Solution {
    public void sortColors(int[] nums) {
   
        int n=nums.length;
        mergeSort(nums,0,n-1);

    }
    private void mergeSort(int arr[],int l,int r){
        if(l>=r)return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        merge(arr,l,r,mid);
    }
    private void merge(int arr[],int l,int r,int mid){
        int temp[]=new int [r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid&&j<=r){
            if(arr[i]<=arr[j]){
            temp[k++]=arr[i++];
            }
        else{
            temp[k++]=arr[j++];
        }
        }
        while(i<=mid){
              temp[k++]=arr[i++];
        }
        while(j<=r){
             temp[k++]=arr[j++];
        }

 for(i=0;i<temp.length;i++){
    arr[l+i]=temp[i];
 }
    }
}
    
