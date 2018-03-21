package sample;

public class VernamCipher {

    public String encrypt(String womeg, String key ) {
        String index="ABCDEFGHIJKLMNOPQRSTUVWXYZ",cipherText="" ;
        int a[][]=new int[womeg.length()][5],cipher[][]=new int[womeg.length()][5],v=0;int keyt[][]=new int[key.length()][5] ;
        //for key to convert to binary digit
        for(int j=0;j<key.length();j++) {
            char c = key.charAt(j);
            String val = String.valueOf(c);
            String index1 = findIndex(val);
            int p = Integer.parseInt(index1);
            for (int i = 4; i >= 0; i--) {
                keyt[j][i] = p % 2;
                p = p / 2;
            }}
            //for plaintext to convert in to binary digit
            for(int j=0;j<womeg.length();j++) {
            char c = womeg.charAt(j);
            String value=String.valueOf(c);
            String index1=findIndex(value);
            int p=Integer.parseInt(index1);
                for(int i=4;i>=0;i--) {
                    a[j][i]=p%2;
                p=p/2;}
        }
        //XOR operation
        for(int j=0;j<womeg.length();j++) {
            for (int i = 0; i <= 4; i++) {
                if (a[j][i] == keyt[j][i]) {
                    cipher[j][i] = 0;
                } else {
                    cipher[j][i] = 1;
                }
            }
        }
        for(int j=0;j<womeg.length();j++){
            double power=4,k=0;
            for(int i=0;i<=4;i++){
                k=k+cipher[j][i]*Math.pow(2,power);
                power=power-1;}int l=(int )k;
            l=l%26;cipherText=cipherText+index.charAt(l);
        }
        return cipherText ;
    }

    public String findIndex(String test ) {
        String letter[] = {"A", "B", "C", "D", "E", "F" ,"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z" };
    String k;
    for(int j=0; j<letter.length; j++){
        if(test.equalsIgnoreCase(letter[j])){
            k=String.valueOf(j);
        return k;
        }
    }
        return null;
    }

    public int generatekey() {
        return 0 ;
    }
}
