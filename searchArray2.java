import java.util.Scanner;
import java.*;
import java.io.*;
class searchArray2{

    static int findElement(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        if(arr[i]==key)
        return i;

        return -1;
    }

    public static void main(String[] args) {
        int N,i,key;
        System.out.println("Eneter the number of items");
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the items");
        for(i=0;i<N;i++)
        arr[i]= s.nextInt();
        System.out.println("Enter the item you want to search");
        key = s.nextInt();
        int position = findElement(arr,N,key);

        if(position==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element is at position "+(position+1));
    }
}