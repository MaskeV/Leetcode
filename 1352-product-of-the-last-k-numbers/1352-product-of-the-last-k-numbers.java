 class ProductOfNumbers {
     ArrayList<Integer> list;
    public ProductOfNumbers() {
         list = new ArrayList<>();
            
    }
    
    public void add(int num) {
        list.add(num);
        
    }
    
    public int getProduct(int k) {
        int ans=1;
      

        for(int i=list.size()-k;i<list.size();i++){
          ans*=list.get(i);

        }

        return  ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

//  class ProductOfNumbers {

//     ArrayList<Integer> al;
//     public ProductOfNumbers() {
//        this.al = new ArrayList<>();
//     }
    
//     public void add(int num) {
//         al.add(num);
//     }
    
//     public int getProduct(int k) {
//         int p=1;
//         for(int i=al.size()-k; i<al.size(); i++){
//             p*=al.get(i);
//         }
//         return p;
//     }
// }