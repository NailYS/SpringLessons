package ru.YusupovSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thisComputer")
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
}
