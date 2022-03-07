//num7

public class num7 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i, j, resulta, resultb, resultc, resultd, resulte;

        //a 
        a = 4;
        b = 12;
        resulta = a + b / 3;
        System.out.println(resulta);
        //output: 8      

        //b
        c = 3;
        c = c + 3;
        d = 2;
        resultb = c - d;
        System.out.println(resultb);
        //output: 4

        //c
        e = 2;
        f = e + 1;
        e = f + 2;
        resultc = e + f + e;
        resultc = -resultc;
        System.out.println(resultc);
        //output: -13

        //d
        g = 3;
        h = 11;
        resultd = (h % g) + 1;
        System.out.println(resultd);
        //output: 3

        //e
        i = 3;
        j = i++;
        resulte = 1;
        resulte += i - j;
        System.out.println(resulte);
        //output: 2

        //f 
        String s, t , result2;

        s = "jjj";
        t = "xxx";
        result2 = s + s + t;
        System.out.println(result2);
        //output: jjjjjjxxx
      
    }
}