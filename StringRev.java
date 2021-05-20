public class StringRev
{
public static void main(String[] args)
{

String name="Saurabh Kumar";

char[] nc=name.toCharArray();

for (int i=nc.length-1;i>=0;i--)
{
System.out.print(nc[i]);


}
}
}