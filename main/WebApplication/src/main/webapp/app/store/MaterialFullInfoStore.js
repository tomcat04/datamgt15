Ext.define('app.store.MaterialFullInfoStore', {
    extend: 'Ext.data.Store',
    model: 'app.model.MaterialFullInfo',
    pageSize: 20,
    proxy: {
        type: 'rest',
        url: contextPath + '/MaterialFullInfos',
        reader: {
            type: 'json',
            root: 'datas'
        },
        writer: {
            type: 'json'
        }
    },
    autoLoad: true //表格自动加载
});


