package com.dw.dwtestserver01.Member;



import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.time.LocalDate;



public class MemberDto {
    BigDecimal  newValue = new BigDecimal(Math.random());
    @Getter
    public static class Post {
        BigDecimal  newValue = new BigDecimal(Math.random());
        @NotBlank
        private String userId;
        @NotBlank
        private String password;
        @NotBlank
        private String fullName;
        @NotBlank
        private String address;
        @DateTimeFormat
        private LocalDate birthDay;
        @DecimalMin(value = "0.1", inclusive = true)
        private BigDecimal  balanceDefault= newValue.setScale(2,RoundingMode.DOWN);
        @DecimalMax(value = "9.9", inclusive = true)
        private BigDecimal balanceRed= newValue.setScale(2,RoundingMode.DOWN);
       /* @DecimalMin(value = "0.1", inclusive = true)
        private BigDecimal  balanceDefault = newValue.setScale(2,RoundingMode.DOWN);
        @DecimalMax(value = "9.9", inclusive = true)
        private BigDecimal balanceRed = newValue.setScale(2, RoundingMode.DOWN);*/

    }
    @Data
    public static class Response {
        BigDecimal  newValue = new BigDecimal(Math.random());
        @NotBlank
        private String userId;
        @NotBlank
        private String password;
        @NotBlank
        private String fullName;
        @NotBlank
        private String address;
        @DateTimeFormat
        private LocalDate birthDay;
        @DecimalMin(value = "0.1", inclusive = true)
        private BigDecimal  balanceDefault= newValue.setScale(2,RoundingMode.DOWN);
        @DecimalMax(value = "9.9", inclusive = true)
        private BigDecimal balanceRed= newValue.setScale(2,RoundingMode.DOWN);
        /*@DecimalMin(value = "0.1", inclusive = true)
        private BigDecimal  balanceDefault = newValue.setScale(2,RoundingMode.DOWN);
        @DecimalMax(value = "9.9", inclusive = true)
        private BigDecimal balanceRed = newValue.setScale(2, RoundingMode.DOWN);*/
    }

    @Data
    public static class Get {
        @NotBlank
        private String userId;
        @NotBlank
        private String fullName;
        @NotBlank
        private String address;
        @DateTimeFormat
        private LocalDate birthDay;
    }

    @Data
    public static class Login {
        @NotBlank
        private String userId;
        @NotBlank
        private String password;
    }
}

