package com.adl.javasbx.business.concrete;

import com.adl.javasbx.business.PseudoService;
import com.adl.javasbx.utils.Timer;
import org.springframework.stereotype.Service;

@Service
public class PseudoServiceImpl implements PseudoService {
    @Override
    public void getFoo() throws InterruptedException {

        Timer timer = new Timer("test");

        timer.start();

        Thread.sleep(5000);

        timer.stop();
    }
}
