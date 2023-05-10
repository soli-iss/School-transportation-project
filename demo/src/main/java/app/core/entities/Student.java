package app.core.entities;
import lombok.*;
import jakarta.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "students")
@ToString(exclude = "teacher")
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    private String studentId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String phone;
    private int numClass;
    @ManyToOne
    @JoinColumn(name="school_id")
    private School school;
    @Column(nullable = false)
    private boolean isTravel;
    private Cause cause;
    @Column(nullable = false)
    private String pickupAddress;
    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Transportation numBus;
    @Column(nullable = false)
    private Hour hour;
    private String remark;
//    @ManyToOne
//    @JoinColumn(name = "teacher_id")
//    private Teacher teacher;

    public  enum  Hour{
        THIRTEEN, SIXTEEN;
    }

    public  enum  Cause{
        RELEASE, ABSENCE, OTHER;
    }
}


