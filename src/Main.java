public class Main {
    public static void main(String[] args)
    {
        getnumber(-5,6);
    }
    private static void getnumber (int x,int y){
        if (x > 0)  {
            if (y > 0)
                System.out.println("Первая четверть");
            else
                System.out.println("Четвертая четверть");
        }
        else {
            if (y > 0)
                System.out.println("Вторая четверть");
            else
                System.out.println("Третья четверть");
        }

    }
}
