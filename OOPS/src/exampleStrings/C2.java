package exampleStrings;

public class C2 {
    public static void main(String args[]) {        

//        class & method
//        SystemInOutScanner
//        convertIntStrWrapper
//        array1
//        arrayList1
//        TreeSet1
//        TreeMap1
//        TreeMapCountWords
//        switchCase
//        stringMethods
//        StringBufferTest
//        asciiValue
//        reverseString();
        capitalizeWords();
//        JavaConfigFile
//        FileRead
//        FileWrite
    }
    
    static void capitalizeWords() {
        String a = "welcome to java";
        int count=1;
        String b="";
        char c;
        
        for(int i=0; i<a.length(); i++) {
            c=a.charAt(i);
            if(c==' ')
                count = 0;
            
            if(count==1)
                {count++; b=b+String.valueOf(c).toUpperCase();}
            else
                { count++; b=b+c;}
        }
        
        System.out.println(a);
        System.out.println(b);
    }
    
    static void reverseString() {
        String a = "welcome to java";
        String b="";
        
        for(int i=0; i<a.length(); i++) {
            b=a.charAt(i)+b;
        }
        System.out.println(b);
    }
    
}
