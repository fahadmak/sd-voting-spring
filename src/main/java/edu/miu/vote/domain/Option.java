<<<<<<< HEAD
package edu.miu.vote.domain;

import javax.persistence.Embeddable;

@Embeddable
public interface Option {
=======
package edu.miu.vote.model;

public interface Option {
    public int getScore();
    public String getWinner();
>>>>>>> 52699416a9e06704f984e8e0ffb616c298a35473
}
