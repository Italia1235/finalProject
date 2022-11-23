import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ChangeMoneyTest {


    String[] arrayString = {"один рубль", "тринадцать рублей", "сто пятьдесят четыре рубля", "одна тысяча пятьсот сорок три рубля",
            "четыре тысячи один рубль", "двенадцать тысяч четыреста пятьдесят два рубля", "сто одиннацать тысяч девятсот одиннадцать рублей"};
    int one = 1;
    int two = 123;
    int tree = 1543;
    int userNumber;
    String expectedResult;
    String value = "один рубль";
    String values = "сто двадцать три рубля";
    String oneHundred = "одна тысяча пятьсот сорок три рубля";


//    @Test
//    public void testChangeAmount() throws Exception {
//        assert (ChangeMoney.changeAmount(one).equals(value));
//        assert (ChangeMoney.changeAmount(two).equals(values));
//        assert (ChangeMoney.changeAmount(tree).equals(oneHundred));
//
//    }
    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method


    public ChangeMoneyTest(Integer userNumber, String expectedResult) {
        this.userNumber = userNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {1, "один рубль"},
                {13, "тринадцать рублей"},
                {154, "сто пятьдесят четыре рубля"},
                {1543, "одна тысяча пятьсот сорок три рубля"}

        });
    }

    @Test
//@ValueSource(ints= {1,13,154,1543,4001,12452,111911},strings = {"один рубль","тринадцать рублей","сто пятьдесят четыре рубля","одна тысяча пятьсот сорок три рубля"})
//            "четыре тысячи один рубль","двенадцать тысяч четыреста пятьдесят два рубля", "сто одиннацать тысяч девятсот одиннадцать рублей"})
    // @CsvSource({"1,один рубль", "2,два рубля"})
    public void testChangeAmountParametrizedTest() throws Exception {
        assert (ChangeMoney.changeAmount(userNumber).equals(expectedResult));

    }


} 
