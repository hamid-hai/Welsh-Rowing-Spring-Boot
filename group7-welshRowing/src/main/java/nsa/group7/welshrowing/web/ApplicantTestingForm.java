package nsa.group7.welshrowing.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nsa.group7.welshrowing.domain.Athlete;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ApplicantTestingForm {
    /**
     * The test ID.
     */
    private Long athleteTestID;
    /**
     * The ID of the athlete completing the test.
     */
    private Long athleteID;
    /**
     * The date of the test.
     */
    @NotBlank(message = "Please enter the date of the test.")
    private String dateOfTest;
    /**
     * Any comments the coach wants to make about the athlete.
     */
    private String athleteComments;
    /**
     * Athletes legPress3Reps results.
     */
    private Integer legPress3Reps;
    /**
     * Athletes armPress3Reps results.
     */
    private Integer armPress3Reps;
    /**
     * Athletes armPull3Reps results.
     */
    private Integer armPull3Reps;
    /**
     * Athletes armPull3Reps results.
     */
    private Integer armPull15Reps;
    /**
     * Athletes score on Schwinn.
     */
    private Integer score;
    /**
     * Coaches observations under Schwinn.
     */
    private String observations;
    /**
     * The basic core of the athlete, marked as green, amber or red.
     */
    @NotBlank(message = "Please select an option.")
    private String basicCore;
    /**
     * Any notes the coach had on the athletes basic core.
     */
    private String bcNotes;
    /**
     * The flexibility of the athlete, marked as green, amber or red.
     */
    @NotBlank(message = "Please select an option.")
    private String flexibility;
    /**
     * Any notes the coach had on the athletes flexibility.
     */
    private String fNotes;
    /**
     * The result of an athlete being tested.
     */
    @NotBlank(message = "Please select an option.")
    private String postTestResult;
}
