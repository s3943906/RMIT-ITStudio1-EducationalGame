public class QuestionFour
{
    public static void main(String[] args)
    {
        int[] arrayN = {1, 3, 5, 6, 4, 3, 1};
        int a = arrayN[1];
        int b = arrayN[a - arrayN[arrayN.length-1]];
        System.out.println(a+b);
    }    
}