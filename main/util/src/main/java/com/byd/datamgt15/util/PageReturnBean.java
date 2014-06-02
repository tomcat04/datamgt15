/*
 * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
 * CopyRight © BYD Company Limited. All rights reserved.
 */
package com.byd.datamgt15.util;

import java.util.List;

/**
 *
 * @since 2014-05-20
 * @author Tian Yu <tian.yu5@byd.com>
 * @version V1.5
 */
public class PageReturnBean {

    private Integer total;
    private List datas;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getDatas() {
        return datas;
    }

    public void setDatas(List datas) {
        this.datas = datas;
    }

}
