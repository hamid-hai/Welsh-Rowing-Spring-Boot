package nsa.group7.welshrowing.server;

import nsa.group7.welshrowing.domain.Athlete;
import nsa.group7.welshrowing.jpa.AthleteRepoJPA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.web.servlet.MockMvc;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class AthleteEntryFormTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldGetEntryForm() throws Exception {

        this.mockMvc
                .perform(get("/new-applicant"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("New Applicant")))
                .andExpect(content().string(containsString("Please enter your information to create an account.")));
    }
}
