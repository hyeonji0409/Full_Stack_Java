package Basic_Java;

public class Array05 {
    public static void main(String[] args) {
        int[] hakbuns = {1001,1002,1003,1004,1005};
        int[] scores = {87,11,45,98,23};
        int max_score = 0;
        int max_num = 0;

        for(int i=0; i<hakbuns.length;i++){
            if(max_score < scores[i]){
                max_score = scores[i];
                max_num = hakbuns[i];
            }
        }
        System.out.println(max_num+"번, "+max_score+"점");
    }
}
