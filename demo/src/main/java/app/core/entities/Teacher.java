package app.core.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "teachers")
@ToString(exclude = "students")
@Builder
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String phone;
    private int numClass;
    @Column(nullable = false)
    private String password;
//    @ManyToOne
//    @JoinColumn(name="")
//    private WeeklySystem weeklySystem ;

//    @JsonIgnore
//    @OneToOne
//    @JoinTable(name = "transportation_teachers", joinColumns = @JoinColumn(name = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "transportation_id"))
//    private Transportation transportation ;
//    @JsonIgnore
//    @OneToMany(mappedBy = "student")
//    private List<Student> students;///

    public enum Day{

    }

}




// soli
//package app.core.entities;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//public class Teachers {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(nullable = false)
//    private String lastName;
//
//    @Column(nullable = false)
//    private String firstName;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column(unique = true,nullable = false)
//    private int phoneNumber;
//
//    @Column(nullable = false)
//    private int classNumber ;
//
//
//
//}
