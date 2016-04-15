package com.dux.reminder.server.repository;

import com.dux.reminder.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DUX on 12.04.2016.
 */
public interface ReminderRepository extends JpaRepository<Remind,Long> {
    
}
