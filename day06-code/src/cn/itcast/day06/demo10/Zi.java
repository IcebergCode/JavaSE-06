package cn.itcast.day06.demo10;

public class Zi extends Fu {
    int num = 20;

    @Override               //覆盖重写
    public void method(){
        super.method(); //调用了父类的方法
        System.out.println("子类方法");
    }

    public void show(){
        int num = 30;
        System.out.println(num);    //30
        System.out.println(this.num);   //20
        System.out.println(super.num);  //10
    }
}
