class Calculation {
    int No1, No2, No3;

    public Calculation(int No1, int No2, int No3) {
        this.No1 = No1;
        this.No2 = No2;
        this.No3 = No3;
    }

    public void sum() {
        int Tot = No1 + No2 + No3;
        System.out.println("TOTAL : " + Tot);
    }
}
public class QuestionNo2 {
    public static void main (String[] args)
    {

        Calculation Ex1 = new Calculation(1,2,3);
        Ex1.sum();
    }
}
