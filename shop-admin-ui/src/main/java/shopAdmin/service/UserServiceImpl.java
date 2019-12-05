package shopAdmin.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import persist.model.User;
import repo.UserRepository;
import shopAdmin.controllers.repr.UserRepr;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void save(UserRepr userRepr) {
        User user = new User();
        user.setId(userRepr.getId());
        user.setUserName(userRepr.getUsername());
        user.setPassword(passwordEncoder.encode(userRepr.getPassword()));
        userRepository.save(user);
    }


    @Override
    public List<UserRepr> findAll() {
        return userRepository.findAll().stream()
                .map(UserRepr::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserRepr> findById(Long id) {
        return userRepository.findById(id).map(UserRepr::new);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}

