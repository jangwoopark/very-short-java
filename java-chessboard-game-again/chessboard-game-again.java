import java.util.Scanner;

class Solution{
    static int[][] nimbers(final int side){
    int[][] nb=new int[side][side];
    for(int j=2;j<2*side-1;++j){
        int i=j<side?0:j-side+1;
        int k=j<side?j:side-1;
        while(i<=k){
        boolean[] seen=new boolean[4+1];
        if(i>1){
            seen[nb[i-2][k-1]]=true;
            if(k!=side-1) seen[nb[i-2][k+1]]=true;
        }
        if(k>1){
            if(i!=0) seen[nb[i-1][k-2]]=true;
            if(i!=side-1) seen[nb[i+1][k-2]]=true;
        }
        int l=0;
        while(seen[l]) ++l;
        nb[i][k]=l;
        nb[k][i]=l;
        ++i;
        --k;
        }
    }
    return nb;
    }
    static boolean win(int nCoin, Scanner sc, int[][] nb){
    int nimSum=0;
    while(nCoin-- != 0){
        int x=sc.nextInt(), y=sc.nextInt();
        nimSum ^= nb[x-1][y-1];
    }
    return nimSum!=0;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int nCase=sc.nextInt(), side=15;
    int[][] nb=nimbers(side);
    while(nCase-- != 0){
        int nCoin=sc.nextInt();
        System.out.println(win(nCoin,sc,nb)?"First":"Second");
    }
    sc.close();
    }
}
