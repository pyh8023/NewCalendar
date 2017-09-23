package com.example.administrator.newcalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CalendarView calendarView = (CalendarView) findViewById(R.id.id_calendar_view);
        calendarView.setDate(Arrays.asList("2","5","10","20"));
        calendarView.setCalendarListener(new CalendarListener(){

            @Override
            public void prevMonthListener(String year, String month) {
                calendarView.setDate(Arrays.asList("2","5","14","27"));
            }

            @Override
            public void nextMonthListener(String year, String month) {
                calendarView.setDate(Arrays.asList("2","4","12","26"));
            }
        });
    }
}
