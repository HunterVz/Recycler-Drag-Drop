package com.hunter.dragdrop.itemtouchhelp;

import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * @author：xinyu.zhou
 * @version: 2016/12/5 10:17
 * @ClassName:
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 */
public interface ItemTouchViewHelper {

    /**
     * Called when the {@link ItemTouchHelper} first registers an item as being moved or swiped.
     * Implementations should update the item view to indicate it's active state.
     */
    void onItemSelected();



    /**
     * Called when the {@link ItemTouchHelper} has completed the move or swipe, and the active item
     * state should be cleared.
     */
    void onItemClear();

}
