/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flecharoja.demo.timer.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Codecr
 */
@Stateless
public class DemoTimerService implements java.io.Serializable {
    private static final Logger LOG = Logger.getLogger(DemoTimerService.class.getName());
    
    @Schedule(month = "*", hour = "*", dayOfMonth = "*", year = "*", minute = "*/2", second = "*", persistent = false)
    public void myTimer() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        LOG.log(Level.WARNING, "Timer event: {0}", df.format(new Date()));
    }

  
}
