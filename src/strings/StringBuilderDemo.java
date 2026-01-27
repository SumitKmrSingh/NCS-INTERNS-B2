package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str1 = "Sumit";
        String str2 = "Kumar";

        String leftRotation = str1.substring(2)+str1.substring(0,2);
        String rightRotation = str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2);

        System.out.println("Left Rotation : "+leftRotation); // mitSu
        System.out.println("Right Rotation : "+rightRotation); // itSum
        System.out.println(); // itSum

//        System.out.println(str1 + str2);
//        System.out.println(str1.concat(str2));
//
//        String str3 = new String("abc");
//
//        System.out.println(str1.equals(str2));  // true
//        System.out.println(str1==str2);    // true
//        System.out.println(str1==str3);    // false
//        System.out.println(str2==str3);    // false
//        System.out.println(str1.equals(str3));    // true
//        System.out.println(str2.equals(str3));    // true
//
//
//        StringBuilder stringBuilder1 = new StringBuilder("Sumit");
//        StringBuilder stringBuilder2 = new StringBuilder("Sumit");
//
//        System.out.println(stringBuilder1.equals(stringBuilder2)); //false
//        System.out.println(stringBuilder1==stringBuilder2); //false
//
//        StringBuffer stringBuffer1 = new StringBuffer("Sumit");
//        StringBuffer stringBuffer2 = new StringBuffer("Singh");
//        System.out.println(stringBuffer1.equals(stringBuffer2));
//        System.out.println(stringBuffer2==stringBuffer1);
//
//        System.out.println(stringBuffer1.append(stringBuffer2));


    }
}