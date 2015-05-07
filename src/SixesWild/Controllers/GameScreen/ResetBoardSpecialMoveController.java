package SixesWild.Controllers.GameScreen;

import SixesWild.Controllers.ViewBadgeScreen.ResetBadgeButtonController;
import SixesWild.Moves.SpecialMoves.ClearTileSpecialMove;
import SixesWild.Moves.SpecialMoves.ResetBoardSpecialMove;
import SixesWild.Views.Application;
import SixesWild.Views.Components.StyledButton;
import SixesWild.Views.Components.SpecialMoveNavigationBar;

import java.awt.event.MouseEvent;

public class ResetBoardSpecialMoveController extends SpecialMoveButtonController {

    public ResetBoardSpecialMoveController(StyledButton button, SpecialMoveNavigationBar specialMoveNavigationBar, Application app) {
        super(button, specialMoveNavigationBar, app);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mousePressed(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (specialMoveNavigationBar.getSpecialMoveLeft().getResetBoardSpecialMoveLetf().getValue() > 0) {
            super.mouseEntered(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (specialMoveNavigationBar.getSpecialMoveLeft().getResetBoardSpecialMoveLetf().getValue() > 0) {
            ResetBoardSpecialMove move = new ResetBoardSpecialMove(app.getGameScreen().getGridView().getGrid());
        } else {
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }
}