package Utils;

import org.mindrot.jbcrypt.BCrypt;

public class enCryptUtil {
	public static String encrypt(String origin){
        String encrypted = BCrypt.hashpw(origin, BCrypt.gensalt());
        return encrypted;
    }
    public static   boolean check(String origin,String encrypted){
        boolean check = BCrypt.checkpw(origin,encrypted);
        return check;
    }
}
