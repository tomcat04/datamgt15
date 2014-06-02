Ext.define('app.controller.MaterialExceptionLogGridController', {
    extend: 'Ext.app.Controller',
    init: function() {
        this.control({
            'button[id=MaterialExceptionLog_SearchBtn]': {
                click: function() {
                    var materialCode = Ext.ComponentQuery.query("textfield[id=MaterialExceptionLog_materialCode]")[0].getValue();
                    var store =  Ext.StoreManager.lookup('MaterialExceptionLogStore');
                    store.getProxy().setExtraParam('materialCode',materialCode);
                    store.load();
                }
            },
            'button[id=MaterialExceptionLog_AddBtn]': {
                click: function() {
                    alert('add');
                }
            }
        });
    },
    views: ['MaterialExceptionLogGrid'],
    stores: ['MaterialExceptionLogStore'],
    models: ['MaterialExceptionLogModel']
});


