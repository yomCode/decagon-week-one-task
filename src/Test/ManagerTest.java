package Test;

import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.Applicant;
import models.Manager;
import models.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void hireCashier() {
        Staff manager = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com", Role.MANAGER);
        Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, "rony123@gmail.com",
                Qualification.HND, 3);

        applicant1.setExamScore(86.0);



//        assertEquals(actual, expected);

    }
}