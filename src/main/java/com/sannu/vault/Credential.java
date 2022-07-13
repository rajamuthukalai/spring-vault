package com.sannu.vault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties("db")
public class Credential {

    private String username;

    private String password;
}