package au.com.heritage.product.model;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.*;


/**
 * Defines the sub-tier criteria and conditions for which a
 * rate applies
 */
@Entity
public class BankingProductRateTierSubTier {

	@Id @GeneratedValue(generator="system-uuid") @Hidden
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(length=32)
    private String rateSubTierId;

    /**
     * A display name for the tier
     */
    private String name;

    /**
     * The unit of measure that applies to the tierValueMinimum and
     * tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case
     * of term deposit tiers), 'PERCENT' (in the case of
     * loan-to-value ratio or LVR)
     */
    private UnitOfMeasure unitOfMeasure;

    /**
     * The number of tierUnitOfMeasure units that form the lower
     * bound of the tier. The tier should be inclusive of this
     * value
     */
    private BigDecimal minimumValue;

    /**
     * The number of tierUnitOfMeasure units that form the upper
     * bound of the tier or band. For a tier with a discrete value
     * (as opposed to a range of values e.g. 1 month) this must be
     * the same as tierValueMinimum. Where this is the same as the
     * tierValueMinimum value of the next-higher tier the
     * referenced tier should be exclusive of this value. For
     * example a term deposit of 2 months falls into the upper tier
     * of the following tiers: (1 – 2 months, 2 – 3 months)
     */
    private BigDecimal maximumValue;

    /**
     * The method used to calculate the amount to be applied using
     * one or more tiers. A single rate may be applied to the
     * entire balance or each applicable tier rate is applied to
     * the portion of the balance that falls into that tier
     * (referred to as 'bands' or 'steps')
     */
    private RateApplicationMethod rateApplicationMethod;

    @ManyToOne
    private BankingProductRateCondition applicabilityConditions;

    public String getRateSubTierId() {
        return rateSubTierId;
    }

    public void setRateSubTierId(String rateSubTierId) {
        this.rateSubTierId = rateSubTierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public BigDecimal getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(BigDecimal minimumValue) {
        this.minimumValue = minimumValue;
    }

    public BigDecimal getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(BigDecimal maximumValue) {
        this.maximumValue = maximumValue;
    }

    public RateApplicationMethod getRateApplicationMethod() {
        return rateApplicationMethod;
    }

    public void setRateApplicationMethod(RateApplicationMethod rateApplicationMethod) {
        this.rateApplicationMethod = rateApplicationMethod;
    }

    public BankingProductRateCondition getApplicabilityConditions() {
        return applicabilityConditions;
    }

    public void setApplicabilityConditions(BankingProductRateCondition applicabilityConditions) {
        this.applicabilityConditions = applicabilityConditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankingProductRateTierSubTier that = (BankingProductRateTierSubTier) o;
        return Objects.equals(rateSubTierId, that.rateSubTierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateSubTierId);
    }

    @Override
    public String toString() {
        return "BankingProductRateTierSubTier{" +
            "rateSubTierId='" + rateSubTierId + '\'' +
            ", name='" + name + '\'' +
            ", unitOfMeasure=" + unitOfMeasure +
            ", minimumValue=" + minimumValue +
            ", maximumValue=" + maximumValue +
            ", rateApplicationMethod=" + rateApplicationMethod +
            ", applicabilityConditions=" + applicabilityConditions +
            '}';
    }


    public enum RateApplicationMethod {
        WHOLE_BALANCE,
        PER_TIER
    }

    public enum UnitOfMeasure {
        DOLLAR,
        PERCENT,
        MONTH,
        DAY
    }
}
