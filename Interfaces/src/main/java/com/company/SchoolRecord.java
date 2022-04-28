package com.company;

import com.company.interfaces.Auditable;
import com.company.interfaces.Storable;

public class SchoolRecord implements Auditable, Storable {



    public void runAudit() {
        System.out.println("auditing");
    }


    public void sendAuditToState() {
        System.out.println("audit sent");
    }


    public void storeData() {
        System.out.println("storing data");
    }


    public void retrieveData() {
        System.out.println("retrieving data");
    }
}
