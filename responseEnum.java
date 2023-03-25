import java.util.Random;

enum Answers{
    NO,YES,MAYBE,LATER,SOON,NEVER
}
class question{
    Random r=new Random();
    Answers ask()
    {
        int pro = (int)(100* r.nextDouble());
        if (pro < 15)
            return Answers.MAYBE; // 15%
        else if (pro < 30)
            return Answers.NO; // 15%
        else if (pro < 60)
            return Answers.YES; // 30%
        else if (pro < 75)
            return Answers.LATER; // 15%
        else if (pro < 98)
            return Answers.SOON; // 13%
        else
            return Answers.NEVER; // 2%
    }
}
public class responseEnum {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }
    public static void main(String[] args) {
        question y=new question();
        answer(y.ask());
        answer(y.ask());
        answer(y.ask());
        answer(y.ask());

        Random f=new Random();
        System.out.println(f.nextDouble());
    }
}
