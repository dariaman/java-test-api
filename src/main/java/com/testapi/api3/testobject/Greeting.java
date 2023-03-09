package com.testapi.api3.testobject;

import lombok.Data;

@Data
public class Greeting {

    public Greeting() {
        Id = 1L;
        Content = "Halo guys";
    }

    Long Id;
    String Content;
}
