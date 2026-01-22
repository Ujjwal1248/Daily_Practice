public class Coins{
    public static void main(String[] args){
        double[] p = {0.3,0.6,0.8};
        int n = p.length;
        double[][] dp = new int [((n+1)/2)+1][n+1];
        for(double[] a : dp){
            Arrays.fill(a,-1);
        }
        System.out.println(probability(p, (n+1)/2, 0, dp));
    }
    public static double probability(double[] p, int h,int i, double[][] dp){

        if(h==0){
            return 1.0;
        }
        if(i >= p.length){
            return 0.0;
        }
        if(dp[h][i] != -1){
            returndp[h][i];
        }

        double head = p[i] * probability(p, h-1, i+1);
        double tail = (1.0 - p[i]) * probability(p, h, i+1);

        return head + tail;
    }
}