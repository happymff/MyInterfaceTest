package util;

/**
 * Created by guojianhong on 2017/8/11.
 */
public class CharReplace {
//This is the Test
    public static String  getCharReplace(String str){
        if(str.contains("\"")){
            String strnew = str.replace("\"","");
            return strnew;
        }else if(str.contains("|")){
            String strnew = str.replace("|",",");
            return strnew;
        }else if(str.contains("/")){
            String strnew = str.replace("/","\"");
            return strnew;
        } else {
            return str;
        }
    }
}
