package security;

import com.youness.trainingmanagementsystem.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    private String email;
    private String password;
    private Role role;
}
