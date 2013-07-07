/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author XiaoxuShen
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Reverse words in a sentence. 
            Ex: 
            Input: "reverse the word" 
            Output: "word the reverse"
            * solution: firstly reverse the whole string, secondly reverse word one by one.
         */
        String input = "fuck you";
        System.out.println(split(input));
    }
    public static String reverse(String input){
        int jj = input.length() - 1;
        int ii = 0;
        char tmp;
        char[] tmpArray = new char[input.length()];
        tmpArray = input.toCharArray();
        if(input.length() % 2 != 0){
            while(ii != jj){
                tmp = input.charAt(ii);                
                tmpArray[ii] = tmpArray[jj];
                tmpArray[jj] = tmp;                
                ii++;
                jj--;
            }
        }else{
            while(jj + 1 != ii){
                tmp = input.charAt(ii);                
                tmpArray[ii] = tmpArray[jj];
                tmpArray[jj] = tmp;                
                ii++;
                jj--;                
            }
        }
        input = new String(tmpArray);
        return input;
    }
    
    public static String split(String input){
        String subresult;
        String result = "";
        int lastIndex = 0;
        input = reverse(input);
        input = input + " ";
        for(int kk = 0; kk < input.length(); kk++){
            if(input.charAt(kk) == ' '){
                subresult = input.substring(lastIndex, kk);
                lastIndex = kk + 1;
                subresult = reverse(subresult);
                result += subresult + " ";
            }
        }
        return result;
    }
}
