public class StringFind{
    public static void main(String[] args) {
        string("welcome", 3);
        System.exit(34);
    }
    static void string(String s,int k){
        String lower,high,sub = s.substring(0,k);
        lower = sub;
        high = sub;
        for(int i =1;i<=s.length()-k;i++){
            sub = s.substring(i, i+k);
            if(sub.compareTo(lower)<0)
            lower = sub;
            if(sub.compareTo(high)>0)
            high = sub;
        }
        System.out.println(lower);
        System.out.println(high);

    }
}
class Test{
    
}