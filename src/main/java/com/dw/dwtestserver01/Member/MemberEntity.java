package com.dw.dwtestserver01.Member;

import com.dw.dwtestserver01.common.audit.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Data
@Entity(name="MEMBER")

public class MemberEntity extends Auditable {
    BigDecimal  newValue = new BigDecimal(Math.random());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MemberId;

    @Column(length = 15, nullable = false, unique = true)
    private String userId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    @DateTimeFormat
    private LocalDate birthDay;

    @Column(nullable = false)
    @DecimalMin(value = "0.1", inclusive = true)
    private BigDecimal  balanceDefault = newValue.setScale(2, RoundingMode.DOWN);

    @Column(nullable = false)
    @DecimalMax(value = "9.9", inclusive = true)
    private BigDecimal balanceRed = newValue.setScale(2, RoundingMode.DOWN);
}
