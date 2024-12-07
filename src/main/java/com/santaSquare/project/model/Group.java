package com.santaSquare.project.model;

import java.util.ArrayList;

public class Group {
    private long uuid;
    private User admin;
    private ArrayList<User> members;
    private Event currentEvent;
}
