package ru.ksutei.planner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ksutei.planner.util.Day;

@RestController
public class WeekDay {
    @GetMapping("/dayOfWeek")
    public String whatAWeekDay(@RequestParam("name") String dayString) {
        Day[] days = Day.values();
        for (Day day: days) {
            if (day.name().equals(dayString)){
                return String.format("Сегодня %s!", day.getRusName());
            }
        }
        return "";
    }
}
