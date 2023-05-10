package app.core.repositories;

import app.core.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    boolean existsByStudentId(String studentId);

    List<Student> findAllByNumClass(int numClass);

    @Modifying
    @Query(value ="update `student` set isTravel = false  where id =?;", nativeQuery = true)
    void isNotTravel(int id);

    @Modifying
    @Query(value ="update `student` set isTravel = true  where id =?;", nativeQuery = true)
    void isTravel(int id);


    @Modifying
    @Query(value ="update `student` set cause = ?  where id =?;", nativeQuery = true)
    void whatCause(String cause ,int id);

    @Modifying
    @Query(value ="update `student` set hour = ?  where id =?;", nativeQuery = true)
    void whichHour(String hour ,int id);

    List<Student> findAllByNumBus(int bus);

}
