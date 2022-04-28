package com.company.inheritance;

public class App {

    public static void main(String[] args) {
        Developer dev1 = new Developer("Jennifer", 2020, "JavaScript");
        Developer dev2 = new Developer("Hoa", 2021, "JavaScript");

        TeamLead teamLead = new TeamLead();
        teamLead.setName("Honorine");
        teamLead.setHireYear(1981);
        teamLead.setPreferredProgrammingLanguage("Java");

        dev1.estimateStoryPoints();
        dev2.checkInCode();

        teamLead.assignWork(dev1);
        teamLead.estimateStoryPoints();
    }
}
