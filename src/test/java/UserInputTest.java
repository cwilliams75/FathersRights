import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserInputTest {

    //Actual user called testUser
    UserInput testUser = new UserInput("Corey","Williams","Bear","DE","19701","Aeiou1",1L);

    @Test
    public UserInput getTestUserTest() {
        return testUser;
    }
    @Test
    void getFirstNameTest() {
        //Expected
        String expected = "Corey";
        //Actual
        String actual = testUser.getFirstName();
        //Then
        assertEquals(expected, actual);


    }
    @Test
    void setFirstNameTest(){
        //Expected
        String expected = "newUsersFirstName";
        //Actual
        testUser.setFirstName(expected);
        String actual = testUser.getFirstName();
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void getLastNameTest() {
        //Expected
        String expected = "Williams";
        //Actual
        String actual = testUser.getLastName();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void setLastNameTest() {
        //Expected
        String expected = "newUsersLastName";
        //Actual
        testUser.setLastName(expected);
        String actual = testUser.getLastName();
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void getCityTest() {
        //Expected
        String expected = "Bear";
        //Actual
        String actual = testUser.getCity();
        //Then
        assertEquals(expected, actual);

    }

    @Test
    void setCityTest() {
        //Expected
        String expected = "newUsersCity";
        //Actual
        testUser.setCity(expected);
        String actual = testUser.getCity();
        //Then
        assertEquals(expected, actual);

    }
    @Test
    void getStateTest(){
        //Expected
        String expected = "DE";
        //Actual
        String actual = testUser.getState();
        //Then
        assertEquals(expected, actual);

    }
    @Test
    void setStateTest(){
        //Expected
        String expected = "newUsersState";
        //Actual
        testUser.setState(expected);
        String actual = testUser.getState();
        //Then
        assertEquals(expected, actual);

    }
    @Test
    void setZipCodeTest(){
        //Expected
        String expected = "newUsersZipcode";
        //Actual
        testUser.setZipCode(expected);
        String actual = testUser.getZipCode();
        //Then
        assertEquals(expected, actual);

    }
    @Test
    void getZipCodeTest(){
        //Expected
        String expected = "19701";
        //Actual
        String actual = testUser.getZipCode();
        //Then
        assertEquals(expected, actual);
    }
    @Test
    void setPassWordTest(){
        //Expected
        String expected = "newUsersPassWord";
        //Actual
        testUser.setPassWord(expected);
        String actual = testUser.getPassWord();
        //Then
        assertEquals(expected, actual);

    }
    @Test
    void getPassWordTest(){
        //Expected
        String expected = "Aeiou1";
        //Actual
        String actual = testUser.getPassWord();
        //Then
        assertEquals(expected, actual);
    }
    @Test
    void setUserIdTest(){
        //Expected
        Long expected = (1L);
        //Actual
        testUser.setUserId(expected);
        Long actual = testUser.getUserId();
        //Then
        assertEquals(expected, actual);

    }
    @Test
    void getUserIdTest(){
        //Expected
        Long expected = (1L);
        //Actual
        Long actual = testUser.getUserId();
        //Then
        assertEquals(expected, actual);

    }
}
