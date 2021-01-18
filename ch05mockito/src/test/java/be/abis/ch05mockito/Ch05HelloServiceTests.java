package be.abis.ch05mockito;

import be.abis.ch05mockito.exception.NotBigEnoughException;
import be.abis.ch05mockito.model.Person;
import be.abis.ch05mockito.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
class Ch05HelloServiceTests {

    @Autowired
    private HelloService helloService;

    @Mock
    private Person mockPerson;

    @Test
    void sayHelloToJohn() throws NotBigEnoughException {
        when(mockPerson.calculateHeightInInches()).thenReturn(70.0);
        when(mockPerson.getFirstName()).thenReturn("John");
        helloService.sayHelloTo(mockPerson);
    }

    @Test
    void sayHelloToSandyThrowsException(){
        when(mockPerson.calculateHeightInInches()).thenReturn(62.9);
        assertThrows(NotBigEnoughException.class, ()-> {helloService.sayHelloTo(mockPerson);});
    }

}
