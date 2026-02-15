class Solution {
 public String addBinary(String a, String b) {
   StringBuilder sb = new StringBuilder();

   int carry=0;
   int i=a.length()-1;
   int j=b.length()-1;
   while(i>=0 && j>=0){
    int sum=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
    sb.append(sum%2);
    carry=sum/2;
    i--;
    j--;
   }
   while(i>=0){
    int sum=(a.charAt(i)-'0')+carry;
    sb.append(sum%2);
    carry=sum/2;
    i--;
   }

    while(j>=0){
    int sum = (b.charAt(j)-'0')+carry;
    sb.append(sum%2);
    carry=sum/2;
    j--;
   }
   if(carry!=0){
   sb.append(carry);
   }
  return sb.reverse().toString();
    }
}