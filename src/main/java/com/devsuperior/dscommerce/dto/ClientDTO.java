package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;
import org.springframework.security.oauth2.server.authorization.settings.ConfigurationSettingNames;

public class ClientDTO {

    private Long id;
    private String name;

    public ClientDTO(){

    }

    public ClientDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClientDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
