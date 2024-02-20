package lk.ijse.dep11.app.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.groups.Default;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto implements Serializable {
    @Null(message = "Id should be empty!")
    private Integer id;

    @NotBlank(message = "Description can not be empty!")
    private String description;

    @Null(message = "Status should be empty when create a task!", groups = Create.class)
    @NotNull(message = "Status should not be empty when updating a task!", groups = Update.class)
    private Boolean status;

    @Email
    @NotBlank(message = "Email can not be empty!", groups = Create.class)
    private String email;

    public interface Update extends Default {}
    public interface Create extends Default {}
}
