package com.santaSquare.project.model;

import java.util.Date;
import java.util.List;

public class Event {
    private long uuid;
    private String name;
    private String description;
    private Group eventGroup;
    private String currency;
    private int budget;
    private boolean isAddressMandatory;
    private boolean isStarted;
    private Date scheduledDate;
    private List<UserMap> userMaps;
    private List<ExclusionMap> exclusionMaps;
}
