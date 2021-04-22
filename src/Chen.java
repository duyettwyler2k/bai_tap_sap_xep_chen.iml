public class Chen {
    private static int arr[]={2,4,7,5,8,3,5};
public static void insertionSort(int arr[]){
    for (int i = 0; i < arr.length ; i++) {
        int pos=i;
        int temp=arr[pos];
        while (pos>0&&arr[pos-1]>temp){
            arr[pos]=arr[pos-1];
            pos--;
        }
        arr[pos]=temp;
    }
}

    public static void main(String[] args) {
      insertionSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
