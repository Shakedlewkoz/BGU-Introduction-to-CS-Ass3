/*
I, Shaked Lewkowicz (207132283), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
public class Bit {

    private boolean value;

    public Bit(boolean value){
        this.value=value;
    }

    public int toInt(){ 
        int ans = 0;
        if (value==true) {
            ans=1;
        }
        return ans;

    }

    public String toString(){
        String ans = "0";
        if (value==true) {
            ans="1";
        }
        return ans;
    }
}

