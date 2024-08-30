class Solution {
    public int romanToInt(String s) {
        int num=0;
       for(int i=0;i<s.length();i++){
        if(i<s.length()-2 && s.charAt(i)=='I' && s.charAt(i+1)=='I' && s.charAt(i+1)=='I'){
            num=num+3;
            i=i+2;
        }
        else if(i!=s.length()-1 && s.charAt(i)=='I' && s.charAt(i+1)=='I'){
            num=num+2;
            i=i+1;
        }
        else if(s.charAt(i)=='I'){
            if(i<s.length()-1 && s.charAt(i+1)=='V'){
                num=num+4;
                i=i+1;
            }
            else if(i<s.length()-1 && s.charAt(i+1)=='X'){
                num=num+9;
                i=i+1;
            }
            else{
                num=num+1;
            }
        }
        else if(s.charAt(i)=='V'){
            num=num+5;
        }
        else if(s.charAt(i)=='X'){
             if(i<s.length()-1 && s.charAt(i+1)=='L'){
                num=num+40;
                i=i+1;
            }
            else if(i<s.length()-1 && s.charAt(i+1)=='C'){
                num=num+90;
                i=i+1;
            }
            else{
                num=num+10;
            }
        }
        else if(s.charAt(i)=='L'){
            num=num+50;
        }
        else if(s.charAt(i)=='C'){
             if(i<s.length()-1 && s.charAt(i+1)=='D'){
                num=num+400;
                i=i+1;
            }
            else if(i<s.length()-1 && s.charAt(i+1)=='M'){
                num=num+900;
                i=i+1;
            }
            else{
                num=num+100;
            }
        }
        else if(s.charAt(i)=='D'){
            num=num+500;
        }
        else if(s.charAt(i)=='M'){
            num=num+1000;
        }


       }
       return num;
        
    }
}