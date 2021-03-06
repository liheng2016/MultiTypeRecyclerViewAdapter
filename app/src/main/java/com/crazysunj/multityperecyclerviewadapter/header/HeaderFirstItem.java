package com.crazysunj.multityperecyclerviewadapter.header;

import com.crazysunj.multityperecyclerviewadapter.helper.SimpleHelper;
import com.crazysunj.multityperecyclerviewadapter.sticky.FirstStickyItem;

/**
 * Created by sunjian on 2017/3/28.
 */

public class HeaderFirstItem implements FirstStickyItem {

    private String name;
    private long id;
    private String stickyName = "第一条粘性";

    public HeaderFirstItem(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getHeaderId() {
        return 1;
    }

    @Override
    public int getItemType() {
        return SimpleHelper.TYPE_ONE - 1000;
    }

    @Override
    public String getStickyName() {
        return stickyName;
    }
}
