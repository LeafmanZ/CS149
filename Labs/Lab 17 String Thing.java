
/**
 * StringThing is lab 17.
 * 
 * @author zielemjx
 * @version 11/6/2018
 */
public class StringThing {

    /**
     * We print out our methods.
     * 
     * @param args we have an arguments
     */
    public static void main(String[] args) {
        extraEnd("HelloThere");
        firstTwo("HelloThere");
        System.out.println(firstHalf("odd"));
        withoutEnd("HelloThere");
    }

    /**
     * extraEnd we print out more ends.
     * 
     * @param str we pass a string
     * @return strNew to our problem
     */
    public static String extraEnd(String str) {
        String strNew = str.substring(str.length() - 2, str.length());
        return strNew + strNew + strNew;
    }

    /**
     * firstTwo we print out the first.
     * 
     * @param str we pass a string
     * @return strNew to our problem
     */
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String strNew = str.substring(0, 2);
        return strNew;
    }

    /**
     * firstHalf we print out beginning half.
     * 
     * @param str we pass a string
     * @return strNew to our problem
     */
    public static String firstHalf(String str) {
        if ((str.length() % 2) != 0) {
            return str;
        }
        int length = str.length() / 2;
        String half = str.substring(0, str.length() - length);
        return half;
    }

    /**
     * withoutEnd we remove ends.
     * 
     * @param str we pass a string
     * @return strNew to our problem
     */
    public static String withoutEnd(String str) {
        String strNew = str.substring(1, str.length());
        strNew = strNew.substring(0, strNew.length() - 1);
        return strNew;
    }
}
