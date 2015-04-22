import com.hillel.java.javahome.StringArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by АЛЕКСЕЙ on 21.04.2015.
 */
public class StringArrayTest {

    @Test
    public void sizeTest() {
        StringArray array = new StringArray();
        assertEquals(0, array.size());
        array.add("A");
        assertEquals(1, array.size());
        array.add("B");
        array.add("C");
        assertEquals(3, array.size());
    }

    @Test
    public void toStringTest() {
        StringArray array = new StringArray();
        assertEquals("[]", array.toString());
        array.add("A");
        assertEquals("[A]", array.toString());
        array.add("B");
        array.add("C");
        assertEquals("[A, B, C]", array.toString());
    }

    @Test
    public void equalityTest() {
        StringArray one = new StringArray();
        assertTrue("Not self equal", one.equals(one));
        StringArray other = new StringArray();
        assertTrue("Empty lists aren't equal", one.equals(other));
        one.add("A");
        assertFalse("Different lists are equal", one.equals(other));
        other.add("A");
        one.add("B");
        one.add("C");
        other.add("B");
        other.add("C");
        assertTrue("Not empty lists aren't equal", one.equals(other));
    }

    @Test
    public void insertTest() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        array.add("C");
        array.insert(1, "AA");
        assertEquals(4, array.size());     // размер должен измениться
        assertEquals("A", array.get(0));   // индекс предыдущих элементов не изменился
        assertEquals("AA", array.get(1));   // изменен элемент с индексом вставки
        assertEquals("B", array.get(2));   // индекс следующего элементов изменился
        assertEquals("[A, AA, B, C]", array.toString());
        assertEquals("C", array.get(3));
        array.insert(1, "AA");
        assertEquals(5, array.size());
        assertEquals("A", array.get(0));
        assertEquals("AA", array.get(1));
        assertEquals("AA", array.get(2));
        assertEquals("B", array.get(3));
        assertEquals("C", array.get(4));


    }

    @Test
    public void removeTest() {
        StringArray array = new StringArray();
        array.add("A");
        array.add("B");
        array.add("C");
        String removedElement = array.remove(1);
        assertEquals("B", removedElement); // удалён правильный элемент
        assertEquals(2, array.size());     // размер должен измениться
        assertEquals("A", array.get(0));   // индекс предыдущих элементов не изменился
        assertEquals("C", array.get(1));   // индекс следующих элементов сместился
        removedElement = array.remove(0);
        assertEquals("A", removedElement); // удалён правильный элемент
        assertEquals(1, array.size());     // размер должен измениться
        assertEquals("C", array.get(0));   // индекс предыдущих элементов не изменился


    }
}