package com.danielfrak.code.keycloak.providers.rest.remote;

import java.util.Optional;

public interface LegacyUserService {

    Optional<LegacyUser> findByEmail(String email);

    Optional<LegacyUser> findByUsername(String username);

    boolean isPasswordValid(String userId, String username, String password);
}
