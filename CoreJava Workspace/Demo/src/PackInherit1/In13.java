package PackInherit1;


interface Abc
{
    public default void disp()
    {
        System.out.println("hi");
    }
}
class In implements Abc
{
    public void disp()
    {
          System.out.println("hlo");
      Abc.super.disp();                   // if we use interface own method instead of overriden we use interface naeme .super.method name.
    }
}
public class In13
{
    public static void main(String args[])
    {
        Abc obj=new In();
        obj.disp();
    }
}