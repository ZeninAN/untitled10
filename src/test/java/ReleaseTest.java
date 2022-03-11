import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReleaseTest {

    @Test
    public void test() {
        Film first = new Film(1);
        Film second = new Film(2);
        Film third = new Film(3);
        Film four = new Film(4);
        Film fifth = new Film(5);
        Film six = new Film(6);
        Film seven = new Film(7);
        Film eight = new Film(8);
        Film nine = new Film(9);
        Film ten = new Film(10);

        Release rel = new Release();

        rel.save(first);
        rel.save(second);
        rel.save(third);
        rel.save(four);
        rel.save(fifth);
        rel.save(six);
        rel.save(seven);
        rel.save(eight);
        rel.save(nine);
        rel.save(ten);

        Film[] expected = {first, second, third, four, fifth, six, seven, eight, nine, ten};
        Film[] actual = rel.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    void getAllMaximum2() {
        Film first = new Film(1);
        Film second = new Film(2);
        Film third = new Film(3);
        Film fourth = new Film(4);
        Film fifth = new Film(5);


        Release rel = new Release(5);
        rel.save(first);
        rel.save(second);
        rel.save(third);
        rel.save(fourth);
        rel.save(fifth);


        Film[] expected = {fifth,fourth,third,second,first};
        Film[] actual = rel.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void limit() {
        Film first = new Film(1);
        Film second = new Film(2);
        Film third = new Film(3);
        Film four = new Film(4);
        Film fifth = new Film(5);
        Film six = new Film(6);
        Film seven = new Film(7);
        Film eight = new Film(8);
        Film nine = new Film(9);
        Film ten = new Film(10);

        Release rel = new Release(5);

        rel.save(first);
        rel.save(second);
        rel.save(third);
        rel.save(four);
        rel.save(fifth);
        rel.save(six);
        rel.save(seven);
        rel.save(eight);
        rel.save(nine);
        rel.save(ten);

        Film[] expected = {ten,nine,eight,seven,six};
        Film[] actual = rel.findLast();
        assertArrayEquals(expected, actual);
    }
}
