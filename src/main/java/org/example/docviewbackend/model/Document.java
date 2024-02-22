package org.example.docviewbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data // getters and setters and to string
@AllArgsConstructor // constructor all parameters
@NoArgsConstructor // void constructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // identify among id objects
public class Document {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int idDocument;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false, length = 60)
    private String title;

}
