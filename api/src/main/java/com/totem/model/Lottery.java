package com.totem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by haojianmeng on 2017/3/6.
 */
@Entity
public class Lottery {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String lottery_no;
    private BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLottery_no() {
        return lottery_no;
    }

    public void setLottery_no(String lottery_no) {
        this.lottery_no = lottery_no;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
