package ru.YusupovSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//
//@Component("thisClassicalMusic")

@Component("thisClassicalMusic")
@Scope("prototype")
public class ClasscialMusic implements Music {


    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my Destruction");
    }


    @Override
    public String getSong() {

        List<String> classicalList = new ArrayList<>();
        String musicList = "";
        classicalList.add(" Не улетай");
        classicalList.add(" Вдоль ночных дорог");
        classicalList.add(" Не надо стеснятся");
        for (String out : classicalList) {
            musicList += out;
        }
        return musicList;
    }
}