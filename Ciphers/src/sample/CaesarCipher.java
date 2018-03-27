package sample;

public class CaesarCipher {

    public String encrypt(String m , final int shift) {
            if (shift<0 || shift>25 || m.length()<=0){
                return null ;
            }
        String s = "" ;
            m = m.trim() ;
            int lenght = m.length();
        for(int i = 0; i < lenght; i++){
            char c = (char)(m.charAt(i) + shift);
            if (c > 'z')
                s += (char)(m.charAt(i) - (26-shift));
            else
                s += (char)(m.charAt(i) + shift);
        }
        return s;
    }

    public  String Decrypt(String  m , final int key) {
        String dm = "";
        char ch ;
        for(int i = 0; i < m.length(); ++i){
            ch = m.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - key);

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }

                dm += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - key);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }

                dm += ch;
            }
            else {
                dm += ch;
            }
        }

        System.out.println("Decrypted Message = " + dm);
        return dm ;
    }

}
