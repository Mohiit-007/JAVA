package ARRAYSTRING;


public class varargs {
    public int add(int ...a){
        int sum = 0;
        for(int it : a){
            sum += it;
        }
        return sum;
    }
    public static void main(String[] args) {
        varargs obj = new varargs();
        int ans = obj.add(1,2,3,4,5);
        System.out.println(ans);
    }
}
