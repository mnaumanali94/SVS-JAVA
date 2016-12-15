/*
 * SVSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 12/15/2016
 */
package com.gotransverse.svs.webhook.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ExportRegisterBalance 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5708873997580428574L;
    private String uuid;
    private Long registerId;
    private String registerType;
    private CurrencyEnum registerCurrency = CurrencyEnum.USD;
    private String registerUom;
    private Long registerAccountId;
    private String registerAccountNumber;
    private String registerCategory;
    private Double balanceAmount;
    private Integer balanceCount;
    private Double consumptionBalanceAmount;
    private Integer consumptionBalanceCount;
    private Double contributionBalanceAmount;
    private Integer contributionBalanceCount;
    private Double unallocatedConsumptionBalanceAmount;
    private Date asOfDate;
    /** GETTER
     * A unique identifier for this record.
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * A unique identifier for this record.
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
    /** GETTER
     * The internal register id for the register.
     */
    @JsonGetter("register_id")
    public Long getRegisterId ( ) { 
        return this.registerId;
    }
    
    /** SETTER
     * The internal register id for the register.
     */
    @JsonSetter("register_id")
    public void setRegisterId (Long value) { 
        this.registerId = value;
    }
 
    /** GETTER
     * The register type per the initial register setup.
     */
    @JsonGetter("register_type")
    public String getRegisterType ( ) { 
        return this.registerType;
    }
    
    /** SETTER
     * The register type per the initial register setup.
     */
    @JsonSetter("register_type")
    public void setRegisterType (String value) { 
        this.registerType = value;
    }
 
    /** GETTER
     * The currency code based upon ISO 4217
     */
    @JsonGetter("register_currency")
    public CurrencyEnum getRegisterCurrency ( ) { 
        return this.registerCurrency;
    }
    
    /** SETTER
     * The currency code based upon ISO 4217
     */
    @JsonSetter("register_currency")
    public void setRegisterCurrency (CurrencyEnum value) { 
        this.registerCurrency = value;
    }
 
    /** GETTER
     * The register's unit of measure
     */
    @JsonGetter("register_uom")
    public String getRegisterUom ( ) { 
        return this.registerUom;
    }
    
    /** SETTER
     * The register's unit of measure
     */
    @JsonSetter("register_uom")
    public void setRegisterUom (String value) { 
        this.registerUom = value;
    }
 
    /** GETTER
     * The register's external account id.
     */
    @JsonGetter("register_account_id")
    public Long getRegisterAccountId ( ) { 
        return this.registerAccountId;
    }
    
    /** SETTER
     * The register's external account id.
     */
    @JsonSetter("register_account_id")
    public void setRegisterAccountId (Long value) { 
        this.registerAccountId = value;
    }
 
    /** GETTER
     * The register's external account number.
     */
    @JsonGetter("register_account_number")
    public String getRegisterAccountNumber ( ) { 
        return this.registerAccountNumber;
    }
    
    /** SETTER
     * The register's external account number.
     */
    @JsonSetter("register_account_number")
    public void setRegisterAccountNumber (String value) { 
        this.registerAccountNumber = value;
    }
 
    /** GETTER
     * The category of the register associated with this balance
     */
    @JsonGetter("register_category")
    public String getRegisterCategory ( ) { 
        return this.registerCategory;
    }
    
    /** SETTER
     * The category of the register associated with this balance
     */
    @JsonSetter("register_category")
    public void setRegisterCategory (String value) { 
        this.registerCategory = value;
    }
 
    /** GETTER
     * The total amount of the balance on the register
     */
    @JsonGetter("balance_amount")
    public Double getBalanceAmount ( ) { 
        return this.balanceAmount;
    }
    
    /** SETTER
     * The total amount of the balance on the register
     */
    @JsonSetter("balance_amount")
    public void setBalanceAmount (Double value) { 
        this.balanceAmount = value;
    }
 
    /** GETTER
     * The total number of transactions on the register
     */
    @JsonGetter("balance_count")
    public Integer getBalanceCount ( ) { 
        return this.balanceCount;
    }
    
    /** SETTER
     * The total number of transactions on the register
     */
    @JsonSetter("balance_count")
    public void setBalanceCount (Integer value) { 
        this.balanceCount = value;
    }
 
    /** GETTER
     * The total amount of the consumption balance on the register
     */
    @JsonGetter("consumption_balance_amount")
    public Double getConsumptionBalanceAmount ( ) { 
        return this.consumptionBalanceAmount;
    }
    
    /** SETTER
     * The total amount of the consumption balance on the register
     */
    @JsonSetter("consumption_balance_amount")
    public void setConsumptionBalanceAmount (Double value) { 
        this.consumptionBalanceAmount = value;
    }
 
    /** GETTER
     * The total number of consumption transactions on the register
     */
    @JsonGetter("consumption_balance_count")
    public Integer getConsumptionBalanceCount ( ) { 
        return this.consumptionBalanceCount;
    }
    
    /** SETTER
     * The total number of consumption transactions on the register
     */
    @JsonSetter("consumption_balance_count")
    public void setConsumptionBalanceCount (Integer value) { 
        this.consumptionBalanceCount = value;
    }
 
    /** GETTER
     * The total amount of the contribution balance on the register
     */
    @JsonGetter("contribution_balance_amount")
    public Double getContributionBalanceAmount ( ) { 
        return this.contributionBalanceAmount;
    }
    
    /** SETTER
     * The total amount of the contribution balance on the register
     */
    @JsonSetter("contribution_balance_amount")
    public void setContributionBalanceAmount (Double value) { 
        this.contributionBalanceAmount = value;
    }
 
    /** GETTER
     * The total number of contribution transactions on the register
     */
    @JsonGetter("contribution_balance_count")
    public Integer getContributionBalanceCount ( ) { 
        return this.contributionBalanceCount;
    }
    
    /** SETTER
     * The total number of contribution transactions on the register
     */
    @JsonSetter("contribution_balance_count")
    public void setContributionBalanceCount (Integer value) { 
        this.contributionBalanceCount = value;
    }
 
    /** GETTER
     * The total amount of unallocated consumption on the register
     */
    @JsonGetter("unallocated_consumption_balance_amount")
    public Double getUnallocatedConsumptionBalanceAmount ( ) { 
        return this.unallocatedConsumptionBalanceAmount;
    }
    
    /** SETTER
     * The total amount of unallocated consumption on the register
     */
    @JsonSetter("unallocated_consumption_balance_amount")
    public void setUnallocatedConsumptionBalanceAmount (Double value) { 
        this.unallocatedConsumptionBalanceAmount = value;
    }
 
    /** GETTER
     * The unallocated date based upon the business entity's timezone in YYYY-MM-DD format.
     */
    @JsonGetter("as_of_date")
    public Date getAsOfDate ( ) { 
        return this.asOfDate;
    }
    
    /** SETTER
     * The unallocated date based upon the business entity's timezone in YYYY-MM-DD format.
     */
    @JsonSetter("as_of_date")
    public void setAsOfDate (Date value) { 
        this.asOfDate = value;
    }
 
}
 