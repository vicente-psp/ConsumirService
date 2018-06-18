package entidade;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Restrictions {

    @SerializedName("refundable")
    @Expose
    private Boolean refundable;
    @SerializedName("change_penalties")
    @Expose
    private Boolean changePenalties;

    public Boolean getRefundable() {
        return refundable;
    }

    public void setRefundable(Boolean refundable) {
        this.refundable = refundable;
    }

    public Boolean getChangePenalties() {
        return changePenalties;
    }

    public void setChangePenalties(Boolean changePenalties) {
        this.changePenalties = changePenalties;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("refundable", refundable).append("changePenalties", changePenalties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(refundable).append(changePenalties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restrictions) == false) {
            return false;
        }
        Restrictions rhs = ((Restrictions) other);
        return new EqualsBuilder().append(refundable, rhs.refundable).append(changePenalties, rhs.changePenalties).isEquals();
    }

}