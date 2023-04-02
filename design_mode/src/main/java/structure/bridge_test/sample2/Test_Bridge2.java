package structure.bridge_test.sample2;

import org.junit.Test;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/26 9:41
 */

/*
* 桥接模式使用对象见的组合关系解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。
所谓抽象和实现沿着各自维度的变化，即“子类化”它们，得到各个子类之后，便可以任意它们，从而获得不同路上的不同其次。
桥接模式有时候类似于多继承方案，但是多继承方案往往违背了SRP原则，复用性较差。桥接模式是比继承方案更好的解决方法。
桥接模式的应用一般在“两个非常强的变化维度”，有时候即使有两个变化的维度，但是某个方向的变化维度并不剧烈——换而言之两个变化不会导致纵横交错的结果，并不一定要使用桥接模式。
* */

//使用场景
//    1.交通工具在路上行驶，这里有两个维度的变化，首先交通工具的类型不同，其次路也分水泥路和柏油路。
//    2.判一个地方红烧肉的口味，这里出现了两个维度的变化：地域和餐馆品牌
//    3.农机在农田中作业，这里有两个维度的变化，不同的农机，不同的作业类型
//    4.不同的角色具有不同的权限，这里有两个维度的变化，不同的角色，不同的权限。
//    5.带有颜色的几何形状，


/*    现需要提供大中小3种型号的画笔，能够绘制5种不同颜色，
      如果使用蜡笔，我们需要准备3*5=15支蜡笔，也就是说必须准备15个具体的蜡笔类。
      而如果使用毛笔的话，只需要3种型号的毛笔，外加5个颜料盒，用3+5=8个类就可以实现15支蜡笔的功能。
      实际上，蜡笔和毛笔的关键一个区别就在于笔和颜色是否能够分离。
      即将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化"。
      关键就在于能否脱耦。蜡笔的颜色和蜡笔本身是分不开的，所以就造成必须使用15支色彩、大小各异的蜡笔来绘制图画。
      而毛笔与颜料能够很好的脱耦，各自独立变化，便简化了操作。
      在这里，抽象层面的概念是：“毛笔用颜料作画”，而在实现时，毛笔有大中小三号，颜料有红绿蓝黑白等5种，于是便可出现3×5种组合。
      每个参与者（毛笔与颜料）都可以在自己的自由度上随意转换。
      蜡笔由于无法将笔与颜色分离，造成笔与颜色两个自由度无法单独变化，使得只有创建15种对象才能完成任务。
        */
public class Test_Bridge2 {

    @Test
    public void test(){
        LinuxPlatform linuxPlatform = new LinuxPlatform(new MP4Vedio());
        Vedio vedio = linuxPlatform.openVedio();
        vedio.showVedio();

        System.out.println("---------------------------------------------");

        LinuxPlatform linuxPlatform1 = new LinuxPlatform(new FlvVedio());
        Vedio vedio1 = linuxPlatform1.openVedio();
        vedio1.showVedio();

        System.out.println("---------------------------------------------");

        AndroidPlatform androidPlatform = new AndroidPlatform(new MP4Vedio());
        Vedio vedio2 = androidPlatform.openVedio();
        vedio2.showVedio();
    }
}
