package com.microservices.demo.elastic.query.web.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ElasticQueryWebClientRequestModel {
    private String id;
    private String text;
}
