package com.example.application.dto;

import com.example.application.entities.Bookingdocument;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Bookingdocument}
 */
@Value
public class BookingdocumentDto implements Serializable {
    Integer id;
    @Size(max = 255)
    String name;
    @Size(max = 255)
    String type;
}