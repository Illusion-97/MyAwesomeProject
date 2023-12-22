package fr.dawan.business.auth;

import fr.dawan.business.user.User;
import fr.dawan.business.user.UserMapper;
import fr.dawan.business.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public void register(RegisterDto registerDto) {
        String encodedPassword = registerDto.getPassword();
        User newUser = new User(registerDto.getUsername(), registerDto.getEmail(), encodedPassword);
        repository.save(newUser);
    }

    @Override
    public LoginResponseDto login(LoginDto loginDto) throws Exception {
        User existingUser = repository.findByEmail(loginDto.getEmail()).orElse(null);
        if(existingUser == null) throw new Exception("User Not Found");
        String encodedPassword = loginDto.getPassword();
        if (!encodedPassword.equals(existingUser.getPassword())) throw new Exception("Invalid Password");
        String token = "token";
        return new LoginResponseDto(mapper.toDto(existingUser),token);
    }
}
