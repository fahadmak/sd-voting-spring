
package edu.miu.vote.domain;

import edu.miu.vote.model.Option;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Result {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String announcement;

    @ElementCollection
    List<Option> options; // implement it later

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
