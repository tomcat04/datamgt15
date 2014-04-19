Ext.define('app.store.MaterialFullInfoStore', {
    extend: 'Ext.data.Store',
    model: 'app.model.MaterialFullInfo',
    pageSize: 20,
    proxy: {
        type: 'ajax',
        url: '/WebApplication/app/data/MaterialFullInfoData.json',
        reader: {
            type: 'json',
            root: 'pageBean.list',
            totalProperty: 'pageBean.total'
        }
    },
   autoLoad: true //表格自动加载
});


