package Baekjoon.silver;

import java.io.*;


public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [10000001];
        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine())]+=1;
        }
        for(int i =1;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
