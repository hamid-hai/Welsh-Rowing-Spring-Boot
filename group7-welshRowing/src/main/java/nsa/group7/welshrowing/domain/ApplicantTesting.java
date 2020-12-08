package nsa.group7.welshrowing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nsa.group7.welshrowing.domain.Athlete;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AthleteTest")
public class ApplicantTesting {
    /**
     * The test ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long athleteTestID;
    /**
     * The ID of the athlete completing the test.
     */
    @ManyToOne
    @JoinColumn(name = "athleteID")
    private Athlete athleteID;
    /**
     * The date of the test.
     */
    @NotBlank
    private String dateOfTest;
    /**
     * Any comments the coach wants to make about the athlete.
     */
    @NotBlank
    private String athleteComments;
    /**
     * Athletes legPress3Reps results.
     */
    private int legPress3Reps;
    /**
     * Athletes armPress3Reps results.
     */
    private int armPress3Reps;
    /**
     * Athletes armPull3Reps results.
     */
    private int armPull3Reps;
    /**
     * Athletes armPull3Reps results.
     */
    private int armPull15Reps;
    /**
     * Athletes score on Schwinn.
     */
    private int score;
    /**
     * Coaches observations under Schwinn.
     */
    private String observations;
}