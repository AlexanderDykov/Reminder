package com.dux.reminder.server.controller;

import com.dux.reminder.server.entity.Remind;
import com.dux.reminder.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by DUX on 08.04.2016.
 */
@RequestMapping("/remind")
@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminderById(@PathVariable("id") long id) {
        return service.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Remind addReminder(@RequestBody Remind remind) {
        return service.add(remind);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteReminderById(@PathVariable("id") long id) {
        service.deleteById(id);
    }


}
