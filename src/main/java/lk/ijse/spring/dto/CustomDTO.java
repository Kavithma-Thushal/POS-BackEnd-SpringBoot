package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Kavithma Thushal
 * @project : SpringBoot-POS
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomDTO {
    private String value;
    private int count;

    public CustomDTO(String lastIndex) {
        this.value = lastIndex;
    }

    public CustomDTO(int count) {
        this.count = count;
    }
}