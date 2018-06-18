package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.print.attribute.standard.Destination;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Flight {

    @SerializedName("departs_at")
    @Expose
    private String departsAt;
    @SerializedName("arrives_at")
    @Expose
    private String arrivesAt;
    @SerializedName("origin")
    @Expose
    private Origin origin;
    @SerializedName("destination")
    @Expose
    private Destination destination;
    @SerializedName("marketing_airline")
    @Expose
    private String marketingAirline;
    @SerializedName("operating_airline")
    @Expose
    private String operatingAirline;
    @SerializedName("flight_number")
    @Expose
    private String flightNumber;
    @SerializedName("aircraft")
    @Expose
    private String aircraft;
    @SerializedName("booking_info")
    @Expose
    private BookingInfo bookingInfo;

    public Flight(String departsAt, String arrivesAt, Origin origin, Destination destination, String marketingAirline, String operatingAirline, String flightNumber, String aircraft, BookingInfo bookingInfo) {
        this.departsAt = departsAt;
        this.arrivesAt = arrivesAt;
        this.origin = origin;
        this.destination = destination;
        this.marketingAirline = marketingAirline;
        this.operatingAirline = operatingAirline;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.bookingInfo = bookingInfo;
    }

    public String getDepartsAt() {
        return departsAt;
    }

    public void setDepartsAt(String departsAt) {
        this.departsAt = departsAt;
    }

    public String getArrivesAt() {
        return arrivesAt;
    }

    public void setArrivesAt(String arrivesAt) {
        this.arrivesAt = arrivesAt;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public String getMarketingAirline() {
        return marketingAirline;
    }

    public void setMarketingAirline(String marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public BookingInfo getBookingInfo() {
        return bookingInfo;
    }

    public void setBookingInfo(BookingInfo bookingInfo) {
        this.bookingInfo = bookingInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("departsAt", departsAt).append("arrivesAt", arrivesAt).append("origin", origin).append("destination", destination).append("marketingAirline", marketingAirline).append("operatingAirline", operatingAirline).append("flightNumber", flightNumber).append("aircraft", aircraft).append("bookingInfo", bookingInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(departsAt).append(arrivesAt).append(bookingInfo).append(aircraft).append(origin).append(flightNumber).append(operatingAirline).append(marketingAirline).append(destination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flight) == false) {
            return false;
        }
        Flight rhs = ((Flight) other);
        return new EqualsBuilder().append(departsAt, rhs.departsAt).append(arrivesAt, rhs.arrivesAt).append(bookingInfo, rhs.bookingInfo).append(aircraft, rhs.aircraft).append(origin, rhs.origin).append(flightNumber, rhs.flightNumber).append(operatingAirline, rhs.operatingAirline).append(marketingAirline, rhs.marketingAirline).append(destination, rhs.destination).isEquals();
    }

}