package com.epam.webdev.task2;

import java.io.Serializable;
import java.time.Month;
import java.util.Objects;

public class Date implements Serializable {

    private int year;
    private Month month;

    public Date(int year, Month month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws NegativeYearException {

        if(year < 0) {
            throw new NegativeYearException();
        }

        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return getYear() == date.getYear() &&
                getMonth() == date.getMonth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth());
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "year=" + year +
                ", month=" + month;
    }
}
