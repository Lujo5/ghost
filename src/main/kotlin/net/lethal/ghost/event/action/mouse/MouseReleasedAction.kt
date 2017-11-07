package net.lethal.ghost.event.action.mouse

import net.lethal.ghost.event.action.AbstractAction
import net.lethal.ghost.event.action.Action
import net.lethal.ghost.event.action.ActionType

class MouseReleasedAction : AbstractAction(), Action {
    override val type: ActionType = ActionType.MOUSE_RELEASED

    override fun execute() {
    }
}