/*
I, Shaked Lewkowicz (207132283), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
import java.math.BigInteger;
import java.util.Random;

class Part1{

    public static BigInteger sumSmaller(BigInteger n){
        BigInteger sum =  new BigInteger("0");
        for (BigInteger i=BigInteger.ONE; (i.compareTo(n))==-1; i=i.add(BigInteger.ONE)) {
            sum=sum.add(i);
        }
        return sum;
    }

    public static void printRandoms(int n){
        Random r=new Random();
        for (int i=1; i<=n; i++) {
            int num=r.nextInt();
            System.out.println(num);
        }
    }

    public static   boolean isPrime(BigInteger n){
        boolean ans= true;
        if (n.equals(BigInteger.ZERO)|n.equals(BigInteger.ONE)) {
            ans=false;
        }
        for (BigInteger divisor=BigInteger.valueOf(2); (divisor.multiply(divisor)).compareTo(n)==-1 & ans; divisor=divisor.add(BigInteger.ONE)) {
            BigInteger m=n.mod(divisor);
            if (m.equals(BigInteger.ZERO)) {
                ans=false;
            }
        }
        return ans;
    }

    public static BigInteger randomPrime(int n){
        BigInteger randBig = new BigInteger("0");
        Random r=new Random();
        randBig=new BigInteger(n,r);
        while (!isPrime(randBig)) {
            randBig=new BigInteger(n, r);
        }
        return randBig;
    }

    public static void main(String[] args) {
        //test for part 1.1
         BigInteger biMinus = new BigInteger("-10");
         System.out.println("sumSmaller test expected 0 - got " + sumSmaller(biMinus));
    
         BigInteger bi0 = new BigInteger("0");
         System.out.println("sumSmaller test expected 0 - got " + sumSmaller(bi0));
    
         BigInteger bi7 = new BigInteger("7");
         System.out.println("sumSmaller test expected 21 - got " + sumSmaller(bi7));
    
         BigInteger biHigh = new BigInteger("99999");
         System.out.println("sumSmaller test expected 4999850001 - got " + sumSmaller(biHigh)+"\n");
        
        //test for part 1.2
         System.out.println("printRandoms 5");
         printRandoms(5);
         System.out.println("");

        //test for part 1.3
        // BigInteger biVeryHigh = new BigInteger("2147521927");
        // System.out.println("isPrime test expectet true got " + isPrime(biVeryHigh));
        // biVeryHigh = new BigInteger("2147521921");
        // System.out.println(("isPrime test expectet false got " +  isPrime(biVeryHigh))+"\n");
        
        //test for part 1.4
        // System.out.println("randomPrime test");
        // System.out.println(randomPrime(20));
        // System.out.println(randomPrime(40));
    }
}