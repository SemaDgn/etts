package com.definitions.definitions_service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "l_dap_user", nullable = false, length = 50)
    private String lDapUser;

    @Column(name = "is_manager", nullable = false)
    private Boolean isManager;
    @Column(name = "manager_id", nullable = false)
    private Long managerId;

    @Column(nullable = false)
    private boolean isActive;

    @Column(name = "can_view_all_users", nullable = false)
    private  boolean  canViewAllUsers;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "directorate_id")
    private Directorate directorate;
}
