 class Object {
    double AM3;
    double PCPF;
    double DSA;
    double DBMS;
    double JPL_Lab;
}

public class UseObject {
    public static void main(String[] args) {
        double avg;
        Object a = new Object();

        a.AM3 = 8.5;
        a.PCPF= 9.0;
        a.DBMS= 8.7;
        a.DSA= 7.9;
        a.JPL_Lab=9.8;

        avg=(a.AM3+a.JPL_Lab+a.DSA+a.DBMS+a.PCPF)/5;

        System.out.println("Average of all the subject ="+avg);



    }
}