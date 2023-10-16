public class inheritance {
    int x= 5;

    void a(){
        System.out.println("void a");
    }
}

class example extends inheritance{
    int y =4;
    void b(){
        System.out.println("void b");
    }

    public static void main(String[]agrs){
        example ex = new example();
      //  inheritance nh = new inheritance();
        ex.a();
        ex.b();

    }
}
