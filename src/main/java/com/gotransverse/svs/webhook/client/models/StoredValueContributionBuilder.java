/*
 * SVSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 12/15/2016
 */
package com.gotransverse.svs.webhook.client.models;

import java.util.*;

public class StoredValueContributionBuilder {
    //the instance to build
    private StoredValueContribution storedValueContribution;

    /**
     * Default constructor to initialize the instance
     */
    public StoredValueContributionBuilder() {
        storedValueContribution = new StoredValueContribution();
    }

    /**
     * The granted value of contribution.  Draw downs occur off of this value.  Can be negative.
     */
    public StoredValueContributionBuilder orderGrantedValue(Double orderGrantedValue) {
        storedValueContribution.setOrderGrantedValue(orderGrantedValue);
        return this;
    }

    /**
     * The ordered (or "invoiced" or "sold") amount of contribution.  Can be negative.  Can be different (usually less) than the granted_amount.
     */
    public StoredValueContributionBuilder orderedAmount(Double orderedAmount) {
        storedValueContribution.setOrderedAmount(orderedAmount);
        return this;
    }

    /**
     * The list of the granted value of contribution.
     */
    public StoredValueContributionBuilder listGrantedValue(Double listGrantedValue) {
        storedValueContribution.setListGrantedValue(listGrantedValue);
        return this;
    }

    /**
     * The original (or "list price" or "msrp") amount of the contribution.  Can be negative.
     */
    public StoredValueContributionBuilder listAmount(Double listAmount) {
        storedValueContribution.setListAmount(listAmount);
        return this;
    }

    /**
     * A source id for this transaction.
     */
    public StoredValueContributionBuilder sourceId(String sourceId) {
        storedValueContribution.setSourceId(sourceId);
        return this;
    }

    /**
     * The type of record that this source correpsonds to.
     */
    public StoredValueContributionBuilder sourceType(String sourceType) {
        storedValueContribution.setSourceType(sourceType);
        return this;
    }

    /**
     * A source description for this transaction.
     */
    public StoredValueContributionBuilder sourceDescription(String sourceDescription) {
        storedValueContribution.setSourceDescription(sourceDescription);
        return this;
    }

    /**
     * The date this transaction is effective.  Can be in the past.
     */
    public StoredValueContributionBuilder effectiveDate(Date effectiveDate) {
        storedValueContribution.setEffectiveDate(effectiveDate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StoredValueContribution build() {
        return storedValueContribution;
    }
}