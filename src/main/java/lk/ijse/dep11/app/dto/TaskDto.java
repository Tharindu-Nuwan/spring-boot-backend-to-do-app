package lk.ijse.dep11.app.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto implements Serializable {

    private Integer id;
    private String description;
    private Boolean status;
    private String email;
}
