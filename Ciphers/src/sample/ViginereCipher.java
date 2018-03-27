package sample;

public class ViginereCipher {

    public String encrypt(String msg , final String  key) {
        String encrypted = "";
        msg = msg.toUpperCase() ;
        for (int i = 0, j = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            encrypted += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return encrypted;
    }

    public  String Decrypt(String msg , final String key) {
        String decrypted = "";
        msg = msg.toUpperCase();
        for (int i = 0, j = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            decrypted += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
         return decrypted;
    }

}
