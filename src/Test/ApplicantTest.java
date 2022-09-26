package Test;

import enums.Qualification;
import enums.Sex;
import models.Applicant;
import models.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, "rony123@gmail.com",
            Qualification.HND, 3, 86.0);
    Applicant applicant2 = new Applicant(2322, "John Banks", 25, Sex.MALE, "john123@gmail.com",
            Qualification.HND, 3, 83.5);


    @Test
    void applicantPassedExam() {

        String expected = "Passed";
        String actual = applicant1.takeExam();

        assertEquals(expected, actual);

    }


    @Test
    void applicantFailedExam() {

        String expected = "Failed";
        String actual = applicant2.takeExam();

        assertEquals(expected, actual);

    }
}