package edu.miu.vote.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Result {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String announcement;

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public Long getId() {
        return id;

    }


}
