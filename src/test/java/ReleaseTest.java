import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReleaseTest {

    @Test
    public void test() {
        Film first = new Film();
        Film second = new Film();
        Film third = new Film();
        Film four = new Film();
        Film fifth = new Film();
        Film six = new Film();
        Film seven = new Film();
        Film eight = new Film();
        Film nine = new Film();
        Film ten = new Film();

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
        Film first = new Film();
        Film second = new Film();
        Film third = new Film();
        Film fourth = new Film();
        Film fifth = new Film();


        Release rel = new Release(4);
        rel.save(first);
        rel.save(second);
        rel.save(third);
        rel.save(fourth);
        rel.save(fifth);


        Film[] expected = {fourth,third,second,first};
        Film[] actual = rel.getAll();

        assertArrayEquals(expected, actual);
    }
}
