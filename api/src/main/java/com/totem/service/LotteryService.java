package com.totem.service;

import com.totem.dao.LotteryRepository;
import com.totem.model.Lottery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by haojianmeng on 2017/3/6.
 */
@Service("lotteryService")
public class LotteryService {

    @Resource(name = "lotteryRepository")
    private LotteryRepository lotteryRepository;
    public boolean commit(){

        Lottery lottery = new Lottery();
        lotteryRepository.save(lottery);
        return true;
    }
}
