package Baekjoon.bronze;

import java.util.Scanner;
//https://www.acmicpc.net/submit/5622/30501867
public class dial {

    public static void main(String[] args) {


        /*
         *  문제 해결방법
         *  지금처럼 아스키 코드를 이용 특정범위에 있을때 값을 저장해주는 방식과
         *  map에 키를 알파벳으로 설정 value를 값으로 두고 설정하는 방식 두가지가 있다 판단했다
         * */

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i =0;i<s.length();i++)
        {
            //2
            if(65 <= s.charAt(i) && s.charAt(i)<= 67)
            {
                count+=3;
            }
            //3
            else if(68 <= s.charAt(i) && s.charAt(i)<= 70)
            {
                count+=4;
            }
            //4
            else if(71 <= s.charAt(i) && s.charAt(i)<= 73)
            {
                count+=5;
            }
            //5
            else if(74 <= s.charAt(i) && s.charAt(i)<= 76)
            {
                count+=6;
            }
            //6
            else if(77 <= s.charAt(i) && s.charAt(i)<= 79)
            {
                count+=7;
            }
            //7
            else if(80 <= s.charAt(i) && s.charAt(i)<= 83)
            {
                count+=8;
            }
            //8
            else if(84 <= s.charAt(i) && s.charAt(i)<= 86)
            {
                count+=9;
            }//9
            else if(87 <= s.charAt(i) && s.charAt(i)<= 90)
            {
                count+=10;
            }
            //0
            else
            {
                count+=11;
            }
        }
        System.out.println(count);

    }
}
