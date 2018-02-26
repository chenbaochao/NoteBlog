package me.wuwenbin.noteblog.v3.model.frontend.bo;

import lombok.Getter;
import lombok.Setter;
import me.wuwenbin.modules.pagination.query.model.BasicTableQuery;
import me.wuwenbin.modules.pagination.sort.Sorting;

/**
 * created by Wuwenbin on 2018/2/8 at 17:08
 */
@Getter
@Setter
public class MessageListBo extends BasicTableQuery {

    @Override
    public Sorting getSortingInfo() {
        return Sorting.desc("post");
    }
}
