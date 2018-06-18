package modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ResultModelo {

    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("departure_date")
    @Expose
    private String departureDate;
    @SerializedName("return_date")
    @Expose
    private String returnDate;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("airline")
    @Expose
    private String airline;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).append("departureDate", departureDate).append("returnDate", returnDate).append("price", price).append("airline", airline).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(price).append(departureDate).append(returnDate).append(airline).append(destination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResultModelo) == false) {
            return false;
        }
        ResultModelo rhs = ((ResultModelo) other);
        return new EqualsBuilder().append(price, rhs.price).append(departureDate, rhs.departureDate).append(returnDate, rhs.returnDate).append(airline, rhs.airline).append(destination, rhs.destination).isEquals();
    }

}
