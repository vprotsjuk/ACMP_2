import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        for(int i = 1; i < 65; i++){
            if(!vanya(i).equals(papa(i))){
                String v = vanya(i);
                String p = papa(i);
                String[] vArr = v.split(" ");
                String[] pArr = p.split(" ");
                List<Integer> vList = new ArrayList<>();
                List<Integer> pList = new ArrayList<>();
                for(String s : vArr){
                    vList.add(Integer.parseInt(s));
                }
                for(String s : pArr){
                    pList.add(Integer.parseInt(s));
                }
                Collections.sort(vList);
                Collections.sort(pList);
                boolean eq = vList.equals(pList);
                if(!eq){
                    System.out.println("ERROR IN TEST " + i);
                    System.out.println("vList " + vList);
                    System.out.println("pList" + pList);
                }
            }
        }
    }

    private static String vanya(int n){
        int boardWidth = 8;
        int boardSize = 64;
        boolean hasLeft = (n-1) % boardWidth != 0 && n != 1;
        boolean hasUp = n < boardSize-boardWidth;
        boolean hasDown = n>boardWidth;
        boolean hasRight = n%boardWidth != 0;

        String ans = "";
        if(hasLeft)
            ans = ans + (n-1) + " ";
        if(hasRight)
            ans = ans + (n+1) + " ";
        if(hasUp)
            ans = ans + (n+boardWidth) + " ";
        if(hasDown)
            ans = ans + (n-boardWidth) + " ";

        return(ans.substring(0, ans.length()-1));
    }

    private static String papa(int k){
        int fields = 8;
        if (k == 1){
            return((1 + 1) + " " + (1 + fields));
        }
        else  if (k == fields){
            return( (fields - 1) + " " + fields * 2);
        }
        else  if (k == (Math.pow(fields, 2) - fields) + 1){
            return( (k - fields) + " " +  (k +  1));
        }
        else if (k == Math.pow(fields, 2) ){
            return( (k - fields) + " " +  (k -  1));
        }
        else if ( k > 1 && k < fields){
            return((k - 1) +" " + (k + 1) + " " + (k + fields));
        }
        else if ( k < (Math.pow(fields, 2) ) && k >  (Math.pow(fields, 2) ) - (fields-1)){
            return((k - fields) + " " + (k - 1) + " " + (k + 1));
        }
        else if ( k %fields == 0){
            return((k - fields) + " " + (k - 1) + " " + (k + fields));
        }
        else if ( (k - 1) %fields == 0){
            return((k - fields) + " " + (k + 1) + " " + (k + fields));
        }
        else {
            return((k - fields) + " " + (k - 1) + " " + (k + 1) + " " + (k + fields));
        }
    }
}
