package com.dux.reminder.server.service;

import com.dux.reminder.server.entity.Remind;

import java.util.List;

/**
 * Created by DUX on 15.04.2016.
 */
public interface ReminderService {
    List<Remind> getAll();
    Remind getById(long id);
    Remind add(Remind remind);
    void deleteById(long id);
}
