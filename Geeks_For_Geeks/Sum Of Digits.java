class Solution{
    static int sumOfDigits(int N) {
        // code here
      int sum=0;
      while(N>0){
          sum=sum+N%10;
          N=N/10;
          
      }  
       return sum;
    }
}


{https://practice.geeksforgeeks.org/problems/sum-of-digits1742/0}
