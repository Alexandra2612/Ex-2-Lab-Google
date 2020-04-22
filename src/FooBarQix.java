public class FooBarQix {
    public String compute(int x){
        String s=new String();
        int var=x;
        if(x%3==0)
            s=s+"Foo";
        if(x%5==0)
            s=s+"Bar";
        if(x%7==0)
            s=s+"Qix";
        while(x!=0) {
            if (x % 10 == 3)
                s=s+"Foo";
            else
                if (x % 10 == 5)
                    s=s+"Bar";
                else
                    if (x % 10 == 7)
                        s=s+"Qix";
            x = x / 10;
        }
        if(s.length()!=0)
            return s;
        else
            return var+"";
    }
}
