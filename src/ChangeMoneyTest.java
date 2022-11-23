import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class ChangeMoneyTest {


    String[] arrayString = {"один рубль","тринадцать рублей","сто пятьдесят четыре рубля","одна тысяча пятьсот сорок три рубля",
    "четыре тысячи один рубль","двенадцать тысяч четыреста пятьдесят два рубля", "сто одиннацать тысяч девятсот одиннадцать рублей"};
    int one = 1;
    int two = 123;
    int tree = 1543;

    String value = "один рубль";
    String values = "сто двадцать три рубля";
    String oneHundred = "одна тысяча пятьсот сорок три рубля";



@Test
public void testChangeAmount() throws Exception {
    assert(ChangeMoney.changeAmount(one).equals(value));
    assert(ChangeMoney.changeAmount(two).equals(values));
    assert(ChangeMoney.changeAmount(tree).equals(oneHundred));

}

    @ParameterizedTest
//    @ValueSource(ints= {1,13,154,1543,4001,12452,111911},strings = {"один рубль","тринадцать рублей","сто пятьдесят четыре рубля","одна тысяча пятьсот сорок три рубля",
//            "четыре тысячи один рубль","двенадцать тысяч четыреста пятьдесят два рубля", "сто одиннацать тысяч девятсот одиннадцать рублей"})
    @CsvSource({"1,один рубль", "2,два рубля"})
    public void testChangeAmountParametrizedTest(int number,String value) throws Exception {
        assert(ChangeMoney.changeAmount(number).equals(value));

    }


} 
