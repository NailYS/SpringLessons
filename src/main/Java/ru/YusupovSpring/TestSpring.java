package ru.YusupovSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.StringContent;


enum MyEnum {
    CLASSICAl,
    ROCK
}

public class TestSpring {
    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.CLASSICAl;


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //Spring Framework читает файл конфигурации(applicationContext.xml) помещает в контейнер ClassPathXmlApplicationContext

        MusicPlayer musicPlayer = context.getBean("thisMusicPlayer", MusicPlayer.class);
//        Computer computer = context.getBean("thisComputer", Computer.class);
//        Music music = context.getBean("thisRockMusic", RockMusic.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        ClasscialMusic classcialMusic = context.getBean("musicBean", ClasscialMusic.class);
        // C контейнера мы получаем bean(Объект) и вызываем у него метод getBean()
//        MusicPlayer musicPlayer = new MusicPlayer(music); //IoC

//        System.out.println(computer.toString(musicPlayer));
//        musicPlayer.playMusic();

        System.out.println(musicPlayer.playMusic(myEnum));
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClasscialMusic classcialMusic = context.getBean("thisClassicalMusic", ClasscialMusic.class);
        ClasscialMusic classcialMusic1 = context.getBean("thisClassicalMusic", ClasscialMusic.class);

        System.out.println(classcialMusic1 == classcialMusic);
        context.close();
    }
}