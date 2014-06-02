Ext.define("app.store.MenuStore", {
    extend: "Ext.data.TreeStore",
    root: {
        expanded: true
    },
    proxy: {
        type: 'ajax',
        url: '/WebApplication/data/MenuData.json'
    },
    autoLoad: true //表格自动加载
});