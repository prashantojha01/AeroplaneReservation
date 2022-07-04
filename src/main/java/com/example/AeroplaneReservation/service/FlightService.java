package com.example.AeroplaneReservation.service;

        import com.example.AeroplaneReservation.exception.DoNotFoundException;
        import com.example.AeroplaneReservation.repository.FlightRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import com.example.AeroplaneReservation.dto.Flight;

        import java.sql.Date;
        import java.util.ArrayList;
        import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
    public List<Flight> findAllFlight(){
        List<Flight> flights= new ArrayList<>();
        while(flightRepository.findAll().iterator().hasNext()){
            flights.add(flightRepository.findAll().iterator().next());
        }
        return flights;
    }
    public Flight findFlight(int flightNumber){
        Flight flight=flightRepository.findById(flightNumber).get();
        if(flight==null) {
            System.out.println("flight with this id not found");
            throw new DoNotFoundException("100","Flight with this number doesn't exist: ");
        }
        return flight;
    }

    public List<Flight> searchFlightBetweenStation(String fromStation, String toStation, Date doj, int numberOfSeat){
        List<Flight> searchFlightList = new ArrayList<>();

        for(Flight t: flightRepository.findAll()){
            if(t.getFromStation().equals(fromStation) && t.getToStation().equals(toStation) &&
                    t.getDoj().equals(doj) && t.getSeatAvailable()>numberOfSeat){

                searchFlightList.add(t);
            }
            //System.out.println("from repo: "+t.getDoj()+" : from path : "+doj);

        }
        if(searchFlightList.size()==0){
            System.out.println("Sorry, no matching flight available for the search criteria");
            throw new IllegalArgumentException("No flight found");
        }else{
            System.out.println("Tr no.\\tFlight Name\tFrom Station\tTo Station\tDoj\tSeats Available\tfare");
            System.out.println();
            for(Flight t: searchFlightList){
                System.out.printf("%4d%20s%15s%15s%12s%4d%5d\n",t.getFlightNumber(),t.getFlightNumber(),t.getFromStation(),t.getToStation(),t.getDoj(),t.getSeatAvailable(),t.getFare());
            }
            return searchFlightList;
        }
    }


    public Flight bookFlight(int flight_number,int number_of_passenger) throws IllegalArgumentException{
        Flight flight= new Flight();
        if(findFlight(flight_number)==null)
        throw new NullPointerException("please check train number or number of seats");
        flight=findFlight(flight_number);
        flight.setSeatAvailable(flight.getSeatAvailable()-number_of_passenger);
        flightRepository.save(flight);
        System.out.println("Flight Booked for "+number_of_passenger+" passengers");
        System.out.println("Flight number "+flight_number+" and flight name "+flight.getFlightName());
        return flight;
    }
}
