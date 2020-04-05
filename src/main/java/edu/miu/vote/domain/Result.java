<<<<<<< HEAD

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

=======
package edu.miu.vote.model;

import java.util.List;

public class Result {
    private List<Option> option;

    public Result () {}

    public List<Option> getOption() {
        return option;
    }

    public void setOption(List<Option> option) {
        this.option = option;
    }

    public String getResult() {
        return "";
    }

    public int tallyScore() {
        return 0;
    }

    public String getWinner() {
        return "";
>>>>>>> 52699416a9e06704f984e8e0ffb616c298a35473
    }

}
