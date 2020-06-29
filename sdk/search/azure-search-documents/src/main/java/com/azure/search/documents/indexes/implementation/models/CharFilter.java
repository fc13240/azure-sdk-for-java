// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The CharFilter model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@odata\\.type",
        defaultImpl = CharFilter.class)
@JsonTypeName("CharFilter")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.MappingCharFilter", value = MappingCharFilter.class),
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.PatternReplaceCharFilter",
            value = PatternReplaceCharFilter.class)
})
@JsonFlatten
@Fluent
public class CharFilter {
    /*
     * The name of the char filter. It must only contain letters, digits,
     * spaces, dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of CharFilter class. */
    @JsonCreator
    public CharFilter(@JsonProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the char filter. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the char filter. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @param name the name value to set.
     * @return the CharFilter object itself.
     */
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model CharFilter");
        }
    }
}
