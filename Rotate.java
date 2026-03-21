// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int[] Rotate(int[] arr, int k)
    {
        int[] rotatedarray= new int[arr.length];
        int count=arr.length-k-1;
        int intial=0;
        for(int i=k+1;i<arr.length;i++)
        {
            rotatedarray[intial]=arr[i];
            intial++;
        }
        for(int j=0;count<arr.length;j++)
        {
            rotatedarray[intial]=arr[j];
            intial++;
            count++;
        }
        return rotatedarray;
    }
    
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5};
     int k=2;
     int[] result=rotate(arr, k);
     for(int i=0;i<arr.length;i++)
     {
         System.out.println(result[i]);
     }
    }
}
