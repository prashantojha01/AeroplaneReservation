package com.example.AeroplaneReservation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_number")
    private int flightNumber;
    @Column(name = "flight_name")
    private String flightName;
    @Column(name = "from_station")
    private String fromStation;
    @Column(name = "to_station")
    private String toStation;
    @Column(name = "seat_available")
    private int seatAvailable;
    @Column(name = "fare")
    private int fare;
    @Column(name = "doj")
    private Date doj;

    public Flight() {
    }

    public Flight(int flightNumber, String flightName, String fromStation, String toStation, int seatAvailable, int fare, Date doj) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.seatAvailable = seatAvailable;
        this.fare = fare;
        this.doj = doj;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", flightName='" + flightName + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", seatAvailable=" + seatAvailable +
                ", fare=" + fare +
                ", doj=" + doj +
                '}';
    }
}
