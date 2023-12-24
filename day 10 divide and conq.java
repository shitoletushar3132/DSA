public class divide_conquer {

    public static void divide(int arr[], int si, int ei){

        if(si >= ei)
        {
            // System.out.println(arr[si]);
            return;
        }
        
        int mid = (si +ei)/2; //(si+ei)/2
        // System.out.println(mid);
        divide(arr, si, mid);//left part
        divide(arr, mid+1, ei);//right part

        conquer(arr,si,mid,ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei)
    {
        // System.out.println(si+ " "+ei);
        int merge[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid +1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merge[x++] = arr[idx2++];
        }

        for(int i =0,j = si; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }
        printarry(merge);
    }

    public static void quick_sort(int arr[], int si, int ei){
        //last element
        if(si < ei){
        int pidx =  partition(arr,si,ei);
        quick_sort(arr, si, pidx-1);
        quick_sort(arr, pidx+1, ei);
        }

    }

    public static int partition(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si ;
        
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i]=temp;
        return i;
    }

    public static int search (int arr[], int tar, int si, int ei){

        if(si > ei){
            return -1;
        }
        int mid = (si+ei)/2;
        
        if(arr[mid]==tar);
        //mid on l1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= tar && tar <= arr[ei]){
                return search(arr, tar, si, mid-1 );
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
     
    public static void printarry(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int taridx = search(arr, target, 0, arr.length-1);
        System.out.println(taridx);
    }
}
