 class p {
    int x,y;
    p(int a, int b)
    {
        x=a; y=b;
    }
    void show()
    {
        System.out.println(x+""+y);
    }
}

class b{
    public static void main(String args[]){
        p r=new p(100,200);
        r.show();
    }
}
