package com.dux.reminder.server.service;

import com.dux.reminder.server.entity.Remind;
import com.dux.reminder.server.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DUX on 15.04.2016.
 */
@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private ReminderRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getById(long id) {
        return repository.getOne(id);
    }

    public Remind add(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void deleteById(long id) {
        repository.delete(id);
    }
}
