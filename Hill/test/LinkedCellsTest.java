import com.hillel.java.oopBasics.LinkedCells;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by KRAB on 17.04.2015.
 */
public class LinkedCellsTest {

    @Test
    public void sizeTest() {
        LinkedCells myCells = new LinkedCells();
        assertEquals(0, myCells.size());
        myCells.add("A");
        assertEquals(1, myCells.size());
        myCells.add("B");
        myCells.add("C");
        assertEquals(3, myCells.size());
    }


    @Test
    public void getTest() {
        LinkedCells myCells = new LinkedCells();
        myCells.add("A");
        myCells.add("B");
        myCells.add("C");
        myCells.add("D");
        assertEquals("A", myCells.get(0));
        assertEquals("D", myCells.get(3));


    }

    @Test
    public void removeTest() {
        LinkedCells myCells = new LinkedCells();
        assertEquals(0, myCells.size());
        myCells.add("A");
        assertEquals(1, myCells.size());
        myCells.add("B");
        myCells.add("C");
        myCells.add("D");
        assertEquals(4, myCells.size());
        assertEquals("[A,B,C,D]", myCells.toString());
        String removed = myCells.remove(2);
        assertEquals("C", removed);
        assertEquals(3, myCells.size());
        assertEquals("[A,B,D]", myCells.toString());
        removed = myCells.remove(0);
        assertEquals("A", removed);
        assertEquals(2, myCells.size());
        assertEquals("[B,D]", myCells.toString());

    }

    @Test
    public void insertTest() {
        LinkedCells myCells = new LinkedCells();
        assertEquals(0, myCells.size());
        myCells.add("A");
        assertEquals(1, myCells.size());
        myCells.add("B");
        myCells.add("C");
        assertEquals("[A,B,C]", myCells.toString());
        assertEquals(3, myCells.size());
        myCells.insert(2, "D");
        assertEquals("[A,B,D,C]", myCells.toString());
        assertEquals(4, myCells.size());
        myCells.insert(1, "1");
        assertEquals("[A,1,B,D,C]", myCells.toString());
        assertEquals(5, myCells.size());
        myCells.insert(4, "5");
        assertEquals("[A,1,B,D,5,C]", myCells.toString());
        assertEquals(6, myCells.size());
        myCells.insert(0, "0");
        assertEquals("[0,A,1,B,D,5,C]", myCells.toString());
        assertEquals(7, myCells.size());

    }


}
