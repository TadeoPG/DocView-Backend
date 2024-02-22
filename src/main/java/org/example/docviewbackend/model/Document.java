package org.example.docviewbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getters and setters and to string
@AllArgsConstructor // constructor all parameters
@NoArgsConstructor // void constructor
public class Document {

    private String URL;
    private String title;
    
}
