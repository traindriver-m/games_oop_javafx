package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest extends TestCase {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Assert.assertEquals(bishopBlack.position(), Cell.C8);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        BishopBlack newBishop = (BishopBlack) bishopBlack.copy(Cell.B7);
        Assert.assertEquals(newBishop.position(), Cell.B7);
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(cells, bishopBlack.way(Cell.G5));
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertThat(bishopBlack.isDiagonal(bishopBlack.position(), Cell.F6), is(true) );
        Assert.assertThat(bishopBlack.isDiagonal(bishopBlack.position(), Cell.C5), is(false) );
    }
}