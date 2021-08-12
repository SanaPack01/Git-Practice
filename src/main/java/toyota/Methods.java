package toyota;

import java.util.Map;

public class Methods {

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && (map.containsKey("b"))){
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if (map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        } return map;
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {

        if(!weekday || vacation) {
            return true;
        }

        return false;
    }
    public int diff21(int n) {
        if(n<=21){
            return 21-n;
        }

        else if(n>21){
            return ((n-21)*2);
        }
        return 0;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking &&(hour<7 || hour >20)){
            return true;
        } return false;
    }
    public boolean endsLy(String str) {
        if (str.endsWith("ly")){
            return true;
        } return false;
    }
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);
    }
    public String twoChar(String str, int index) {
        if(index <= str.length()-2 && index >= 0){
            return str.substring(index, index+2);}
        return str.substring(0, 2);
    }
    public String middleThree(String str) {
        if (str.length()>=4){
            return str.substring(str.length()/2-1,str.length()/2+2);
        }
        return str;
    }
    public boolean hasBad(String str) {
        if (str.length()==3 && str.equals("bad"))
            return true;
        else if (str.length()>=4){
            if(str.substring(0, 3).equals("bad"))
                return true;
            return str.substring(1, 4).equals("bad");
        }
        else return false;

    }

}
