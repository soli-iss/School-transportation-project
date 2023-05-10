package app.core.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "transportations")
@ToString(exclude = "students")
@Builder
public class Transportation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int numBus;
    @OneToMany(mappedBy = "numBus")
    private List<Student> students;
}
