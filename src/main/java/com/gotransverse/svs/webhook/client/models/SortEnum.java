/*
 * SVSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 12/15/2016
 */
package com.gotransverse.svs.webhook.client.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum SortEnum {
    TXN_ID, //TODO: Write general description for this element
    TXN_DATE, //TODO: Write general description for this element
    SOURCE_TYPE, //TODO: Write general description for this element
    SOURCE_ID; //TODO: Write general description for this element

    private static TreeMap<String, SortEnum> valueMap = new TreeMap<String, SortEnum>();
    private String value;

    static {
        TXN_ID.value = "txn_id";
        TXN_DATE.value = "txn_date";
        SOURCE_TYPE.value = "source_type";
        SOURCE_ID.value = "source_id";

        valueMap.put("txn_id", TXN_ID);
        valueMap.put("txn_date", TXN_DATE);
        valueMap.put("source_type", SOURCE_TYPE);
        valueMap.put("source_id", SOURCE_ID);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of SortEnum values to list of string values
     * @param toConvert The list of SortEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<SortEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (SortEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 