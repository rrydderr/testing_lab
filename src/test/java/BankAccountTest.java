import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class BankAccountTest {
    BankAccount bankAccount = new BankAccount(
            "Ryder",
            "Zane",
            LocalDate.of(2001,01,05),
            "234567",
            0.05
    );
}

}
