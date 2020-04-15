package com.viaank.kafkalearning.prod_cons;

import java.io.Serializable;

import lombok.Data;

@Data
public class SimpleModel implements Serializable {

	private static final long serialVersionUID = -8657995113967728065L;
	private String field1;
    private String field2;

}
