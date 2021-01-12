package com.shubham.letschatbackend;

import io.swagger.models.auth.In;

import javax.print.DocFlavor;
import java.util.*;

class Solution {

  static   int summer[][];
     static int arr[][];
static  int numberOfStack;
static  int numberofPlates;
static  int reqPlates;
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
List<Integer> soln=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numberOfStack = sc.nextInt();
            numberofPlates = sc.nextInt();
            reqPlates = sc.nextInt();
            summer = new int[numberOfStack + 1][numberofPlates + 1];
            arr = new int[numberOfStack + 1][numberofPlates + 1];
           // System.out.println(numberOfStack + " " + numberofPlates);
            for (int j = 1; j <= numberOfStack; j++) {
                for (int l = 1; l <= numberofPlates; l++) {
                   // System.out.println("enter stack" + j + " data" + l);
                    arr[j][l] = sc.nextInt();
                    summer[j][l] = summer[j][l - 1] + arr[j][l];
                }
            }
            //System.out.println("Answer arrived");
            soln.add( count(1,reqPlates));

        }
        for(int i:soln)
            System.out.println(i);
    }

        public static int count(int stack,int platesGathered){

            if(platesGathered<1 || stack>numberOfStack)
                return 0;
            int ans=0;
            for(int  i=0;i<=numberofPlates;i++){
                if(platesGathered<i)
                    break;
                    ans=Math.max(ans,summer[stack][i]+count(stack+1,platesGathered-i));
            }
            return ans;
        }
    }

