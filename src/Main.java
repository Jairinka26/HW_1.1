public class Main {
    public static void main(String[] args)
    {
        getnumber(0,0);
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
            else if (x==0 & y==0)
                System.out.println("Начало осей координат");
            else
                System.out.println("Третья четверть");
        }
    }
}
