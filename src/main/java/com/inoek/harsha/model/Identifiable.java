package com.inoek.harsha.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class Identifiable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

}
