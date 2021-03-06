package com.om.springboot.dto.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessProfileDto {

    private Long userId;

    private String firstName;

    private String lastName;


    private String gender;

    private Date dob;

    private String country;

    private String countryCode;

    private String mobileNumber;



    private String emailId;


    private String company;


    private Long regId;

    private String gsaNumber;

    private Long employeeCount;

    private int isAdmin;

}
