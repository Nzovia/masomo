package com.example.masomo.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Admins")
public class ExamsAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;
    @Column(name= "adminEmail",unique = true)
    private String email;
    private String name;
    @Column(name = "adminRole")
    private String managerialRole;
//    @OneToMany(mappedBy = "examsAdmin")
//    private List<Student> students;
}
