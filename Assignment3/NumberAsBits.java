import java.math.BigInteger;

/*
I, Shaked Lewkowicz (207132283), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
public class NumberAsBits {

    private Bit[] bits;

    public NumberAsBits(Bit[] bits) {
        if (bits==null) {
            throw new IllegalArgumentException();
        }
        this.bits=new Bit[bits.length];
        for (int i=0; i<bits.length; i++) {
            if (bits[i]==null) {
                throw new IllegalArgumentException();
            }
            if (bits[i].toInt()==1) {
                this.bits[i]=new Bit(true);
            }
            else {
                this.bits[i]=new Bit(false);
            }
        }
    }

    public String toString() { 
        String ans ="";
        BigInteger a=BigInteger.ZERO;
        for (int i=0; i<bits.length; i++) {
            if (bits[i].toString()=="1") {
                a.multiply(BigInteger.valueOf(2));
                a.add(BigInteger.ONE);
            }
            else {
                a.multiply(BigInteger.valueOf(2));
            }
        }
        return ans;
    }

    public String base2() {
        String ans ="";
        if (bits==null) {
            throw new IllegalArgumentException();
        }
        for (int i=0; i<bits.length; i++) {
            if (bits[i]==null) {
                throw new IllegalArgumentException();
            }
            ans=ans+bits[i].toString();
        }
        return ans;
    }
}


