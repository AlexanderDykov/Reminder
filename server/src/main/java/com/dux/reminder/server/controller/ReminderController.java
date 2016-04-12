package com.dux.reminder.server.controller;

import com.dux.reminder.server.entity.Remind;
import com.dux.reminder.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by DUX on 08.04.2016.
 */
@RestController
@RequestMapping("/remind")
public class ReminderController {

    @Autowired
    private RemindRepository repository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(ModelMap model){
        List<Remind> list = repository.findAll();
        return mock();
    }

    private Remind mock() {
        Remind remind = new Remind();
        remind.setDate(new Date());
        remind.setTitle("Title");
        remind.setId(1L);
        return remind;
    }
}
