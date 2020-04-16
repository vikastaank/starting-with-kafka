package com.viaank.kafkalearning.prod_cons;

import java.io.Serializable;

import lombok.Data;

@Data
public class MoreSimpleModel implements Serializable {

	private static final long serialVersionUID = 5959299425588899066L;
	private String title;
    private String description;

}
