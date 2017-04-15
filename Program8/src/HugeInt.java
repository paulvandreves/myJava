import java.util.Scanner;
class HugeInt
{
    int[] array=new int[40];
    void parse(String str)
    {
        for(int i=0;i<40;i++)
        {
            char ch=str.charAt(i);
            int ie=Integer.parseInt(String.valueOf(ch));
            array[i]=ie;
        }
    }
    public String toString()
    {
        String str="";
        for(int i=0;i<40;i++)
            str=str.concat(String.valueOf(array[i]));
        return str;
    }
    HugeInt add(HugeInt hi)
    {
        HugeInt hi1=new HugeInt();
        int c=0;
        for(int i=39;i>=0;i--)
        {
            hi1.array[i]=array[i]+hi.array[i]+c;
            if(hi1.array[i]>9)
            {
                hi1.array[i]%=10;
                c=1;
            }
            else
                c=0;
        }
        return hi1;
    }
    HugeInt subtract(HugeInt hi)
    {
        HugeInt hi1=new HugeInt();
        int c=0,a=0;
        for(int i=39;i>=0;i--,c=0)
        {
            if(array[i]<hi.array[i])
                c=10;
            hi1.array[i]=(c+array[i]-a)-hi.array[i];
            if(array[i]<hi.array[i])
                a=1;
            else
                a=0;
        }
        return hi1;


    }
    String isEqualTo(HugeInt hi)
    {
        for(int i=0;i<40;i++)
            if(array[i]!=hi.array[i])
                return "false";
        return "true";
    }
    String isNotEqualTo(HugeInt hi)
    {
        for(int i=0;i<40;i++)
            if(array[i]==hi.array[i])
                return "false";
        return "true";
    }
    String isGreaterThan(HugeInt hi)
    {
        int n=0;
        for(int i=0;i<40;i++)
        {
            if(array[i]<hi.array[i])
                return "false";
            if(array[i]==hi.array[i])
                n++;
        }
        if(n==40)
            return "false";
        return "true";
    }
    String isLessThan(HugeInt hi)
    {
        int n=0;
        for(int i=0;i<40;i++)
        {
            if(array[i]>hi.array[i])
                return "false";
            if(array[i]==hi.array[i])
                n++;
        }
        if(n==40)
            return "false";
        return "true";
    }
    String isGreaterThanOrEqualTo(HugeInt hi)
    {
        for(int i=0;i<40;i++)
            if(array[i]<hi.array[i])
                return "false";
        return "true";
    }
    String isLessThanOrEqualTo(HugeInt hi)
    {
        for(int i=0;i<40;i++)
            if(array[i]>hi.array[i])
                return "false";
        return "true";
    }
}
class HugeIntTest
{
    public static void main(String[] args)
    {
        System.out.println("enter 40 digit positive integer 1:");
        HugeInt hi1=new HugeInt();
        Scanner s = new Scanner(System.in);
        hi1.parse(s.next());
        System.out.println(hi1.toString());
        System.out.println("enter 40 digit positive integer 2:");
        HugeInt hi2=new HugeInt();
        hi2.parse(s.next());
        HugeInt hi3=hi1.add(hi2);
        System.out.println(hi3.toString());
        System.out.println("enter 40 digit positive integer 3:");
        hi2=new HugeInt();
        hi2.parse(s.next());
        hi3=hi1.subtract(hi2);
        System.out.println(hi3.toString());
        System.out.println("integer1 = integer2:"+hi1.isEqualTo(hi2));
        System.out.println("integer1 != integer2:"+hi1.isNotEqualTo(hi2));
        System.out.println("integer1 > integer2:"+hi1.isGreaterThan(hi2));
        System.out.println("integer1 < integer2:"+hi1.isLessThan(hi2));
        System.out.println("integer1 >= integer2:"+hi1.isGreaterThanOrEqualTo(hi2));
        System.out.println("integer1 <= integer2:"+hi1.isLessThanOrEqualTo(hi2));

    }
}