package security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.youness.trainingmanagementsystem.entities.*;
import com.youness.trainingmanagementsystem.repositories.EmployeeRepository;
import com.youness.trainingmanagementsystem.repositories.ManagerRepository;
import com.youness.trainingmanagementsystem.repositories.TeamLeaderRepository;
import com.youness.trainingmanagementsystem.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;



@Service
public class UserRegistrationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmployeeRepository employeeRepository;
    private final ManagerRepository managerRepository;
    private final TeamLeaderRepository teamLeaderRepository;

    @Autowired
    public UserRegistrationService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            EmployeeRepository employeeRepository,
            ManagerRepository managerRepository,
            TeamLeaderRepository teamLeaderRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.employeeRepository = employeeRepository;
        this.managerRepository = managerRepository;
        this.teamLeaderRepository = teamLeaderRepository;
    }

    public User registerEmployee(String email, String password, Role role) {
        String hashedPassword = passwordEncoder.encode(password);
        User user = new User();
        user.setEmail(email);
        user.setPassword(hashedPassword);
        user.setRole(role);
        user = userRepository.save(user);

        Employee employee = new Employee();
        employee.setUser(user);
        employeeRepository.save(employee);

        return user;
    }
    public User registerUser(String email, String password, Role role) {
        String hashedPassword = passwordEncoder.encode(password);
        User user = new User();
        user.setEmail(email);
        user.setPassword(hashedPassword);
        user.setRole(role);
        user = userRepository.save(user);
        return user;

    }

    public User registerManager(String email, String password, Role role) {
        String hashedPassword = passwordEncoder.encode(password);
        User user = new User();
        user.setEmail(email);
        user.setPassword(hashedPassword);
        user.setRole(role);
        user = userRepository.save(user);

        Manager manager = new Manager();
        manager.setUser(user);
        managerRepository.save(manager);

        return user;

    }

    public User registerTeamLeader(String email, String password, Role role) {
        String hashedPassword = passwordEncoder.encode(password);
        User user = new User();
        user.setEmail(email);
        user.setPassword(hashedPassword);
        user.setRole(role);
        user = userRepository.save(user);

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setUser(user);
        teamLeaderRepository.save(teamLeader);

        return user;
    }
}
