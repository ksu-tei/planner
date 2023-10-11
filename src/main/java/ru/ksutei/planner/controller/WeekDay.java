package ru.ksutei.planner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ksutei.planner.util.Day;

import java.util.HashMap;

@RestController
public class WeekDay {
    @GetMapping("/dayOfWeek")
    public String whatAWeekDay(@RequestParam("name") String dayString) {
        HashMap<String, String> days = new HashMap<>();
        days.put("MONDAY", "Понедельник");
        days.put("FRIDAY", "Пятница");
        for (Object day: days.keySet()) {
            if (day.equals(dayString)){
                return String.format("Сегодня %s!", day);
            }
        }
        return "";
    }
}
