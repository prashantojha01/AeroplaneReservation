--CREATE TABLE flight (flight_number int, flight_name varchar(30), from_station varchar(40),
 --to_station varchar(40), seat_available int, fare int, doj date);
INSERT INTO journey.flight (flight_number, flight_name, from_station, to_station, seat_available, fare, doj)
VALUES (101, "Flight-One", "patna", "bangalore", 100, 800, "2022-07-01");
INSERT INTO journey.flight (flight_number, flight_name, from_station, to_station, seat_available, fare, doj)
VALUES (102, "Flight-two", "bangalore", "kolkata", 200, 600, "2022-07-01");
INSERT INTO journey.flight (flight_number, flight_name, from_station, to_station, seat_available, fare, doj)
VALUES (103, "Flight-three", "kolkata", "hydrabad", 300, 700, "2022-07-01");
INSERT INTO journey.flight (flight_number, flight_name, from_station, to_station, seat_available, fare, doj)
VALUES (104, "Flight-four", "hydrabad", "delhi", 400, 1000, "2022-07-01");
INSERT INTO journey.flight (flight_number, flight_name, from_station, to_station, seat_available, fare, doj)
VALUES (105, "Flight-five", "delhi", "patna", 500, 900, "2022-07-01");
