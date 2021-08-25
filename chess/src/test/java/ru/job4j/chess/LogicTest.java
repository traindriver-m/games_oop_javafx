package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;


public class LogicTest {

    // @Ignore
    @Test(expected = ImpossibleMoveException.class)
    public void impossibleMovie() throws ImpossibleMoveException, FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.C6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void notFound()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.move(Cell.C8, Cell.H6);
    }

    @Test(expected = OccupiedCellException.class)
    public void movieOccupied() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new PawnBlack(Cell.B7));
        logic.move(Cell.C8, Cell.A6);
    }

    @Test
    public void movie() throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.move(Cell.C8, Cell.B7);
    }
}