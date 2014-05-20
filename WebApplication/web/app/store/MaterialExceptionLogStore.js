Ext.define("app.store.MaterialExceptionLogStore", {
    model: 'app.model.MaterialExceptionLogModel',
    extend: "Ext.data.Store",
    pageSize: 20,
    proxy: {
        type: 'rest',
        url: contextPath+'/MaterialExceptionLogs',
        reader: {
            type: 'json',
            root: 'pageBean.list',
            totalProperty: 'pageBean.total'
        },
        writer: {
            type: 'json'
        }
    },
    autoLoad: false //表格自动加载
});
