package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean==bean1);



        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getName());
        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getName());
        System.out.println(bean2 == bean3);

    }
}



//Жогорудагы ссылка менен кирип проектти кочурунуз
//
//1) Cat деген POJO класс тузунуз
//2) AppConfig класстын ичинде cat деген класска бин тузунуз
//3) Ал бинди ар бир чакырганда жаны объект тузуло тургандай кылып настройка кылыныз
//4) App классында HelloWorldду дагы бир жолу жана Catти эки жолу чакырыныз. Аларды ссылкасы менен салыштырып коруп жообун консольго чыгарыныз.
//5) Тестти комментарийден чыгарып иштетип корунуз