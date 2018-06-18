package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BookingInfo {

    @SerializedName("travel_class")
    @Expose
    private String travelClass;
    @SerializedName("booking_code")
    @Expose
    private String bookingCode;
    @SerializedName("seats_remaining")
    @Expose
    private Integer seatsRemaining;

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getSeatsRemaining() {
        return seatsRemaining;
    }

    public void setSeatsRemaining(Integer seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("travelClass", travelClass).append("bookingCode", bookingCode).append("seatsRemaining", seatsRemaining).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(travelClass).append(seatsRemaining).append(bookingCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BookingInfo) == false) {
            return false;
        }
        BookingInfo rhs = ((BookingInfo) other);
        return new EqualsBuilder().append(travelClass, rhs.travelClass).append(seatsRemaining, rhs.seatsRemaining).append(bookingCode, rhs.bookingCode).isEquals();
    }

}