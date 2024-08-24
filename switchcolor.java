import java.lang.*;
class switchcolor
{
    public static void main(String args[])
    {
        char color = 'B';
        switch (color)
        {
            case 'B':System.out.println("Blue");
                break;
            case 'G':System.out.println("Green");
                break;
            case 'R':System.out.println("Red");
                break;
            default :System.out.println("no color");
        }
    }
}
