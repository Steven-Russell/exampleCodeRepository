package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/19 18:24
 **/
public class StrToInt {
    public int StrToInt(String str) {
        if(str==null||str.equals("")){
            return 0;
        }
        char[] charArray = str.toCharArray();
        if(charArray.length>11){
            return 0;
        }
        //结果
        int res = 0;
        //判断第一位是否合法
        if(charArray[0]!='-'&&charArray[0]!='+'&&!Character.isDigit(charArray[0])){
            return 0;
        }
        if(Character.isDigit(charArray[0])){
            res += Integer.parseInt(charArray[0]+"")*Math.pow(10,charArray.length-1);
        }
        //判断后续
        if(charArray[0]=='-'){
            if(Character.isDigit(charArray[charArray.length-1])&&charArray.length==11){
                if(Integer.parseInt(charArray[charArray.length-1]+"")>8){
                    return 0;
                }
            }
            for(int i = 1;i<charArray.length;i++){
                if(!Character.isDigit(charArray[i])){
                    return 0;
                }
                res-=Integer.parseInt(charArray[i]+"")* Math.pow(10,charArray.length-1-i);
            }
        }else{
            if(Character.isDigit(charArray[charArray.length-1])&&(charArray.length==11||charArray.length==10)){
                if(Integer.parseInt(charArray[charArray.length-1]+"")>7){
                    return 0;
                }
            }
            for(int i = 1;i<charArray.length;i++){
                if(!Character.isDigit(charArray[i])){
                    return 0;
                }
                res+=Integer.parseInt(charArray[i]+"")* Math.pow(10,charArray.length-1-i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new StrToInt().StrToInt("2147483649"));
        System.out.println(new StrToInt().StrToInt("+222"));
        System.out.println(new StrToInt().StrToInt("-234"));
    }
}
