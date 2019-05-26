/*
In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
 */
public class CoinSum {
    public static void main (String[] args){
 final int[] coins = {1,2,5,10,20,50,100,200} ;
 int solutions =0 ;
        for(int twopound =0 ;twopound<2;twopound++){
            for(int onepound =0 ;onepound<3;onepound++){
                for(int fiftyp =0 ;fiftyp<5;fiftyp++){
                    for(int twentyp =0 ;twentyp<11;twentyp++){
                        for(int tenp =0 ;tenp<21;tenp++){
                            for(int fivep =0 ;fivep<41;fivep++){
                                for(int twop =0 ;twop<101;twop++){
                                    for(int onep =0 ;onep<201;onep++){

                               if ( checksum(twopound,onepound,fiftyp,twentyp,tenp,fivep,twop,onep))  solutions++   ;
                                    }
                                }
                            }
                        }
                    }
                }
        }
    }
        System.out.println("number of solution is : "+ solutions);
}
public static boolean checksum(int twopound,int onepound, int fiftyp ,int twentyp, int tenp,int fivep,int twop,int onep){
        int sum =0;
        sum= twopound *200 +onepound *100 + fiftyp*50+twentyp*20+tenp*10+fivep*5+twop*2+onep*1;
        if (sum == 200) return true;
        return false;
}
}
