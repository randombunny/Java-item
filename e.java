public class e {

    public static void main(String[] args) {
        double res = 1,tmp =1;
        for(int i = 1;i<20;i++){
            tmp = tmp*i;
            res+=1/tmp;
        }
        System.out.println(res);
    }
}