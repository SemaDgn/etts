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
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false, length = 50)
    private String firstName;

    @Column( nullable = false, length = 50)
    private String lastName;

    @Column( nullable = false, length = 50)
    private String lDapUser;

    @Column( nullable = false)
    private boolean isManager;

    @Column( nullable = false)
    private Long managerId;

    @Column( nullable = false)
    private boolean isActive;

    @Column( name = "see_allusers",nullable = false)
    private  boolean  seeAllUsers;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "directorate_id")
    private DirectorateEntity directorate;
}
