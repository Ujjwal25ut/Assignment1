package Assignment1June23;

public class StringCompareBufferP3{
    public static void main(String[] args) {
        String str = "apple";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('a');
        stringBuffer.append('p');
        stringBuffer.append('p');
        stringBuffer.append('l');
        stringBuffer.append('e');
         
        boolean result = str.contentEquals(stringBuffer);
        System.out.println("Does str and stringBuffer have same content? " + result);
    }
}