package com.be.kafkasample.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public abstract class CustomBaseEntity implements Serializable {

}
