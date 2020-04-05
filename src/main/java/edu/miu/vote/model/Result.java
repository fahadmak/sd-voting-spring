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
    }

}
