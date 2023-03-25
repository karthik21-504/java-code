class A1 {
    void printMe() {
        System.out.println("Inside A");
    }
    class y {
        void printMe() {
            System.out.println("Inside B");
            //v g=new v();
            //g.printMe();
        }
        class v {
            void printMe() {
                System.out.println("Inside C");
                //e q=new e();
                //q.printMe();
            }
            class e {
                void printMe() {
                    System.out.println("Inside D");
                }
            }
        }
    }
}

public class nestedClass {
    public static void main(String[] args) {
        A1 a=new A1();
        a.printMe();
        A1.y z=a.new y();
        z.printMe();
        A1.y.v b=z.new v();
        b.printMe();
        A1.y.v.e s=b.new e();
        s.printMe();
    }
}
