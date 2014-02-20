/* 
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

Ext.define("app.store.MaterialExceptionLogStore", {
    model: 'app.model.MaterialExceptionLogModel',
    extend: "Ext.data.Store",
    pageSize: 20,
    proxy: {
        type: 'ajax',
        url: '/data/MaterialExceptionLogData.json',
        reader: {
            type: 'json',
            root: 'pageBean.list',
            totalProperty: 'pageBean.total'
        }
    },
    autoLoad: false
});
