package com.saimun.springboottesting1.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class ResponseDTO<T> {
	private ResponseStatus status;
	private ResponseMessage message;

	@JsonProperty("data")
	private T payload;

}
