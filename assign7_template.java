import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class assign7_template
{


    public void somespecialmethod()
    {
        ArrayList<Integer> e=new ArrayList<Integer>();
        e.add(5);
        e.add(502);
        e.add(15);
        ArrayList<String> e1=new ArrayList<String>();
        e1.add("mom");
        e1.add("heyy");
        e1.add("mam");
        prime p=new prime();
        oddNum o=new oddNum();
        evenNum en=new evenNum();
        counting a=new counting();

        palindrome pl=new palindrome();

        System.out.println("Arraylist is:"+e);
        System.out.println("Arraylist is:"+e1);
        System.out.println("Count of prime numbers is:"+a.count(e,p));
        System.out.println("Count of odd numbers is:"+a.count(e,o));
        System.out.println("Count of even numbers is:"+a.count(e,en));

        System.out.println("Count of palindrome is:"+a.count(e1,pl));
    }
    public static  void  main(String[] args)
    {
        assign7_template a=new assign7_template();
        a.somespecialmethod();

    }
}


interface specialNum<T>
{
    public boolean match(T t);

}
class prime implements specialNum<Integer>
{
    @Override
    public boolean match(Integer t)
    {
        if(t==1)
        {
            return false;
        }
        else
            for (int i = 2; i <= t/2; i++)
            {
                if (t % i == 0)
                    return false;

            }



        return true;
    }
}

class oddNum implements specialNum<Integer>
{
    @Override
    public boolean match(Integer t)
    {
        return (t % 2 != 0);
    }

}
class evenNum implements specialNum<Integer>
{
    @Override
    public boolean match(Integer t) {
        return (t % 2 == 0);
    }
}


class palindrome implements specialNum<String>
{
    @Override
    public boolean match(String t)
    {
        String rev = "";
        for (int i = t.length() - 1; i >= 0; i--)
        {
            rev = rev + t.charAt(i);
        }

        if (t.equals(rev)) {
            return true;
        }
        return false;

    }

}

class counting
{
    public <T> int count(List<T> list, specialNum<T> s)
    {
        int count=0;
        for(T type :list)
            if(s.match(type))
                count++;
        return count;
    }

}
