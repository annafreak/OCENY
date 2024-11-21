abstract class  Marks{
public abstract double getPercentage();
}
class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;

    }

    @Override
    public double getPercentage() {
        int totalPoints = subject1 + subject2 + subject3;
        return (totalPoints / 300.0) * 100;
    }
}

    class B extends Marks{
        private int subject1;
        private int subject2;
        private int subject3;
        private int subject4;
        public B(int subject1, int subject2, int subject3, int subject4){
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;

        }
        @Override
        public double getPercentage() {
            int totalPoints = subject1 + subject2 + subject3 + subject4;

            return (totalPoints / 400.0) * 100;

        }

    }



public class Main {

    public static void main(String[] args) {
        A studentA = new A(80,80,80);
        B studentB = new B(80,70,86,90);

    System.out.println(studentA.getPercentage());
    System.out.println(studentB.getPercentage());


    }

}