package one.digitalInnovation.personAPIElcioHatiya.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalInnovation.personAPIElcioHatiya.enums.PhoneType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Person {

    private Long id;
    private PhoneType type;
    private String number;

}
