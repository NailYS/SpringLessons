package ru.YusupovSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("thisRockMusic")
public class RockMusic implements Music {
    @Override

    public String getSong() {
        List<String> rockList = new ArrayList<>();
        String musicList1 = "";
        rockList.add("Sector gaza");
        rockList.add("Alisa");
        rockList.add("Король и Шут");
        for (String out : rockList) {
            musicList1 += out;
        }
        return musicList1;
    }
}
